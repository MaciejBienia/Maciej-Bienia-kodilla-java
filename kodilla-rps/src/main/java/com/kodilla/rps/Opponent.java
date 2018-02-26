package com.kodilla.rps;
import java.util.Random;

import static com.kodilla.rps.PlayerDialogs.PAPER;
import static com.kodilla.rps.PlayerDialogs.ROCK;
import static com.kodilla.rps.PlayerDialogs.SCISSORS;

public class Opponent {

    public String opponentChoice() {

        Random generator = new Random();
        String theOpponentChoice = String.valueOf(generator.nextInt(3) + 1);

        if (theOpponentChoice.equals("1")) {
            theOpponentChoice = ROCK;
        } else if(theOpponentChoice.equals("2")) {
            theOpponentChoice = PAPER;
        } else if(theOpponentChoice.equals("3")) {
            theOpponentChoice = SCISSORS;
        }
        return theOpponentChoice;
    }
}