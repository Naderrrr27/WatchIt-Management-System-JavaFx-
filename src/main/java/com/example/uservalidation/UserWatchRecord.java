package com.example.uservalidation;

import java.time.LocalDate;

public class UserWatchRecord {
   private int userId;
    private  int movieId;
    private  int tvShowId;
    private  Movie movie;

    //TvShow tvShow;
    private  LocalDate datOfWatching;
    private  byte rate;

   public UserWatchRecord(int uid,int mid,Movie m)
    {

    }

    public void setMovie(Movie m)
    {
        movie=m;
    }

    public void setRate(byte r)
    {
        rate=r;
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


}
