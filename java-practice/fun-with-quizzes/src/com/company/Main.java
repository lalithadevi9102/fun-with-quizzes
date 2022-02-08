package com.company;

public class Main {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("How many coasters are at Carowinds?", "13"));
        quiz.addQuestion(new Question("Which sea creature has 3 hearts?", "Octopus"));
        quiz.addQuestion(new Question("What is the Italian word for Pie?", "Pizza"));

        quiz.runQuiz();
    }


