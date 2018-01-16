package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Jacek ma psa", text -> "***" + text + "***");
        poemBeautifier.beautify("Paweł ma papugę", text -> ">>>" + text + "<<<");
        poemBeautifier.beautify("Ania ma królika", text -> text.toUpperCase());
        poemBeautifier.beautify("Ania ma królika", text -> text.replace("a", "A"));
    }
}