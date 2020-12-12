package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
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
public class SearcherFacadeTestSuite {
    @Autowired
    private SearcherFacade searcherFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testFindEmployeesWhoseLastNameContainsPhrase() {
        //Given
        employeeDao.save(new Employee("John", "Smarth"));
        employeeDao.save(new Employee("Stephanie", "Clarckson"));
        employeeDao.save(new Employee("Linda", "Kovalsky"));
        employeeDao.save(new Employee("Martha", "Smith"));

        //When
        List<Employee> employeesWithGivenPhraseInLastName = searcherFacade.findEmployeesWhoseLastNameContainsPhrase("Sm");
        List<String> fullNames = employeesWithGivenPhraseInLastName.stream()
                .map(Employee::getLastName)
                .collect(Collectors.toList());
        List<Employee> employeesWithGivenPhraseInLastNameError = searcherFacade.findEmployeesWhoseLastNameContainsPhrase("Svi");

        //Then
        Assert.assertEquals(2, employeesWithGivenPhraseInLastName.size());
        Assert.assertTrue(fullNames.contains("Smith"));
        Assert.assertTrue(fullNames.contains("Smarth"));
        Assert.assertFalse(fullNames.contains("Clarckson"));
        Assert.assertEquals(0, employeesWithGivenPhraseInLastNameError.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCompaniesWhoseNameContainsPhrase() {
        //Given
        companyDao.save(new Company("Software Machine"));
        companyDao.save(new Company("Data Maesters"));
        companyDao.save(new Company("Grey Matter"));
        companyDao.save(new Company("Sofastic"));

        //When
        List<Company> companiesWithGivenPhraseInName = searcherFacade.findCompaniesWhoseNameContainsPhrase("Ma");
        List<String> fullNames = companiesWithGivenPhraseInName.stream()
                .map(Company::getName)
                .collect(Collectors.toList());
        List<Company> companiesWithGivenPhraseInNameError = searcherFacade.findCompaniesWhoseNameContainsPhrase("Rar");

        //Then
        Assert.assertEquals(3, companiesWithGivenPhraseInName.size());
        Assert.assertTrue(fullNames.contains("Software Machine"));
        Assert.assertTrue(fullNames.contains("Data Maesters"));
        Assert.assertFalse(fullNames.contains("Sofastic"));
        Assert.assertEquals(0, companiesWithGivenPhraseInNameError.size());

        //CleanUp
        companyDao.deleteAll();
    }
}
