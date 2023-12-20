package com.example.uservalidation;
import java.util.ArrayList;
import java.util.Arrays;

public class Genra {
    // declaring parameters for Movies
    int genreId;

    protected static ArrayList<String> genres = new ArrayList<>(Arrays.asList("Drama", "Comedy", "Action","Romance","ForKids", "Horror","International","Social","Mystery","Classic","Originals","Marvel","Animation","Thriller","Documentaries"));

    private static ArrayList<Movie> dramaMovie = new ArrayList<>();
    private static ArrayList<Movie> comedyMovie = new ArrayList<>();
    private static ArrayList<Movie> romancMovie = new ArrayList<>();
    private static ArrayList<Movie> actionMovie = new ArrayList<>();
    private static  ArrayList<Movie> horrorMovie = new ArrayList<>();
    private static ArrayList<Movie> internationalMovie = new ArrayList<>();
    private static ArrayList<Movie> socialMovie = new ArrayList<>();
    private static  ArrayList<Movie> forkidsMovie = new ArrayList<>();


    //using the default constructor
    // Method Movies
    public static void addDramaMovie(Movie movie) {
        dramaMovie.add(movie);
    }
    public static void addComedyMovie(Movie movie) {
        comedyMovie.add(movie);
    }
    public static void addRomanceMovie(Movie movie){
        romancMovie.add(movie);
    }
    public static void addActionyMovie(Movie movie){
        actionMovie.add(movie);
    }
    public static void addHorrorMovie(Movie movie) {
        horrorMovie.add(movie);
    }
    public static void addInternationalMovie(Movie movie){
        internationalMovie.add(movie);
    }
    public static void addSocialMovie(Movie movie) {
        socialMovie.add(movie);
    }
    public static void addForKidsMovie(Movie movie) {
        forkidsMovie.add(movie);
    }



    // getters for the Movies
    public static void displayDramaMovies(){
        for(Movie movie:dramaMovie){
            System.out.println(movie.getTitle());
        }
    }
    public static void displayComedyMovie() {
        for(Movie movie:comedyMovie){
            System.out.println(movie.getTitle());
        }
    }
    public static void displayRomanceMovie() {
        for (Movie movie : romancMovie) {
            System.out.println(movie.getTitle());
        }
    }
    public static void  displayActionMovie() {
        for (Movie movie : actionMovie) {
            System.out.println(movie.getTitle());
        }
    }
    public static void displayHorrorMovie(){
        for(Movie movie:horrorMovie){
            System.out.println(movie.getTitle());
        }
    }

    public static void  displayInternationalMovie() {
        for(Movie movie:internationalMovie){
            System.out.println(movie.getTitle());
        }
    }

    public static void  displaySocialMovie() {
        for (Movie movie : socialMovie) {
            System.out.println(movie.getTitle());
        }
    }
    public static void displayForkidsMovie() {
        for(Movie movie:forkidsMovie){
            System.out.println(movie.getTitle());
        }
    }


    public static ArrayList<Movie> getDramaMovie() {
        return dramaMovie;
    }

    public static ArrayList<Movie> getComedyMovie() {
        return comedyMovie;
    }

    public static ArrayList<Movie> getRomancMovie() {
        return romancMovie;
    }

    public static ArrayList<Movie> getActionMovie() {
        return actionMovie;
    }

    public static ArrayList<Movie> getHorrorMovie() {
        return horrorMovie;
    }

    public static ArrayList<Movie> getInternationalMovie() {
        return internationalMovie;
    }

    public static ArrayList<Movie> getSocialMovie() {
        return socialMovie;
    }

    public static ArrayList<Movie> getForkidsMovie() {
        return forkidsMovie;
    }

    public static ArrayList<String> getGenres() {
        return genres;
    }

    public static void addToGenres()
    {
        for (Movie movie : HelloApplication.movies)
        {
            movie.addgenre();
        }
    }

}