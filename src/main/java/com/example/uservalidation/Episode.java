package com.example.uservalidation;

public class Episode {
    private String title;
    private float runningTime;
    private int episodeViews;
    private short episodeNum;
    private String description;

    public Episode(String title, float runningTime, int episodeViews, short episodeNum, String description) {
        this.title = title;
        this.runningTime = runningTime;
        this.episodeViews = episodeViews;
        this.episodeNum = episodeNum;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEpisodeNum(short episodeNum) {
        this.episodeNum = episodeNum;
    }

    public void setRunningTime(float runningTime) {
        this.runningTime = runningTime;
    }

    public String getTitle() {
        return title;
    }

    public short getEpisodeNum() {
        return episodeNum;
    }

    public String getDescription() {
        return description;
    }

    public float getRunningTime() {
        return runningTime;
    }

    public int getEpisodeViews() {
        return episodeViews;
    }
}
