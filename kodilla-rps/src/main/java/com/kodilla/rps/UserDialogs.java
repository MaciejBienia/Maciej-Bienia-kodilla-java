package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(Game.ASK_ROUNDS_QUANTITY);
            try {
                String s = scanner.nextLine();
                int numberOfRounds = Integer.parseInt(s);
                if (numberOfRounds < 1) {
                    System.out.println("Podaj wartość większą od 0!");
                } else {
                    return numberOfRounds;
                }
            } catch(Exception e) {
                System.out.println("Podaj poprawną liczbę");
            }
        }
    }
}
