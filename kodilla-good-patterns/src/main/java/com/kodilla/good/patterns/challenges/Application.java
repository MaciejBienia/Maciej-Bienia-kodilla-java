package com.kodilla.good.patterns.challenges;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().values().stream()
                .flatMap(s -> s.parallelStream())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}