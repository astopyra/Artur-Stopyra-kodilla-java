package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testContext(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        //when & then
        System.out.println("===== Beans lists: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<<===== Bean list ====");
    }

    @Test
    public void testLoadFromDb() {
        //Given
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

}
