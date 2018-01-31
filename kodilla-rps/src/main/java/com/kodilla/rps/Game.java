package com.kodilla.rps;
import java.util.Scanner;

public class Game {
    private String playerName;
    private int numberOfRounds;

    private final static String WELCOME_GET_NAME = "            !!! WITAJ W GRZE KAMIEŃ PAPIER NOŻYCE !!! \nKamień " +
            "zgniata nożyce, papier przykrywa kamień, nożyce tną papier.\n\nPodaj swoje imię: ";

    private final static String INSTRUCTION = "\nKlawisz 1 - zagranie [KAMIEŃ] \nKlawisz 2 - zagranie [PAPIER] " +
            "\nKlawisz 3 - zagranie [NOŻYCE] \nKlawisz x - zakończenie gry \nKlawisz n - uruchomienie gry od nowa";

    private final static String ASK_ROUNDS_QUANTITY = "\nPodaj ilość wygranych rund po których następuje ostateczne " +
            "zwycięstwo danego gracza: ";

    private final static String FINISH_CURRENT_GAME_QUESTION = "Czy na pewno zakończyć aktualną grę? Wciśnij t jeśli " +
            "tak, n jeśli nie";

    private final static String FINISH_GAME_QUESTION = "Czy na pewno zakończyć grę? Wciśnij t jeśli tak, n jeśli nie.";

    public final static String ROCK = "[KAMIEŃ]";
    public final static String PAPER = "[PAPIER]";
    public static String SCISSORS = "[NOŻYCE]";

    private int roundsCounter = 0;

    Scanner scanner = new Scanner(System.in);
    Computer computer = new Computer();
    Referee referee = new Referee();

    public void run() {
        System.out.println(WELCOME_GET_NAME);
        this.playerName = scanner.nextLine();
        System.out.println(ASK_ROUNDS_QUANTITY);
        this.numberOfRounds = scanner.nextInt();

        while(numberOfRounds < 1) {
            System.out.println("Podaj wartość większą od 0!");
            this.numberOfRounds = scanner.nextInt();
        }
        System.out.println("\n" + playerName + "! Oto instrukcja do gry:");
        System.out.println(INSTRUCTION);

        while(referee.getUserScore() < numberOfRounds && referee.getComputerScore() < numberOfRounds) {
            roundsCounter++;
            System.out.println("\nRunda " + roundsCounter);
            System.out.println("Wybierz swoje zagranie: ");
            String choice = scanner.next();
            String computerChoice = computer.computerChoice();

            if(choice.equals("1")) {
                choice = ROCK;
            } else if(choice.equals("2")) {
                choice = PAPER;
            } else if(choice.equals("3")) {
                choice = SCISSORS;
            } else if(choice.equals("n") || choice.equals("N")) {
                System.out.println(FINISH_CURRENT_GAME_QUESTION);
                String newGame = scanner.next();
                if(newGame.equals("t") || newGame.equals("T")) {
                    new Game().run();
                }
            } else if(choice.equals("x") || choice.equals("X")) {
                System.out.println(FINISH_GAME_QUESTION);
                String finish = scanner.next();
                if(finish.equals("t") || finish.equals("T")) {
                    System.exit(0);
                }
            } else {
                System.out.println("Wprowadź poprawne dane!");
            }
            referee.compare(choice, computerChoice);
            System.out.println("\n[" + playerName + " - Komputer]: \n     [" + referee.getUserScore() + " : "
                    + referee.getComputerScore() + "]");
        }
        if (referee.getUserScore() == numberOfRounds) {
            System.out.println("\n!!! WYGRAŁEŚ W CAŁEJ GRZE !!!");
        } else if (referee.getComputerScore() == numberOfRounds) {
            System.out.println("\n!!! GRĘ WYGRAŁ KOMPUTER !!!");
        }
    }
}