package com.kodilla.good.patterns.challenges;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().values().stream()
                .map(s -> s.toString())
                .map(s -> s.replace(", ", "!"))
                .map(s -> s.replace("]",""))
                .map(s -> s.replace("[", ""))
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}