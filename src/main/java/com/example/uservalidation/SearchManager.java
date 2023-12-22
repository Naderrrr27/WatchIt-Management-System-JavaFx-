package com.example.uservalidation;

import java.util.ArrayList;

public class SearchManager {

    SearchManager(){};

    public static ArrayList<Movie> searchMovie(String searchedItem)
    {


        ArrayList<Movie> movies = new ArrayList<>();

        for (Movie m : HelloApplication.movies)
        {

            if(searchedItem.equalsIgnoreCase(m.getTitle()))
                movies.add(m);

        }

        return movies;
    }



    public static ArrayList<Movie> searchCast(String searchedItem)
    {


        ArrayList<Movie> castMovies = new ArrayList<>();

        for (Cast c : HelloApplication.casts)
        {
            if(searchedItem.equalsIgnoreCase(c.getFirstName()+" "+c.getLastName()))
                castMovies=c.getActedMovie();
        }

        return castMovies ;
    }


    public static ArrayList<Movie> searchGenra(String searchedItem)
    {


        ArrayList<Movie>movies=new ArrayList<>();


        for(Movie m:HelloApplication.movies)
        {
            if(searchedItem.equalsIgnoreCase(m.getTypes().get(0)))
            {
                movies.add(m);
            }
        }



        return movies;


    }




}
