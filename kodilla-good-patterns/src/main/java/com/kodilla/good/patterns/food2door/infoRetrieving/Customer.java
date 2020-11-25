package com.kodilla.good.patterns.food2door.infoRetrieving;

public class Customer {
    private final String name;
    private final String Email;

    public Customer(String name, String email) {
        this.name = name;
        Email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!name.equals(customer.name)) return false;
        return Email.equals(customer.Email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
