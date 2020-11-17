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
}

