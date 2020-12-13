package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearcherFacade {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearcherFacade.class);

    public List<Employee> findEmployeesWhoseLastNameContainsPhrase(String phrase) {
        LOGGER.info("We start searching all employees with " + phrase + " in lastname.");
        List<Employee> employees = employeeDao.retrieveEmployeeWithGivenPhraseInLastName("%" + phrase + "%");
        List<String> fullNames = employees.stream()
                .map(Employee::getLastName)
                .collect(Collectors.toList());
        LOGGER.info("We found following employees: " + fullNames.toString());
        if (employees.size() == 0) {
            LOGGER.error(SearchingProcessorException.ERR_EMPLOYEE_NOTFOUND);
        }
        return employees;
    }

    public List<Company> findCompaniesWhoseNameContainsPhrase(String phrase) {
        LOGGER.info("We start searching all companies with " + phrase + " in name.");
        List<Company> companies = companyDao.retrieveCompaniesWithGivenPhraseInName("%" + phrase + "%");
        List<String> fullNames = companies.stream()
                .map(Company::getName)
                .collect(Collectors.toList());
        LOGGER.info("We found following companies: " + fullNames.toString());
        if (companies.size() == 0) {
            LOGGER.error(SearchingProcessorException.ERR_COMPANY_NOTFOUND);
        }
        return companies;
    }
}
