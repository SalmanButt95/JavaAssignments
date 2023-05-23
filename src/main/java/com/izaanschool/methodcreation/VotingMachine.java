package com.izaanschool.methodcreation;

public class VotingMachine {

    private String candidates;
    private int voters;
    private double results;


    public String getCandidates() {
        return candidates;
    }

    public void setCandidates(String candidates) {
        this.candidates = candidates;
    }

    public int getVoters() {
        return voters;
    }

    public void setVoters(int voters) {
        this.voters = voters;
    }

    public double getResults() {
        return results;
    }

    public void setResults(double results) {
        this.results = results;
    }


    public static void main(String[] args) {

        VotingMachine votingMachine = new VotingMachine();


        votingMachine.setCandidates("Salman Butt");
        votingMachine.setVoters(1000);
        votingMachine.setResults(59.5);


        System.out.println("Candidates: " + votingMachine.getCandidates());
        System.out.println("Number of Voters: " + votingMachine.getVoters());
        System.out.println("Results: " + votingMachine.getResults() + "%");
    }
}
