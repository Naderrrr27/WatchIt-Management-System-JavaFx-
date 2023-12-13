package com.example.uservalidation;

import java.util.ArrayList;

public abstract class mediaitem {

    protected int mediaitemid;
    protected String title;
    protected  String language;
    protected String country;
    protected float imdbScore;
    protected ArrayList<Byte> ratings = new ArrayList<>();
    protected ArrayList<String> types = new ArrayList<>();
    //protected Arraylist<Cast> cast;
    //protected Director directorr;
//constructor
    public mediaitem(){}
    public mediaitem(int mediaitemid, String title, ArrayList<String> types, String language , String country, float imdbScore){
        this.mediaitemid=mediaitemid;
        this.title=title;
        this.types=types;
        this.language=language;
        this.country=country;
        this.imdbScore=imdbScore;
    }

    //abstract methodes
    //public abstract void addgenre();
   // public abstract void addCast();
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

    //getters
    public int getMediaitemid() {return mediaitemid;}
    public String getTitle() {return title;}
    public String getLanguage() {return language;}
    public String getCountry() {return country;}
    public float getImdbScore() {return imdbScore;}
    public ArrayList<String> getTypes() {return types;}

    public void displayTypes() {
        System.out.println("Types for " + getTitle() + ":");
        for (String type : types) {
            System.out.println(type);
        }
    }




    //public void displaycast(){}


}


