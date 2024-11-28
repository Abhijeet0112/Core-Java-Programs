package day1;

import java.util.ArrayList;
import java.util.List;

class CricketPlayer {
    private String name;
    private int birthYear;
    private int age;
    private int currentYear;
    private List<Integer> scores;

    // Constructor
    public CricketPlayer(String name, int birthYear, int currentYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
        this.age = calculateAge();
        this.scores = new ArrayList<>();
    }

    // Method to calculate age
    private int calculateAge() {
        return currentYear - birthYear;
    }

    // Method to add a score to the list
    public void addScore(int score) {
        scores.add(score);
    }

    // Method to display player details
    @Override
    public String toString() {
        return "Player Name: " + name +
               "\nBirth Year: " + birthYear +
               "\nAge: " + age +
               "\nScores: " + scores;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a new CricketPlayer object
        CricketPlayer player = new CricketPlayer("Virat Kohli", 1988, 2024);

        // Add some scores
        player.addScore(67);
        player.addScore(102);
        player.addScore(45);

        // Display player details
        System.out.println(player);
    }
}

