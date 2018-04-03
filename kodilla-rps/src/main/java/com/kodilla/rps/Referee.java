package com.kodilla.rps;
import static com.kodilla.rps.PlayerDialogs.PAPER;
import static com.kodilla.rps.PlayerDialogs.ROCK;
import static com.kodilla.rps.PlayerDialogs.SCISSORS;

public class Referee {
    private int userScore = 0;
    private int opponentScore = 0;

    public int getUserScore() {
        return userScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    int roundsCounter = 1;
    public void compare (String userChoice, String opponentChoice) {

        String draw = "\n>>> Remis w tej rundzie <<<";
        String computerWin = "\n\n>>> Komputer wygrał w tej rundzie <<<";
        String userWin = "\n\n>>> Wygrałeś w tej rundzie <<<";
        String paperBeatsRock = "\n" + PAPER + " przykrywa " + ROCK;
        String scissorsBeatPaper = "\n" + SCISSORS + " tną " + PAPER;
        String rockBeatScissors = "\n" + ROCK + " zgniata " + SCISSORS;
        roundsCounter++;

        if(userChoice.equals(opponentChoice)) {
            System.out.println("Wybrałeś " + userChoice + " <<<>>> Komputer wybrał " + opponentChoice + draw);
        } else if(userChoice.equals(ROCK) && opponentChoice.equals(PAPER)) {
            System.out.println("Wybrałeś " + ROCK + " <<<>>> Komputer wybrał " + PAPER + paperBeatsRock + computerWin);
            opponentScore += 1;
        } else if(userChoice.equals(ROCK) && opponentChoice.equals(SCISSORS)) {
            System.out.println("Wybrałeś " + ROCK + " <<<>>> Komputer wybrał " + SCISSORS + rockBeatScissors + userWin);
            userScore += 1;
        } else if(userChoice.equals(PAPER) && opponentChoice.equals(ROCK)) {
            System.out.println("Wybrałeś " + PAPER + " <<<>>> Komputer wybrał " + ROCK + paperBeatsRock + userWin);
            userScore += 1;
        } else if(userChoice.equals(PAPER) && opponentChoice.equals(SCISSORS)) {
            System.out.println("Wybrałeś " + PAPER + " <<<>>> Komputer wybrał " + SCISSORS + scissorsBeatPaper +
                    computerWin);
            opponentScore += 1;
        } else if(userChoice.equals(SCISSORS) && opponentChoice.equals(ROCK)) {
            System.out.println("Wybrałeś " + SCISSORS + " <<<>>> Komputer wybrał " + ROCK + rockBeatScissors +
                    computerWin);
            opponentScore += 1;
        } else if(userChoice.equals(SCISSORS) && opponentChoice.equals(PAPER)) {
            System.out.println("Wybrałeś " + SCISSORS + " <<<>>> Komputer wybrał " + PAPER + scissorsBeatPaper + userWin);
            userScore += 1;
        }
    }
}