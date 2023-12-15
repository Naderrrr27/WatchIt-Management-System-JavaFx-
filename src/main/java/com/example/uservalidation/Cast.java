package com.example.uservalidation;


import java.io.Serializable;
import java.util.ArrayList;

public class Cast implements Serializable {

    // declaring
    private String firstName;
    private String lastName;
    private Byte actorAge;
    private ArrayList<Movie> actedMovie = new ArrayList();
//    private ArrayList<TVshow> actedTvShow = new ArrayList();
    private String actorNationality;
    private String actorJob;

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

    public void setActedMovie(Movie movie) {
        actedMovie.add(movie);
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
    public void displayActedMovie() {for (Movie movie : actedMovie) {
        System.out.println(movie.getTitle());
    }
    }



    @Override
    public String toString() {
        return "Cast{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", actorAge=" + actorAge +
                ", actedMovie=" + actedMovie +
                ", actorNationality='" + actorNationality + '\'' +
                ", actorJob='" + actorJob + '\'' +
                '}';
    }
}

