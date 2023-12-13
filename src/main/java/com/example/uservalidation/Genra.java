package com.example.uservalidation;
import java.util.ArrayList;

public class Genra {
    // declaring parameters for Movies
    int genreId;
    private static ArrayList<Movie> dramaMovie = new ArrayList();
    private static ArrayList<Movie> comedyMovie = new ArrayList();
    private static ArrayList<Movie> romancMovie = new ArrayList();
    private static ArrayList<Movie> actionMovie = new ArrayList();
    private static  ArrayList<Movie> horrorMovie = new ArrayList();
    private static ArrayList<Movie> internationalMovie = new ArrayList();
    private static ArrayList<Movie> socialMovie = new ArrayList();
    private static  ArrayList<Movie> forkidsMovie = new ArrayList();
    // declaring parameters for TV show
    private static ArrayList<TVshow> dramaTvShow = new ArrayList();
    private static  ArrayList<TVshow> comedyTvShow = new ArrayList();
    private static ArrayList<TVshow> romanceTvShow = new ArrayList();
    private static ArrayList<TVshow> actionTvShow = new ArrayList();
    private static  ArrayList<TVshow> horrorTvShow = new ArrayList();
    private static ArrayList<TVshow> internationalTvShow = new ArrayList();
    private static ArrayList<TVshow> socialTvShow = new ArrayList();
    private static ArrayList<TVshow> forkidsTvShow = new ArrayList();

    //using the default constructor
    // Method Movies
    public void addDramaMovie(Movie movie) {
        dramaMovie.add(movie);
    }
    public void addComedyMovie(Movie movie) {
        comedyMovie.add(movie);
    }
    public void addRomanceMovie(Movie movie){
        romancMovie.add(movie);
    }
    public void addActionyMovie(Movie movie){
        actionMovie.add(movie);
    }
    public void addHorrorMovie(Movie movie) {
        horrorMovie.add(movie);
    }
    public void addInternationalMovie(Movie movie){
        internationalMovie.add(movie);
    }
    public void addSocialMovie(Movie movie) {
        socialMovie.add(movie);
    }
    public void addForKidsMovie(Movie movie) {
        forkidsMovie.add(movie);
    }
    // Method Tvshow
    public void addDramaTvshowe(TVshow tvshow ) {
        dramaTvShow.add(tvshow);
    }
    public void addComedyTvShow(TVshow tvshow) {
        comedyTvShow.add(tvshow);
    }
    public void addRomanceTvshowe(TVshow tvshow){romanceTvShow.add(tvshow);}
    public void addActionyTvShow(TVshow tvshow){
        actionTvShow.add(tvshow);
    }
    public void addHorrorTvShow(TVshow tvshow) {
        horrorTvShow.add(tvshow);
    }
    public void addInternationalTvShow(TVshow tvshow){
        internationalTvShow.add(tvshow);

    }
    public void addSocialTvShow(TVshow tvshow) {
        socialTvShow.add(tvshow);
    }
    public void addForKidsTvShow(TVshow tvshow) {
        forkidsTvShow.add(tvshow);
    }
    // getters for the Movies
    public static void displayDramaMovies(){
        for(Movie movie:dramaMovie){
            System.out.println(Movie.getTitle());
        }
    }
    public static void displayComedyMovie() {
        for(Movie movie:comedyMovie){
            System.out.println(Movie.getTitle());
        }
    }
    public static void displayRomanceMovie() {
        for (Movie movie : romancMovie) {
            System.out.println(Movie.getTitle());
        }
    }
    public static void  displayActionMovie() {
        for (Movie movie : actionMovie) {
            System.out.println(Movie.getTitle());
        }
    }
    public static void displayHorrorMovie(){
        for(Movie movie:horrorMovie){
            System.out.println(Movie.getTitle());
        }
    }

    public static void  displayInternationalMovie() {
        for(Movie movie:internationalMovie){
            System.out.println(Movie.getTitle());
        }
    }

    public static void  displaySocialMovie() {
        for (Movie movie : socialMovie) {
            System.out.println(Movie.getTitle());
        }
    }
    public static void displayForkidsMovie() {
        for(Movie movie:forkidsMovie){
            System.out.println(Movie.getTitle());
        }
    }
    // display for the TV Show


    public static void displayDramaTvShow() {
        for(TVshow tvshow :dramaTvShow){
            System.out.println(TVshow.getTitle());
        }
    }

    public static void displayComedyTvShow() {
        for(TVshow tvshow :comedyTvShow){
            System.out.println(TVshow.getTitle());
        }
    }
    public static void displayromanceTvShow(){
        for(TVshow tvshow :romanceTvShow){
            System.out.println(TVshow.getTitle());
        }
    }

    public static void  displayActionTvShow() {
        for(TVshow tvshow :actionTvShow){
            System.out.println(TVhow.getTitle());
        }
    }

    public static void  displayHorrorTvShow() {
        for(TVshow tvshow :horrorTvShow){
            System.out.println(TVshow.getTitle());
        }
    }

    public static void displayInternationalTvShow() {
        for(TVshow tvshow :internationalTvShow){
            System.out.println(TVshow.getTitle());
        }
    }

    public static void displaySocialTvShow() {
        for(TVshow tvshow :socialTvShow){
            System.out.println(TVshow.getTitle());
        }
    }

    public static void  displayForkidsTvShow() {
        for(TVshow tvshow :forkidsTvShow){
            System.out.println(TVshow.getTitle());
        }
    }
}