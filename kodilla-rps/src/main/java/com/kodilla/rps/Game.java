package com.kodilla.rps;
import java.util.Scanner;

import static com.kodilla.rps.PlayerDialogs.PAPER;
import static com.kodilla.rps.PlayerDialogs.ROCK;
import static com.kodilla.rps.PlayerDialogs.SCISSORS;

public class Game {
    private String playerName;
    private int numberOfRounds;
    private int roundsCounter = 0;

    Scanner scanner = new Scanner(System.in);
    Opponent opponent = new Opponent();
    Referee referee = new Referee();


    public void run() {
        this.playerName = PlayerDialogs.getPlayerName();
        this.numberOfRounds = PlayerDialogs.getNumberOfRounds();
        System.out.println("\n" + playerName + PlayerDialogs.INSTRUCTION);

        while(referee.getUserScore() < numberOfRounds && referee.getOpponentScore() < numberOfRounds) {
            roundsCounter++;
            System.out.println("\nRunda " + roundsCounter);
            System.out.println("Wybierz swoje zagranie: ");
            String choice = scanner.next().toUpperCase();
            String opponentChoice = opponent.opponentChoice();

            if(choice.equals("1")) {
                choice = ROCK;
            } else if(choice.equals("2")) {
                choice = PAPER;
            } else if(choice.equals("3")) {
                choice = SCISSORS;
            } else if(choice.equals("N")) {
                System.out.println(PlayerDialogs.FINISH_CURRENT_GAME_QUESTION);
                String newGame = scanner.next().toUpperCase();
                if(newGame.equals("T")) {
                    new Game().run();
                }
            } else if(choice.equals("X")) {
                System.out.println(PlayerDialogs.FINISH_GAME_QUESTION);
                String finish = scanner.next().toUpperCase();
                if(finish.equals("T")) {
                    System.exit(0);
                }
            } else {
                System.out.println("Wprowadź dane zgodne z instrukcją!");
            }
            referee.compare(choice, opponentChoice);
            System.out.println("\n[" + playerName + " - Komputer]: \n     [" + referee.getUserScore() + " : "
                    + referee.getOpponentScore() + "]");
        }
        if (referee.getUserScore() == numberOfRounds) {
            System.out.println("\n!!! WYGRAŁEŚ W CAŁEJ GRZE !!!");
        } else if (referee.getOpponentScore() == numberOfRounds) {
            System.out.println("\n!!! GRĘ WYGRAŁ KOMPUTER !!!");
        }
    }
}