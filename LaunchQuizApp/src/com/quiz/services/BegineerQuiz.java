package com.quiz.service;

import com.quiz.interfaces.Play;
import com.quiz.dao.QuizDao;

import java.util.Scanner;

public class BegineerQuiz extends QuizDao implements Play {
    String correctAns[] = new String[5];
    String skipAns[] = new String[5];
    String ans[] = new String[5];

    @Override
    public void playQuiz(int QuizLevel) {
        QuizDao bdao = new QuizDao();
        bdao.showQuiz(QuizLevel);
        for (int i=0; i<5; i++) {
            System.out.println("Question " + bdao.getQuestion(i).getQuestionId() + " :");
            System.out.println(bdao.getQuestion(i).getQuestionTitle());
            System.out.println("1." + bdao.getQuestion(i).getOption1());
            System.out.println("2." + bdao.getQuestion(i).getOption2());
            System.out.println("3." + bdao.getQuestion(i).getOption3());
            System.out.println("4." + bdao.getQuestion(i).getOption4());
            System.out.println("0. Skip the Question");
            correctAns[i] = bdao.getQuestion(i).getCorrectAnswerPos();
            skipAns[i] = bdao.getQuestion(i).getSkipAnswer();
            Scanner sc = new Scanner(System.in);
            ans[i] = sc.next();

        }

    }

    @Override
    public int validateResult() {
        int score = 0;
        for (int i=0; i<5; i++){
            if (ans[i].equals(skipAns[i])) {
                score += 0;
            }
            else if (ans[i].equals(correctAns[i])) {
                score += 2;
            }
            else{
                score += -1;
            }
        }
        return score;
    }
}

