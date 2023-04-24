package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao){
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanyByName(String companyName) throws QueryException{
        List<Company> companies = companyDao.retrieveCompanyByName("%" + companyName + "%");
        if(companies.size() == 0){
            throw new QueryException(QueryException.COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> findEmployeeBySurname(String employeeName) throws QueryException{
        List<Employee> employees = employeeDao.retrieveEmployeeBySurname("%" + employeeName + "%");
        if(employees.size() == 0){
            throw new QueryException(QueryException.EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }

}
