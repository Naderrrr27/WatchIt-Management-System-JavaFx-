package com.example.uservalidation;

import java.util.ArrayList;

public class SearchManager {

    SearchManager(){};

    public static ArrayList<Movie> searchMovie(String searchedItem)
    {

        int counter;

        ArrayList<Movie> movies = new ArrayList<>();

        for (Movie m : HelloApplication.movies)
        {
            counter=0;

            for(int i=0;i<searchedItem.length();i++)
            {
                if(searchedItem.charAt(i)==m.getTitle().charAt(i))
                    counter++;
            }

            if(counter==searchedItem.length())
                movies.add(m);

        }

        return movies;
    }



    public static ArrayList<Cast> searchCast(String searchedItem)
    {
        int counter;

        ArrayList<Cast> casts = new ArrayList<>();

        for (Cast c : HelloApplication.casts)
        {
           counter=0;

           for(int i=0;i<searchedItem.length();i++)
           {
               if(searchedItem.charAt(i)==c.getFirstName().charAt(i))
                   counter++;

           }

            if(counter==searchedItem.length())
                casts.add(c);

        }

        return casts ;
    }


    public static ArrayList<Movie> searchGenra(String searchedItem)
    {


        ArrayList<Movie>movies=new ArrayList<>();

        if (searchedItem.equalsIgnoreCase("Comedy"))
            movies = Genra.getComedyMovie();
        else if (searchedItem.equalsIgnoreCase("Drama"))
            movies = Genra.getDramaMovie();
        else if (searchedItem.equalsIgnoreCase("Romance"))
            movies = Genra.getRomancMovie();
        else if (searchedItem.equalsIgnoreCase("Action"))
            movies = Genra.getActionMovie();
        else if (searchedItem.equalsIgnoreCase("Horror"))
            movies = Genra.getHorrorMovie();
        else if (searchedItem.equalsIgnoreCase("For kids"))
            movies = Genra.getForkidsMovie();
        else if (searchedItem.equalsIgnoreCase("International"))
            movies = Genra.getInternationalMovie();
        else if (searchedItem.equalsIgnoreCase("Social"))
            movies = Genra.getSocialMovie();


        return movies;


    }


}
