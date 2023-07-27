package com.qa.enums;

import com.qa.oop.classExercise.UserInput;

import java.util.Random;

public class RockPaperScissorsGame {
    private Random random = new Random();
    private UserInput userInput = new UserInput(System.in);

    private GameChoice getUserChoice(){
        GameChoice userChoice = null;

        while (userChoice == null ) {
            System.out.println("Please choose 'rock', 'paper', or 'scissors'.");

            switch (userInput.getString()) {

                case "rock": userChoice = GameChoice.ROCK;
                    break;

                case "paper":
                    userChoice = GameChoice.PAPER;
                    break;

                case "scissors":
                    userChoice = GameChoice.SCISSORS;
                    break;
            }
        }
        return userChoice;
    }

    private GameChoice getCpuChoice(){
        return GameChoice.values()[random.nextInt(3)];
    }

    public Outcome playRound(){
        GameChoice userChoice = getUserChoice();
        GameChoice cpuChoice = getCpuChoice();

        System.out.println("User Choice: "+ userChoice + "   CPU Choice: "+ cpuChoice);

        if (userChoice == cpuChoice ) return Outcome.DRAW;

        if (( userChoice == GameChoice.PAPER && cpuChoice == GameChoice.ROCK )||
                (userChoice == GameChoice.SCISSORS && cpuChoice == GameChoice.PAPER)||
                (userChoice == GameChoice.ROCK && cpuChoice == GameChoice.SCISSORS)){
            return  Outcome.USER_WIN;
        } else {
            return Outcome.CPU_WIN;
        }

    }
}
