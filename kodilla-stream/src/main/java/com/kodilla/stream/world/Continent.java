package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final Country country;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continentName, final Country country) {
        this.continentName = continentName;
        this.country = country;
    }
}
