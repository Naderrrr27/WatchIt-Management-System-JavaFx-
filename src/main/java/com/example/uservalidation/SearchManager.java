package com.example.uservalidation;

import java.util.ArrayList;

public class SearchManager {

    SearchManager(){};

    public ArrayList<Movie> searchMovie(String searchedItem)
    {
        ArrayList<Movie> movie=null;

        for (Movie m : HelloApplication.movies)
        {
            if (m.getTitle().equals(searchedItem))
            {
                movie.add(m);
            }

        }
        return movie;
    }


    public ArrayList<Cast> searchCast(String searchedItem)
    {

        ArrayList<Cast>cast=null;
        for (Cast c : HelloApplication.casts)
        {
            if (c.getFirstName().equals(searchedItem))
            {
                cast.add(c);
            }

        }
        return cast ;
    }




}
