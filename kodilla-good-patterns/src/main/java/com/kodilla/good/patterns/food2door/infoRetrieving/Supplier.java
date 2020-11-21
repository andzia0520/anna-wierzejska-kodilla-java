package com.kodilla.good.patterns.food2door.infoRetrieving;

import java.util.List;

public class Supplier {
    String name;
    String address;

    public Supplier(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (!name.equals(supplier.name)) return false;
        return address.equals(supplier.address);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}

