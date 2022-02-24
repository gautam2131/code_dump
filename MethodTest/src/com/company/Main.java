package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Gautam", calculateHighScorePosition(1000));
        displayHighScorePosition("tim", calculateHighScorePosition(900));
        displayHighScorePosition("tom", calculateHighScorePosition(400));
        displayHighScorePosition("mom", calculateHighScorePosition(50));


    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println( playerName+"  managed to get into position "
                + playerPosition + " on the highscore table");


    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position =4;

        if(score>=1000){
            position=1;
        }
        else if(score>=500){
            position =2;
        }
        else if (score>=100){
            position =3;
        }
        return position;


    }
}
