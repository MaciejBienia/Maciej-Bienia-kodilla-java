package com.kodilla.rps;
import java.util.Random;
import static com.kodilla.rps.Game.PAPER;
import static com.kodilla.rps.Game.ROCK;
import static com.kodilla.rps.Game.SCISSORS;

public class Computer {

    public String computerChoice() {

        Random generator = new Random();
        String theComputerChoice = String.valueOf(generator.nextInt(3) + 1);

        if(theComputerChoice.equals("1")) {
            theComputerChoice = ROCK;
        } else if(theComputerChoice.equals("2")) {
            theComputerChoice = PAPER;
        } else if(theComputerChoice.equals("3")) {
            theComputerChoice = SCISSORS;
        }
        return theComputerChoice;
    }
}