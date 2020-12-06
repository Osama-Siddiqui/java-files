package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 800, 5, 100);
        System.out.println("Your final score for completing level " + levelCompleted + " is =" + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score for completing level " + levelCompleted + " is =" + highScore);

        String player = "Chad";
        int playerScore = 1500;
        int position;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Johnny";
        playerScore = 900;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Brad";
        playerScore = 400;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Brock";
        playerScore = 50;
        position = calculateHighScorePosition(playerScore);

        displayHighScorePosition(player, position);




    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
           // System.out.println("Your final score for completing level " + levelCompleted + " is =" + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }
    }





    public static int calculateHighScorePosition (int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore <= 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore <= 500){
            return 3;
        } else { return 4;}
    }

    public static void displayHighScorePosition(String player, int position){
        System.out.println(player + " managed to get into position #" + position + " on the high score table");

    }

}





