package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ThIs iS mOdUl SeVeN.", text -> text.toUpperCase());
        poemBeautifier.beautify("Maybe JaVa iS not sO difficulT.", text -> text.toLowerCase());
        poemBeautifier.beautify("   It is...   ", text -> text.trim());
        poemBeautifier.beautify("Task done?", text -> "* " + text + " *");
    }
}
