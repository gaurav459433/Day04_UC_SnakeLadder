package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to Snake Ladder Problem");
        System.out.println();
        int Singleplayer = 0;
        System.out.println("Starting position of Single Player is: " + Singleplayer);

        int SingleplayerRolls = random.nextInt(6) + 1;
        int a = random.nextInt(3);
        System.out.println();
        System.out.println("The Player rolls the die & get a number: " + SingleplayerRolls);
        if (a == 0) {
            System.out.println("No play - stays in the same position");
        }
        if (a == 1) {
            Singleplayer += SingleplayerRolls;
            System.out.println("Gets Ladder & Player moves ahead by number of position: " + SingleplayerRolls);
            System.out.println("Player current position: " + Singleplayer);
        }
        if (a == 2) {
            Singleplayer -= SingleplayerRolls;
            System.out.println("Snake bytes & Player moves Behind by number of position: " + "-" + SingleplayerRolls);
            System.out.println("Player current position: " + Singleplayer);
        }
    }
}
