package com.izaanschool.objects;

class VotingMachine {
    private String candidate1;
    private String candidate2;
    private int totalVoters;
    private int votesForCandidate1;
    private int votesForCandidate2;

    public VotingMachine(String candidate1, String candidate2, int totalVoters) {
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
        this.totalVoters = totalVoters;
        this.votesForCandidate1 = 49;
        this.votesForCandidate2 = 51;
    }

    public String getCandidate1() {
        return candidate1;
    }

    public String getCandidate2() {
        return candidate2;
    }

    public int getTotalVoters() {
        return totalVoters;
    }

    public int getVotesForCandidate1() {
        return votesForCandidate1;
    }

    public int getVotesForCandidate2() {
        return votesForCandidate2;
    }

    public void castVoteForCandidate1() {
        votesForCandidate1++;
    }

    public void castVoteForCandidate2() {
        votesForCandidate2++;
    }

    public static void main(String[] args) {
        String candidate1 = "Candidate A";
        String candidate2 = "Candidate B";
        int totalVoters = 100;

        VotingMachine votingMachine = new VotingMachine(candidate1, candidate2, totalVoters);

        System.out.println("Candidate 1: " + votingMachine.getCandidate1());
        System.out.println("Candidate 2: " + votingMachine.getCandidate2());
        System.out.println("Total Voters: " + votingMachine.getTotalVoters());
        System.out.println("Votes for Candidate 1: " + votingMachine.getVotesForCandidate1());
        System.out.println("Votes for Candidate 2: " + votingMachine.getVotesForCandidate2());
    }
}
