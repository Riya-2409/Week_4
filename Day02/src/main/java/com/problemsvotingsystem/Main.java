package com.problemsvotingsystem;

public class Main {

    public static void main(String[] args) {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Add some votes
        votingSystem.addVote("Riya");
        votingSystem.addVote("Pragya");
        votingSystem.addVote("Riya");
        votingSystem.addVote("Shubhi");
        votingSystem.addVote("Pragya");
        votingSystem.addVote("Riya");

        // Display voting results sorted by votes in descending order using TreeMap
        votingSystem.displayResultsSortedByVotes();

        // Display voting results in the order they were inserted using LinkedHashMap
        votingSystem.displayResultsInInsertionOrder();

        // Get and print the number of votes for a specific candidate
        System.out.println("Votes for Alice: " + votingSystem.getVotesForCandidate("Riya"));
        System.out.println("Votes for Bob: " + votingSystem.getVotesForCandidate("Pragya"));
        System.out.println("Votes for Charlie: " + votingSystem.getVotesForCandidate("Shubhi"));
    }
}
