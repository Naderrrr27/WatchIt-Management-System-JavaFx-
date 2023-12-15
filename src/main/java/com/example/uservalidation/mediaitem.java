package com.example.uservalidation;

import java.util.ArrayList;
import java.util.Objects;

public abstract class mediaitem {

    protected int mediaitemid;
    protected String title;
    protected  String language;
    protected String country;
    protected float imdbScore;
    private String poster;
    protected ArrayList<Byte> ratings = new ArrayList<>();
    protected ArrayList<String> types = new ArrayList<>();
    protected ArrayList<Cast> cast;
//constructor
    public mediaitem(){}
    public mediaitem(int mediaitemid, String title, ArrayList<String> types, String language , String country, float imdbScore,String poster){
        this.mediaitemid=mediaitemid;
        this.title=title;
        this.types=types;
        this.language=language;
        this.country=country;
        this.poster=poster;
        this.imdbScore=imdbScore;
    }

    //abstract methodes
    public abstract void addgenre();
    public abstract void displaydetails();
    //setters
    public void setMediaitemid(int mediaitemid) {
        this.mediaitemid = mediaitemid;
    }
    public void setTitle(String title) {
        this.title = title;
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

    //getters
    public int getMediaitemid() {return mediaitemid;}
    public String getTitle() {return title;}
    public String getLanguage() {return language;}
    public String getCountry() {return country;}
    public float getImdbScore() {return imdbScore;}
    public ArrayList<String> getTypes() {return types;}

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
    public void displaytypes(){
            for(String it:types){
                System.out.print(it+" ");
            }
    }

    public String getPoster() {
        return poster;
    }
}


