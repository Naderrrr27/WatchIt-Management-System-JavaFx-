package com.example.uservalidation;

import java.io.Serializable;
import java.time.LocalDate;

public class UserWatchRecord implements Serializable {
    private int userId;
    private  int movieId;
    private  Movie movie;

    private  LocalDate datOfWatching;
    private  byte rate;

    public UserWatchRecord(int userId, int movieId, Movie movie) {
        this.userId = userId;
        this.movieId = movieId;
        this.movie = movie;
        this.datOfWatching = LocalDate.now();
    }


    //Setters
    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    public void setDatOfWatching(LocalDate datOfWatching) {
        this.datOfWatching = datOfWatching;
    }

    public void setRate(byte rate)
    {
        this.rate = rate;
    }






    //Getters

    public int getUserId() {
        return userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public Movie getMovie()
    {
        return movie;
    }


    public LocalDate getDatOfWatching()
    {
        return datOfWatching;
    }

    public byte getRate()
    {
        return rate;
    }

    @Override
    public String toString() {
        return "UserWatchRecord{" +
                "userId=" + userId +
                ", movieId=" + movieId +
                ", movie=" + movie +
                ", datOfWatching=" + datOfWatching +
                ", rate=" + rate +
                '}';
    }
}
