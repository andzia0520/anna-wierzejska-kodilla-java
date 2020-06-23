package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import static jdk.nashorn.internal.objects.NativeString.*;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ThIs iS mOdUl SeVeN.", (text) -> toUpperCase(text));
        poemBeautifier.beautify("Maybe JaVa iS not sO difficulT.", (text) -> toLowerCase(text));
        poemBeautifier.beautify("   It is...   ", (text) -> trim(text));
        poemBeautifier.beautify("Task done?", (text) -> "* " + text + " *");
    }
}
