package com.kodilla.rps;

import java.util.Scanner;

public class PlayerDialogs {

    public final static String GET_NAME = "            !!! WITAJ W GRZE KAMIEŃ PAPIER NOŻYCE !!! \nKamień " +
            "zgniata nożyce, papier przykrywa kamień, nożyce tną papier.\n\nPodaj swoje imię: ";

    public final static String INSTRUCTION = "\nKlawisz 1 - zagranie [KAMIEŃ] \nKlawisz 2 - zagranie [PAPIER] " +
            "\nKlawisz 3 - zagranie [NOŻYCE] \nKlawisz x - zakończenie gry \nKlawisz n - uruchomienie gry od nowa";

    public final static String ASK_ROUNDS_QUANTITY = "\nPodaj ilość wygranych rund po których następuje ostateczne " +
            "zwycięstwo danego gracza: ";

    public final static String FINISH_CURRENT_GAME_QUESTION = "Czy na pewno zakończyć aktualną grę? Wciśnij t jeśli " +
            "tak, n jeśli nie.";

    public final static String FINISH_GAME_QUESTION = "Czy na pewno zakończyć grę? Wciśnij t jeśli tak, n jeśli nie.";

    public final static String ROCK = "[KAMIEŃ]";
    public final static String PAPER = "[PAPIER]";
    public static String SCISSORS = "[NOŻYCE]";

    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GET_NAME);
        String playerName = scanner.nextLine();
        return playerName;
    }
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(ASK_ROUNDS_QUANTITY);
            try {
                String s = scanner.nextLine();
                int numberOfRounds = Integer.parseInt(s);
                if (numberOfRounds < 1) {
                    System.out.println("Podaj wartość większą od 0!");
                } else {
                    return numberOfRounds;
                }
            } catch(Exception e) {
                System.out.println("Podaj poprawną liczbę!");
            }
        }
    }
}
