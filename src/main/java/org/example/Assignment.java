package org.example;


import util.Util;

import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId = 1;

    public Assignment(String assignmentName, double weight, int maxScore) {
        this.assignmentId = "A" + String.format("%03d", nextId++);
        this.assignmentName = Util.toTitleCase(assignmentName);
        this.weight = weight;
        this.maxScore = maxScore;
        this.scores = new ArrayList<>();
    }

    public void calcAssignmentAvg() {
        if (scores.isEmpty()) {
            assignmentAverage = 0;
        } else {
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            assignmentAverage = (double) sum / scores.size();
        }
    }

    public void generateRandomScore() {
        Random random = new Random();
        for (int i = 0; i < scores.size(); i++) {
            int number = random.nextInt(11);
            int score;
            if (number == 0) {
                score = random.nextInt(60);
            } else if (number == 1 || number == 2) {
                score = random.nextInt(10) + 60;
            } else if (number == 3 || number == 4) {
                score = random.nextInt(10) + 70;
            } else if (number >= 5 && number <= 8) {
                score = random.nextInt(10) + 80;
            } else {
                score = random.nextInt(11) + 90;
            }
            scores.set(i, score);
        }
        calcAssignmentAvg();
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }

    // Getters and Setters
    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = Util.toTitleCase(assignmentName);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public double getAssignmentAverage() {
        return assignmentAverage;
    }

    public void setAssignmentAverage(double assignmentAverage) {
        this.assignmentAverage = assignmentAverage;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Assignment.nextId = nextId;
    }
}
