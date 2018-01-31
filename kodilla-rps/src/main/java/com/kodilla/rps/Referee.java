package com.kodilla.rps;
import static com.kodilla.rps.Game.PAPER;
import static com.kodilla.rps.Game.ROCK;
import static com.kodilla.rps.Game.SCISSORS;

public class Referee {
    private int userScore = 0;
    private int computerScore = 0;

    public int getUserScore() {
        return userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void compare (String userChoice, String computerChoice) {

        String draw = "\n>>> Remis w tej rundzie <<<";
        String computerWin = "\n\n>>> Komputer wygrał w tej rundzie <<<";
        String userWin = "\n\n>>> Wygrałeś w tej rundzie <<<";
        String paperBeatsRock = "\n" + PAPER + " przykrywa " + ROCK;
        String scissorsBeatPaper = "\n" + SCISSORS + " tną " + PAPER;
        String rockBeatScissors = "\n" + ROCK + " zgniata " + SCISSORS;

        if(userChoice.equals(computerChoice)) {
            System.out.println("Wybrałeś " + userChoice + " <<<>>> Komputer wybrał " + computerChoice + draw);
        } else if(userChoice.equals(ROCK) && computerChoice.equals(PAPER)) {
            System.out.println("Wybrałeś " + ROCK + " <<<>>> Komputer wybrał " + PAPER + paperBeatsRock + computerWin);
            computerScore += 1;
        } else if(userChoice.equals(ROCK) && computerChoice.equals(SCISSORS)) {
            System.out.println("Wybrałeś " + ROCK + " <<<>>> Komputer wybrał " + SCISSORS + rockBeatScissors + userWin);
            userScore += 1;
        } else if(userChoice.equals(PAPER) && computerChoice.equals(ROCK)) {
            System.out.println("Wybrałeś " + PAPER + " <<<>>> Komputer wybrał " + ROCK + paperBeatsRock + userWin);
            userScore += 1;
        } else if(userChoice.equals(PAPER) && computerChoice.equals(SCISSORS)) {
            System.out.println("Wybrałeś " + PAPER + " <<<>>> Komputer wybrał " + SCISSORS + scissorsBeatPaper +
                    computerWin);
            computerScore += 1;
        } else if(userChoice.equals(SCISSORS) && computerChoice.equals(ROCK)) {
            System.out.println("Wybrałeś " + SCISSORS + " <<<>>> Komputer wybrał " + ROCK + rockBeatScissors +
                    computerWin);
            computerScore += 1;
        } else if(userChoice.equals(SCISSORS) && computerChoice.equals(PAPER)) {
            System.out.println("Wybrałeś " + SCISSORS + " <<<>>> Komputer wybrał " + PAPER + scissorsBeatPaper + userWin);
            userScore += 1;
        }
    }
}