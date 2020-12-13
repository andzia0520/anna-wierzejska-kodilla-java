/*
package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
        }
    }

    @Test
    public void testNamedQueriesWithGivenLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee marthaSmith = new Employee("Martha", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company sofastic = new Company("Sofastic");

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeDao.save(marthaSmith);
        int marthaSmithId = marthaSmith.getId();
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyDao.save(sofastic);
        int sofasticId = sofastic.getId();

        //When
        List<Employee> withGivenLastName = employeeDao.retrieveEmployeeWithGivenLastName("Smith");
        List<Company> withNameBeginningWith = companyDao.retrieveCompaniesWithNameBeginningWith("Sof");
        List<String> firstNamesOfSmiths = withGivenLastName.stream()
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
        List<String> companiesBeginningWithSof = withNameBeginningWith.stream()
                .map(Company::getName)
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(2, withGivenLastName.size());
        //Assert.assertEquals(2, withNameBeginningWith.size());
        Assert.assertTrue(firstNamesOfSmiths.contains("John"));
        Assert.assertTrue(firstNamesOfSmiths.contains("Martha"));
        Assert.assertFalse(firstNamesOfSmiths.contains("Linda"));
       */
/* Assert.assertTrue(companiesBeginningWithSof.contains("Sofastic"));
        Assert.assertTrue(companiesBeginningWithSof.contains("Software Machine"));
        Assert.assertFalse(companiesBeginningWithSof.contains("Data Maesters"));*//*


        //CleanUp
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieClarcksonId);
        employeeDao.deleteById(marthaSmithId);
        employeeDao.deleteById(lindaKovalskyId);
       */
/* companyDao.deleteById(sofasticId);
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(greyMatterId);
        companyDao.deleteById(dataMaestersId);*//*

    }

    @Test
    public void testNamedQueryRetrieveEmployeeWithGivenPhraseInLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smarth");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee marthaSmith = new Employee("Martha", "Smith");

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeDao.save(marthaSmith);
        int marthaSmithId = marthaSmith.getId();

        //When
        List<Employee> employeesWithGivenPhraseInLastName = employeeDao.retrieveEmployeeWithGivenPhraseInLastName("%sm%");
        List<String> fullNames = employeesWithGivenPhraseInLastName.stream()
                .map(Employee::getLastName)
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(2, employeesWithGivenPhraseInLastName.size());
        Assert.assertTrue(fullNames.contains("Smith"));
        Assert.assertTrue(fullNames.contains("Smarth"));
        Assert.assertFalse(fullNames.contains("Clarckson"));

        //CleanUp
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(stephanieClarcksonId);
        employeeDao.deleteById(marthaSmithId);
        employeeDao.deleteById(lindaKovalskyId);
    }

    @Test
    public void testNamedQueryRetrieveCompaniesWithGivenPhraseInName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company sofastic = new Company("Sofastic");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyDao.save(sofastic);
        int sofasticId = sofastic.getId();

        //When
        List<Company> companiesWithGivenPhraseInName = companyDao.retrieveCompaniesWithGivenPhraseInName("%ma%");
        List<String> fullNames = companiesWithGivenPhraseInName.stream()
                .map(Company::getName)
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(3, companiesWithGivenPhraseInName.size());
        Assert.assertTrue(fullNames.contains("Maesters"));
        Assert.assertTrue(fullNames.contains("Machine"));
        Assert.assertTrue(fullNames.contains("Matter"));
        Assert.assertFalse(fullNames.contains("Sofastic"));

        //CleanUp
        companyDao.deleteById(sofasticId);
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(greyMatterId);
        companyDao.deleteById(dataMaestersId);
    }
}

*/
