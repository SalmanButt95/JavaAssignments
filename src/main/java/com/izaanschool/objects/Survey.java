package com.izaanschool.objects;

import java.util.Arrays;
import java.util.List;

class Survey {
    private List<String> questions;
    private List<String> responses;
    private String results;

    public Survey(List<String> questions, List<String> responses, String results) {
        this.questions = questions;
        this.responses = responses;
        this.results = results;
    }

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

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public static void main(String[] args) {
        List<String> questions = Arrays.asList("Q1. What's your favorite color?", "Q2. What's your 2nd favorite color?");
        List<String> responses = Arrays.asList("Blue", "Red");
        String results = "Survey results: 30% Blue, 60% Red";

        Survey survey = new Survey(questions, responses, results);

        System.out.println("Questions: " + survey.getQuestions());
        System.out.println("Responses: " + survey.getResponses());
        System.out.println("Results: " + survey.getResults());
    }
}
