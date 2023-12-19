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


    public ArrayList<Movie> searchGenra(String searchedItem)
    {

        ArrayList<Movie>movie=null;
        if(searchedItem.equals("Comedy")||searchedItem.equals("comedy"))
            movie=Genra.getComedyMovie();

       else if(searchedItem.equals("Drama")||searchedItem.equals("drama"))
            movie=Genra.getDramaMovie();

       else if(searchedItem.equals("Romanc")||searchedItem.equals("romanc"))
            movie=Genra.getRomancMovie();

        else if(searchedItem.equals("Action")||searchedItem.equals("action"))
            movie=Genra.getActionMovie();

        else if(searchedItem.equals("Horror")||searchedItem.equals("horror"))
            movie=Genra.getHorrorMovie();

        else if(searchedItem.equals("For kids")||searchedItem.equals("for kids"))
            movie=Genra.getForkidsMovie();

        else if(searchedItem.equals("International")||searchedItem.equals("international"))
            movie=Genra.getInternationalMovie();

        else if(searchedItem.equals("Social")||searchedItem.equals("social"))
            movie=Genra.getSocialMovie();


        return movie;


    }


}
