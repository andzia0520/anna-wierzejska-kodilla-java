package com.kodilla.hibernate.manytomany.facade;

public class SearchingProcessorException extends Exception {
    public static String ERR_COMPANY_NOTFOUND = "Company with name containing your phrase doesn't exist";
    public static String ERR_EMPLOYEE_NOTFOUND = "Employee with name containing your phrase doesn't exist";


    public SearchingProcessorException(String message) {
        super(message);
    }
}
