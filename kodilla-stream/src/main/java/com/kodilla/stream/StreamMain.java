package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Jacek ma psa", text -> "***" + text + "***");
        poemBeautifier.beautify("Paweł ma papugę", text -> ">>>" + text + "<<<");
        poemBeautifier.beautify("Ania ma królika", text -> text.toUpperCase());
        poemBeautifier.beautify("Ania ma królika", text -> text.replace("a", "A"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
