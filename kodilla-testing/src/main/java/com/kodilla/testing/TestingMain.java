package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int addingResult = calculator.addAToB();
        if(addingResult == 38) {
            System.out.println("Addingtest OK");
        } else {
            System.out.println("Error");
        }

        int subtractResult = calculator.subtractBFromA();
        if(subtractResult == 12) {
            System.out.println("Subtractest OK");
        } else {
            System.out.println("Error");
        }
    }
}
