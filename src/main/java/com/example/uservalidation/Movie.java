package com.example.uservalidation;

import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.util.ArrayList;

public class Movie extends  mediaitem{
   private int year;
   private float runningtime;
   private String movieDescription;
   private int views;
   private float budget;
   private float revenue;


   //objects
   Genra genre = new Genra();
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


    public  void addgenre(){
       for (int i =0 ; i< types.size();i++){
           if(types.get(i).equals("drama"))
               genre.addDramaMovie(instancemovie);
           else if (types.get(i).equals("comedy"))
               genre.addComedyMovie(instancemovie);
           else if (types.get(i).equals("action"))
               genre.addActionyMovie(instancemovie);
           else if (types.get(i).equals("romance"))
               genre.addRomanceMovie(instancemovie);
           else if (types.get(i).equals("horror"))
               genre.addHorrorMovie(instancemovie);
           else if (types.get(i).equals("international"))
               genre.addInternationalMovie(instancemovie);
           else if (types.get(i).equals("social"))
               genre.addSocialMovie(instancemovie);
           else if (types.get(i).equals("forkids"))
               genre.addForKidsMovie(instancemovie);
       }
   }

       public void displaydetails(){
           System.out.println(getTitle());
           System.out.print("Movie"+" ");
           displaytypes();
           System.out.println(" "+getYear());
           System.out.println("Running time: "+getRunningtime());
           System.out.println(getMovieDescription());
           displaycast();
           System.out.println("Rating: "+getRate());
           System.out.println("Imdb score: " + getImdbScore());
           System.out.println("language: "+getLanguage());
           System.out.println("country: "+getCountry());
           System.out.println("Budget: " +getBudget());
           System.out.println("Revenue"+getRevenue());
           }
}
