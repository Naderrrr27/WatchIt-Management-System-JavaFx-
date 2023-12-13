package com.example.uservalidation;


import java.util.ArrayList;

public class Cast {
    // declaring
    String firstName;
    String lastName;
    Byte actorAge;
    static ArrayList<Movie> actedMovie = new ArrayList();
    static ArrayList<Tvshow> actedTvShow = new ArrayList();
    String actorNationality;
    String actorJob;

    // constructor
    Cast(String fname, String lName, Byte age, String nationality, String job) {
        firstName = fname;
        lastName = lName;
        actorAge = age;
        actorNationality = nationality;
        actorJob = job;
    }

    // setters
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setAge(Byte newActorAge) {
        actorAge = newActorAge;
    }

    public void setActedMovie(ArrayList<Movie> newActedMovie) {
        actedMovie = newActedMovie;
    }

    public void setActedTvShow(ArrayList<Tvshow> newActedTvShow) {
        actedTvShow = newActedTvShow;
    }

    public void setActorNationality(String newNationality) {
        actorNationality = newNationality;
    }

    public void setActorJob(String newActorJob) {
        actorJob = newActorJob;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Byte getActorAge() {
        return actorAge;
    }

    public String getActorJob() {
        return actorJob;
    }

    public String getActorNationality() {
        return actorNationality;
    }

    // display methods
    public static void displayActedMovie() {for (Movie movie : actedMovie) {
        System.out.println(Movie.getTitle());
    }
    }
    // display for the Tv show
    public static void displayActedTvShow(){
        for(Tvshow tvShow: actedTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }
}

