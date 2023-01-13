package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testNamedQueries(){
        //given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();

        //when
        List<Employee> employeeBySurname = employeeDao.retrieveEmployeeBySurname("Smith");

        //then
        try{
            assertEquals(1, employeeBySurname.size());
        } finally {
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(stephanieClarcksonId);
            employeeDao.deleteById(lindaKovalskyId);
        }

    }
}
