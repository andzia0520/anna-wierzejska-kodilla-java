package com.kodilla.good.patterns.challenges.orderService;

public class Customer {
    private String name;
    private String surname;
    private String adress;

    public Customer(String name, String surname, String adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }
}
