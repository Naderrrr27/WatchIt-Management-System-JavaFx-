package com.example.uservalidation;

import java.util.ArrayList;

public class SearchManager {

    SearchManager(){};


    public static ArrayList<Movie> searchMovie(String searchedItem)
    {

        int counter = 0;

        ArrayList<Movie> movies = new ArrayList<>();

        for (Movie m : HelloApplication.movies)
        {

            if(m.getTitle().toLowerCase().contains(searchedItem.toLowerCase()))
                movies.add(m);

        }

        return movies;
    }



    public static ArrayList<Movie> searchCast(String searchedItem)
    {

        int counter = 0;

        ArrayList<Movie> castMovies = new ArrayList<>();

        for (Movie movie : HelloApplication.movies)
        {
            for (Cast castt : movie.getCast())
            {
                if((castt.getFirstName()+" "+castt.getLastName()).toLowerCase().contains(searchedItem.toLowerCase()))
                    castMovies.add(movie);
            }
        }

        return castMovies ;
    }


    public static ArrayList<Movie> searchGenra(String searchedItem)
    {

        int counter = 0;

        ArrayList<Movie> moviesGenre=new ArrayList<>();


        for(Movie m:HelloApplication.movies)
        {
            if(m.getTypes().get(0).toLowerCase().contains(searchedItem.toLowerCase()))
            {
                moviesGenre.add(m);
            }
        }



        return moviesGenre;


    }




}
