package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to Sanke Ladder Problem");
        System.out.println();
        int Singleplayer=0;
        System.out.println("Starting position of Single Player is: "+Singleplayer);
        int SingleplayerRolls= random.nextInt(6)+1;
        System.out.println("The Player rolls the die & get a number: "+SingleplayerRolls);
    }
}
