package com.quiz.dao;

import com.quiz.model.Questionaire;

public class QuizDao {

    Questionaire ques[] = new Questionaire[5];
    public void showQuiz(int quizLevel) {
        if (quizLevel == 1) {
            setQuestion(0, 1, "Size of Char", "2", "4", "6", "8", "1", "0");
            setQuestion(1, 2, "Size of INT", "2", "4", "6", "8", "2", "0");
            setQuestion(2, 3, "Size of LONG", "2", "4", "6", "8", "4", "0");
            setQuestion(3, 4, "Size of FLOAT", "2", "4", "6", "8", "2", "0");
            setQuestion(4, 5, "Size of DOUBLE", "2", "4", "6", "8", "4", "0");
        }
        else if (quizLevel == 2) {
            setQuestion(0, 1, "Below one option is not a concepts of OOPS", "Inheritance", "Polymorphism", "Interface", "Numeric Promotion", "4", "0");
            setQuestion(1, 2, "Can a class allow implementing two or more interface", "no", "yes, Only if interface has different methods ", "yes", "yes, only if interface has same methods", "3", "0");
            setQuestion(2, 3, "Can a child class allow multiple inheritance", "yes", "no", "maybe", "yes, only if parent class does not have same methods", "2", "0");
            setQuestion(3, 4, "what is the use of Super keyword", "To refer topmost Parent class", "To refer current class", "To refer immediate child class", "To refer immediate Parent", "4", "0");
            setQuestion(4, 5, "Which access specifier is used to access outside package class with no relationship between classes", "public", "protected", "default", "private", "1", "0");
        }
    }
    public void setQuestion(int idx, int id, String title, String option1, String option2, String option3, String option4, String correctAnswerPos, String skipAnswer){
        ques[idx] = new Questionaire();
        ques[idx].setQuestionId(id);
        ques[idx].setQuestionTitle(title);
        ques[idx].setOption1(option1);
        ques[idx].setOption2(option2);
        ques[idx].setOption3(option3);
        ques[idx].setOption4(option4);
        ques[idx].setCorrectAnswerPos(correctAnswerPos);
        ques[idx].setSkipAnswer(skipAnswer);
    }
    public Questionaire getQuestion(int i){
        ques[i].getQuestionId();
        ques[i].getQuestionTitle();
        ques[i].getOption1();
        ques[i].getOption2();
        ques[i].getOption3();
        ques[i].getOption4();
        ques[i].getCorrectAnswerPos();
        ques[i].getSkipAnswer();

        return ques[i];
    }
}
