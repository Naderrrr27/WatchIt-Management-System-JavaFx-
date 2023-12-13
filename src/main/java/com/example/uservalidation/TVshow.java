package com.example.uservalidation;

import java.util.ArrayList;

//ashtar katkut


public class TVshow extends mediaitem {

    private ArrayList<Season> seasons;
    public TVshow(int mediaitemid, String title, ArrayList<String> types, String language, String country, float imdbScore, ArrayList<Season> seasons) {
        super(mediaitemid, title, types, language, country, imdbScore);
        this.seasons = seasons;
    }
    Genra genre = new Genra();

    public void addSeason(Season season){
        seasons.add(season);
    }

    @Override
    public void addgenre() {
            for (String type : types) {
                switch (type) {
                    case "drama":
                        genre.addDramaTvshowe(this);
                        break;
                    case "comedy":
                        genre.addComedyTvShow(this);
                        break;
                    case "action":
                        genre.addActionyTvShow(this);
                        break;
                    case "romance":
                        genre.addRomanceTvshowe(this);
                        break;
                    case "horror":
                        genre.addHorrorTvShow(this);
                        break;
                    case "international":
                        genre.addInternationalTvShow(this);
                        break;
                    case "social":
                        genre.addSocialTvShow(this);
                        break;
                    case "forkids":
                        genre.addForKidsTvShow(this);
                        break;
                    default:
                        // Handle unknown genre type if needed
                        break;
                }
            }
        }
    @Override
    public void displaydetails(){
        System.out.println(getTitle());
        System.out.print("TvShow"+" ");
        displaytypes();
        displaycast();
        System.out.println("Imdb score: " + getImdbScore());
        System.out.println("language: "+getLanguage());
        System.out.println("country: "+getCountry());
    }
    public void displaySeasons() {
        System.out.println("TV Show: " + getTitle());

        for (Season season : seasons) {
            System.out.println("Season " + season.getYear() + " Info:");
            System.out.println("Description: " + season.getDescription());
            System.out.println("IMDb Score: " + season.getImdbScore());
            System.out.println("Number of Episodes: " + season.getEpisodes().size());

            // Display information about each episode in the season
            season.displayEpisodesInfo();

            System.out.println("---------------------");
        }
    }

}
