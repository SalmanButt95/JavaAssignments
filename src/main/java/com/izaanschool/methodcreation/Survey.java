package com.izaanschool.methodcreation;

import java.util.Arrays;
import java.util.List;

public class Survey {

    private List<String> questions;
    private List<String> responses;
    private List<String> results;


    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public List<String> getResponses() {
        return responses;
    }

    public void setResponses(List<String> responses) {
        this.responses = responses;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }


    public static void main(String[] args) {
        // Create an object instance of the class
        Survey survey = new Survey();


        List<String> questions = Arrays.asList("Q1. What is your age?", "Q2. What is your favorite color?");
        List<String> responses = Arrays.asList("18-24", "Blue");
        List<String> results = Arrays.asList("30% 20, 44% 21, 26% 24", "Blue");

        survey.setQuestions(questions);
        survey.setResponses(responses);
        survey.setResults(results);


        System.out.println("Survey Questions: " + survey.getQuestions());
        System.out.println("Survey Responses: " + survey.getResponses());
        System.out.println("Survey Results: " + survey.getResults());
    }
}
