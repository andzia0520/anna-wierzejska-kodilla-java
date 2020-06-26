package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent (Continent continent) {
        continents.add(continent);
    }


    public List<BigDecimal> getPeopleQuantity() {
        return continents.stream()
                .flatMap(country -> country.getPeopleQuantity().stream())
                .map(World::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

;






    }
}
