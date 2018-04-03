package com.kodilla.rps;

import java.util.*;

public class PlayerDialogs {

    public final static String FINISH_CURRENT_GAME_QUESTION = "Czy na pewno zakończyć aktualną grę? Wciśnij t jeśli " +
            "tak, n jeśli nie.";

    public final static String FINISH_GAME_QUESTION = "Czy na pewno zakończyć grę? Wciśnij t jeśli tak, n jeśli nie.";

    public final static String PLAYER_WIN = "\n!!! WYGRAŁEŚ W CAŁEJ GRZE !!!";

    public final static String OPPONENT_WIN = "\n!!! GRĘ WYGRAŁ KOMPUTER !!!";

    public final static String CHECK_DATA_QUESTION = "Wprowadź dane zgodne z instrukcją!";

    public final static String ROCK = "[KAMIEŃ]";

    public final static String PAPER = "[PAPIER]";

    public static String SCISSORS = "[NOŻYCE]";

    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("            !!! WITAJ W GRZE KAMIEŃ PAPIER NOŻYCE !!! \nKamień " +
                "zgniata nożyce, papier przykrywa kamień, nożyce tną papier.\n\nPodaj swoje imię: ");
        String playerName = scanner.nextLine();
        return playerName;
    }
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nPodaj ilość wygranych rund po których następuje ostateczne " +
                    "zwycięstwo danego gracza: ");
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

    public static String getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz swoje zagranie: ");
        String choice = scanner.next().toUpperCase();
        if (choice.equals("1")) {
            choice = ROCK;
        } else if(choice.equals("2")) {
            choice = PAPER;
        } else if(choice.equals("3")) {
            choice = SCISSORS;
        }
        return choice;
    }

    public static void showInstruction(String playerName) {
        System.out.println("\n" + playerName + "! Oto instrukcja do gry: \n\nKlawisz 1 - zagranie [KAMIEŃ] \nKlawisz 2 " +
                "- zagranie [PAPIER] \nKlawisz 3 - zagranie [NOŻYCE] \nKlawisz x - zakończenie gry \nKlawisz n - " +
                "uruchomienie gry od nowa");
    }

    public static void displayText(String text) {
        System.out.println(text);
    }
}
