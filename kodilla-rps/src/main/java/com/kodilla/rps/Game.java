package com.kodilla.rps;
import java.util.Scanner;

import static com.kodilla.rps.PlayerDialogs.*;

public class Game {
    private String playerName;
    private int numberOfRounds;

    Scanner scanner = new Scanner(System.in);
    Opponent opponent = new Opponent();
    Referee referee = new Referee();

    public void run() {
        this.playerName = PlayerDialogs.getPlayerName();
        this.numberOfRounds = PlayerDialogs.getNumberOfRounds();
        PlayerDialogs.showInstruction(playerName);

        while(referee.getUserScore() < numberOfRounds && referee.getOpponentScore() < numberOfRounds) {
            System.out.println("\n        Runda " + referee.roundsCounter);
            String choice = PlayerDialogs.getPlayerChoice();
            String opponentChoice = opponent.opponentChoice();

            if (choice.equals(ROCK) || choice.equals(PAPER) || choice.equals(SCISSORS)) {
                referee.compare(choice, opponentChoice);
                System.out.println("\n[" + playerName + " - Komputer]  \n     [" + referee.getUserScore() + " : "
                        + referee.getOpponentScore() + "]");
            } else if (choice.equals("N")) {
                PlayerDialogs.displayText(FINISH_CURRENT_GAME_QUESTION);
                String newGame = scanner.next().toUpperCase();
                if(newGame.equals("T")) {
                    new Game().run();
                }
            } else if(choice.equals("X")) {
                PlayerDialogs.displayText(FINISH_GAME_QUESTION);
                String finish = scanner.next().toUpperCase();
                if(finish.equals("T")) {
                    System.exit(0);
                }
            } else {
                PlayerDialogs.displayText(CHECK_DATA_QUESTION);
            }
        }
        if (referee.getUserScore() == numberOfRounds) {
            PlayerDialogs.displayText(PLAYER_WIN);
        } else if (referee.getOpponentScore() == numberOfRounds) {
            PlayerDialogs.displayText(OPPONENT_WIN);
        }
    }
}