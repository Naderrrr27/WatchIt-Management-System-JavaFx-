package com.example.uservalidation;

import java.util.ArrayList;

public class Season {
    private int year;
    private float imdbScore;
    private ArrayList<Episode> episodes;
    private String description;
    private int views;

    public Season(int year, float imdbScore, String description) {
        episodes = new ArrayList<>();
        this.year = year;
        this.imdbScore = imdbScore;
        this.description = description;
    }

    public float getImdbScore() {
        return imdbScore;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public void setImdbScore(float imdbScore) {
        this.imdbScore = imdbScore;
    }
    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }
    public void displayEpisodesInfo() {
        System.out.println("Season " + year + " Episodes:");

        for (Episode episode : episodes) {
            System.out.println("Episode " + episode.getEpisodeNum() + ":");
            System.out.println("Title: " + episode.getTitle());
            System.out.println("Running Time: " + episode.getRunningTime() + " minutes");
            System.out.println("Description: " + episode.getDescription());
            System.out.println("Views: " + episode.getEpisodeViews());
            System.out.println("---------------------");
        }
    }


}
