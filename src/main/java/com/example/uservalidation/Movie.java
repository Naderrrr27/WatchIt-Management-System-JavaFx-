package com.example.uservalidation;

import java.util.ArrayList;

public class Movie extends  mediaitem{
   private int year;
   private float runningtime;
   private String movieDescription;
   private int views;
   private float budget;
   private float revenue;

   //objects
   //Genre genre = new Genre();
   Movie instancemovie = new Movie();

   //constructor
   public Movie(){}
   public Movie(int movieId, String title, ArrayList<String> types, String language, String country, float imdbscore, int year, float runningtime, String movieDescription, float budget, float revenue){
       super(movieId,title,types,language,country,imdbscore);
       this.year=year;
       this.runningtime=runningtime;
       this.movieDescription=movieDescription;
       this.revenue=revenue;
       this.budget=budget;
   }

   //call this function whenever the user watch a movie
   public void watchemovie(){
       views++;
   }

   //setters
   public void setRunningtime(float runningtime) {
       this.runningtime = runningtime;
   }
   public void setMovieDescription(String movieDescription) {
       this.movieDescription = movieDescription;
   }
   public void setYear(int year) {
       this.year = year;
   }
   public void setBudget(float budget) {
       this.budget = budget;
   }
   public void setRevenue(float revenue) {
       this.revenue = revenue;
   }

   //getters
   public float getRevenue() {
       return revenue;
   }
   public float getBudget() {
       return budget;
   }
   public float getRunningtime() {
       return runningtime;
   }
   public String getMovieDescription() {
       return movieDescription;
   }
   public int getYear() {
       return year;
   }
   public int getViews() {return views;}
   public float getRate(){
       float sum = 0;

       for (Byte rating : ratings) sum += rating;
       return (sum/ratings.size());
   }


 /*  public  void addgenre(){
       for (int i =0 ; i< types.size();i++){
           if(types.get(i).equals("drama"))
               genre.setDramaMovies(instancemovie);
           else if (types.get(i).equals("comedy"))
               genre.setComedyMovies(instancemovie);
           else if (types.get(i).equals("action"))
               genre.setActionMovies(instancemovie);
           else if (types.get(i).equals("romance"))
               genre.setRomanceMovies(instancemovie);
           else if (types.get(i).equals("horror"))
               genre.setHorrorMovies(instancemovie);
           else if (types.get(i).equals("international"))
               genre.setInternationalMovies(instancemovie);
           else if (types.get(i).equals("social"))
               genre.setSocialMovies(instancemovie);
           else if (types.get(i).equals("forkids"))
               genre.setForKidsMovies(instancemovie);

       }*/
   //}

  //public void addCast(){

   //}
}
