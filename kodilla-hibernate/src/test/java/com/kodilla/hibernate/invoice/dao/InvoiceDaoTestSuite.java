package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDao(){
        //given
        Item item1 = new Item(new BigDecimal(10), 2, new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(5), 3, new BigDecimal(15));
        Item item3 = new Item(new BigDecimal(7.5), 2, new BigDecimal(15));

        Product eggs = new Product("Eggs");
        Product milk = new Product("Milk");
        Product sugar = new Product("Sugar");

        eggs.getItems().add(item1);
        milk.getItems().add(item2);
        sugar.getItems().add(item3);

        item1.setProduct(eggs);
        item2.setProduct(milk);
        item3.setProduct(sugar);

        Invoice invoice1 = new Invoice("Invoice1");
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        Invoice invoice2 = new Invoice("Invoice2");
        item3.setInvoice(invoice2);
        invoice2.getItems().add(item3);

        //when
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //then
        assertNotEquals(0, id);

        //cleanUp
        //invoiceDao.deleteById(id);

    }
}
