package com.quiz.controller;

import com.quiz.implementions.*;


public class LaunchQuiz {
    public static void main(String[] args) {
        System.out.println("******************************************************************");
        System.out.println("Welcome to Java QUIZ Challenge");
        System.out.println("******************************************************************");
        GamePlay gs = new GamePlay();
        gs.playGame();

    }
}
