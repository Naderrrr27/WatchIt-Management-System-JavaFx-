package com.example.uservalidation;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable {

    protected static int movieIdCounter;
    private int movieId;
    protected String title;
    private int year;
    private float runningtime;
    protected  String language;
    protected String country;
    protected float imdbScore;
    private float budget;
    private float revenue;
    protected String poster;
    private String movieDescription;
    private int views;

    protected ArrayList<Byte> ratings = new ArrayList<>();
    protected ArrayList<String> types = new ArrayList<>();
    protected ArrayList<Cast> cast = new ArrayList<>();

   //constructor
   public Movie(){}
   public Movie(String title, ArrayList<String> types, String language, String country, float imdbscore, int year, float runningtime, String movieDescription, float budget, float revenue,String poster){

       this.movieId=++movieIdCounter;
       this.title=title;
       this.types=types;
       this.language=language;
       this.country=country;
       this.poster=poster;
       this.imdbScore=imdbScore;
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
   public void setTitle(String title) {
       this.title = title;
   }
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
    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setImdbScore(float imdbScore) {
        this.imdbScore = imdbScore;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public void setRatings(ArrayList<Byte> ratings) {
        this.ratings = ratings;
    }
    public  void addCast(Cast castt){
        cast.add(castt);
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    //getters
    public String getTitle() {return title;}
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

    public int getMovieId() {
        return movieId;
    }

    public String getLanguage() {return language;}
    public String getCountry() {return country;}
    public float getImdbScore() {return imdbScore;}
    public String getPoster() {
        return poster;
    }
    public ArrayList<String> getTypes() {return types;}

    public  void addgenre(){
       for (int i =0 ; i< types.size();i++){
           if(types.get(i).equals("Drama"))
               Genra.addDramaMovie(this);
           else if (types.get(i).equals("Comedy"))
               Genra.addComedyMovie(this);
           else if (types.get(i).equals("Action"))
               Genra.addActionyMovie(this);
           else if (types.get(i).equals("Romance"))
               Genra.addRomanceMovie(this);
           else if (types.get(i).equals("Horror"))
               Genra.addHorrorMovie(this);
           else if (types.get(i).equals("International"))
               Genra.addInternationalMovie(this);
           else if (types.get(i).equals("Social"))
               Genra.addSocialMovie(this);
           else if (types.get(i).equals("ForKids"))
               Genra.addForKidsMovie(this);
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



    public void displaycast(){
        for(Cast it: cast){
            if(it.getActorJob().equals("Director:")) {
                System.out.println("Director:" + it.getFirstName() + " " + it.getLastName());
                // System.out.println("Director's Nationality: "+it.getActorNationality());
                //System.out.println("Director's Age: "+ it.getActorAge());
            }
            else if(it.getActorJob().equals("Actor")) {
                System.out.println("Cast:"+ it.getFirstName() + " " + it.getLastName() + ",");
                //System.out.println("Actor's ");
            }
        }
    }
    public ArrayList<String> displaytypes(){
        return types;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", year=" + year +
                ", runningtime=" + runningtime +
                ", movieDescription='" + movieDescription + '\'' +
                ", views=" + views +
                ", budget=" + budget +
                ", revenue=" + revenue +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", imdbScore=" + imdbScore +
                ", poster='" + poster + '\'' +
                ", ratings=" + ratings +
                ", types=" + types +
                ", cast=" + cast +
                '}';
    }
}
