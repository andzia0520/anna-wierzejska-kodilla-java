package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ThIs iS mOdUl SeVeN.", text -> text.toUpperCase());
        poemBeautifier.beautify("Maybe JaVa iS not sO difficulT.", text -> text.toLowerCase());
        poemBeautifier.beautify("   It is...   ", text -> text.trim());
        poemBeautifier.beautify("Task done?", text -> "* " + text + " *");


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
