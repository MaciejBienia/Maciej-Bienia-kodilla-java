package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(1.9, 1.4);
            System.out.println("Done!");

        } catch (Exception e) {

            System.out.println("Not expected numbers given! Error: " + e);

        }
    }

}