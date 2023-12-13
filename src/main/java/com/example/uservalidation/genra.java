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
    private static ArrayList<Tvshow> dramaTvShow = new ArrayList();
    private static  ArrayList<Tvshow> comedyTvShow = new ArrayList();
    private static ArrayList<Tvshow> romanceTvShow = new ArrayList();
    private static ArrayList<Tvshow> actionTvShow = new ArrayList();
    private static  ArrayList<Tvshow> horrorTvShow = new ArrayList();
    private static ArrayList<Tvshow> internationalTvShow = new ArrayList();
    private static ArrayList<Tvshow> socialTvShow = new ArrayList();
    private static ArrayList<Tvshow> forkidsTvShow = new ArrayList();

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
    public void addDramaTvshowe(Tvshow tvshow ) {
        dramaTvShow.add(tvshow);
    }
    public void addComedyTvShow(Tvshow tvshow) {
        comedyTvShow.add(tvshow);
    }
    public void addRomanceTvshowe(Tvshow tvshow){romanceTvShow.add(tvshow);}
    public void addActionyTvShow(Tvshow tvshow){
        actionTvShow.add(tvshow);
    }
    public void addHorrorTvShow(Tvshow tvshow) {
        horrorTvShow.add(tvshow);
    }
    public void addInternationalTvShow(Tvshow tvshow){
        internationalTvShow.add(tvshow);

    }
    public void addSocialTvShow(Tvshow tvshow) {
        socialTvShow.add(tvshow);
    }
    public void addForKidsTvShow(Tvshow tvshow) {
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
        for(Tvshow tvshow :dramaTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }

    public static void displayComedyTvShow() {
        for(Tvshow tvshow :comedyTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }
    public static void displayromanceTvShow(){
        for(Tvshow tvshow :romanceTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }

    public static void  displayActionTvShow() {
        for(Tvshow tvshow :actionTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }

    public static void  displayHorrorTvShow() {
        for(Tvshow tvshow :horrorTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }

    public static void displayInternationalTvShow() {
        for(Tvshow tvshow :internationalTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }

    public static void displaySocialTvShow() {
        for(Tvshow tvshow :socialTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }

    public static void  displayForkidsTvShow() {
        for(Tvshow tvshow :forkidsTvShow){
            System.out.println(Tvshow.getTitle());
        }
    }
}