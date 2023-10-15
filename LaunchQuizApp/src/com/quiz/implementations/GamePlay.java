package com.quiz.implementions;

import com.quiz.service.AdvancedQuiz;
import com.quiz.service.BegineerQuiz;

import java.util.Scanner;

public class GamePlay {
    public void playGame(){
        Player1 p1 = new Player1();
        p1.playerName();
        System.out.println("Hi " + p1.playerName + ",Lets start the Quiz!!!!!");
        System.out.println("Select anyone category of quiz!!!");
        System.out.println("1. Beginner Level Quiz");
        System.out.println("2. Advanced Level Quiz");
        Scanner sc1 = new Scanner(System.in);
        int quizOpt = sc1.nextInt();
        if (quizOpt == 1) {
            BegineerQuiz bz = new BegineerQuiz();
            bz.playQuiz(quizOpt);
            int Result = bz.validateResult();
            System.out.println("Hey " + p1.playerName + ", your score is: " + Result + " out of 10!!!");
        }
        else if (quizOpt == 2) {
            AdvancedQuiz bz = new AdvancedQuiz();
            bz.playQuiz(quizOpt);
            int Result = bz.validateResult();
            System.out.println("Hey " + p1.playerName + ", your score is: " + Result + " out of 25!!!");
        }
        else {
            System.out.println("Invalid option is selected, pls try again!!!");
            playGame();
        }
    }
}
