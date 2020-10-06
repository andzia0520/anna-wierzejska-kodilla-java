package com.kodilla.good.patterns.food2door.infoRetrieving;

import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.order.OrderProposal;

import java.util.ArrayList;
import java.util.List;

public class OrderProposalRetriever {
    public OrderProposal retrieve() {
        Product bread = new Product("bread", 3.2);
        Product sausage = new Product("sausage", 25.50);
        Product butter = new Product("butter", 4.35);
        Product milk = new Product("milk", 2.35);
        Product wholemealBread = new Product("wholemeal bread", 4.35);
        Product flour = new Product("flour", 2.95);

        List<Product> productsOfferExtraFoodShop = new ArrayList<>();
        productsOfferExtraFoodShop.add(bread);
        productsOfferExtraFoodShop.add(wholemealBread);

        Supplier extraFoodShop = new Supplier("Extra Food Shop", "Warsaw", productsOfferExtraFoodShop);

        Order orderExtraFoodShop = new Order(extraFoodShop, bread, 3);
        return new OrderProposal(orderExtraFoodShop);
    }
}
