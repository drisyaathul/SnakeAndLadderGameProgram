package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("*** Welcome To Snake And Ladder Game ***");
        System.out.println("Let Start the Game SNAKE AND LADDER");

//UC1:Single Player at Start Position.
        int player1Position = 0;
        System.out.println("Player1 at Start Position Zero");

//UC2: Using RANDOM to get the number between 1 - 6.
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Player1 rolls the die to get a number : "+dice);

    }
}
