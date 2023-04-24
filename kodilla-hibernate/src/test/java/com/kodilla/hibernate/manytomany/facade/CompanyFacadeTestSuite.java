package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    CompanyFacade companyFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    void testFindCompanyByName() throws QueryException {
        //given
        Company cocaCola = new Company("Coca Cola");
        Company pepsi = new Company("Pepsi Cola");
        Company tymbark = new Company("Tymbark");

        companyDao.save(cocaCola);
        companyDao.save(pepsi);
        companyDao.save(tymbark);

        //when
        List<Company> resultCompaniesList = companyFacade.findCompanyByName("ola");

        //then
        assertEquals(2, resultCompaniesList.size());

        //cleanUp
        companyDao.deleteAll();
    }

    @Test
    void testFindEmployeeBySurname() throws QueryException {
        //given
        Employee mark = new Employee("Mark", "Down");
        Employee scott = new Employee("Scott", "Miller");
        Employee amy = new Employee("Amy", "Down");

        employeeDao.save(mark);
        employeeDao.save(scott);
        employeeDao.save(amy);

        //when
        List<Employee> resultEmployeesList = companyFacade.findEmployeeBySurname("Do");

        //then
        assertEquals(2, resultEmployeesList.size());

        //cleanUp
        employeeDao.deleteAll();
    }
}
