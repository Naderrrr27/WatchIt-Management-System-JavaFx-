package com.example.uservalidation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;



public class HelloApplication extends Application {


    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Movie> movies = new ArrayList<>();
    public static ArrayList<Cast> casts = new ArrayList<>();



    public static void saveUsersToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
             outputStream.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadUsersFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
             users = (ArrayList<User>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void saveMoviesToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
            outputStream.writeObject(movies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadMoviesFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            movies = (ArrayList<Movie>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void saveCastToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
            outputStream.writeObject(casts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void loadCastFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            casts = (ArrayList<Cast>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {


        loadUsersFromFile("USERSS.txt");
        loadMoviesFromFile("MOVIESS.txt");
        loadCastFromFile("CASTSS.txt");

//
//        users.clear();
//        movies.clear();
//        casts.clear();
//
//
//
//        movies.add(new Movie("Keda Reda",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.5f,2007,1.53f,"Identical triplet brothers, named Reda by their father, who was a con man, grow up and develop different personalities. They encounter trouble when the three of them fall for the same woman, Nadia.",204012,245512,"src/main/resources/com/example/uservalidation/Posters/kedareda.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","Helmy",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","El Sawy",(byte) 54,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Menna","Shalaby",(byte) 46,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ahmed","Nader",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("1000 Mabrouk",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.4f,2009,1.55f,"Ahmad faces many obstacles on his wedding day before succumbing to death at midnight. He panics after waking up in the morning as he realises he is stuck in a time loop and is reliving that day.",201412,245512,"src/main/resources/com/example/uservalidation/Posters/alfMabrok.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","Helmy",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Mohamed","Farag",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Basel","Hossam",(byte) 45,"Egypt","Director"));
//
//
//        movies.add(new Movie("Matab Sena3y",new ArrayList<>(Arrays.asList("Comedy", "Drama", "ForKids")),"Arabic","Egypt",6.6f,2006,2.11f,"Mimi, an ambitious young man, gets the chance to work for Farouq, a businessman. But when Farouq enters a coma, Mimi is forced to run his business and become the legal guardian of his daughter, Zeina.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/matabsena3y.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","Helmy",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Noor","",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ezzat","Abo Ouf",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Wael","Ihsan",(byte) 60,"Egypt","Director"));
//
//
//        movies.add(new Movie("Africano",new ArrayList<>(Arrays.asList("Action", "Comedy", "Drama","Romance")),"Arabic","Egypt",5.9f,2001,1.51f,"Bader travels to South Africa to collect his inheritance, an open zoo, which he shares with his cousin Jamila. Later, he finds out that the zoo has been taken over by someone.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/africano.jpeg"));
//        movies.getLast().addCast(new Cast("Monna","Zaky",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ahmed","El Sakka",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Amr","Arafa",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("Ahla El Aw2at",new ArrayList<>(Arrays.asList("Drama", "Romance", "Social")),"Arabic","Egypt",6.7f,2004,1.41f,"Salma is devastated after her mother's death and decides to leave the house where her stepfather lives. Her life changes when she starts receiving letters and cassettes from an unknown sender.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ahlaElAw2at.jpeg"));
//        movies.getLast().addCast(new Cast("Hend","Sabry",(byte) 45,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Menna","Shalaby",(byte) 46,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Hanan","Turk",(byte) 55,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Hala","Khaleel",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("Asef Ala El Ez3ag",new ArrayList<>(Arrays.asList("Drama", "Social", "Comedy")),"Arabic","Egypt",8.1f,2008,1.55f,"Hassan, a flight engineer who works on a project to reduce the cost of aviation fuel, gets schizophrenia after the death of his father. Later, he meets a beautiful girl and starts dating her.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/asefAlEz3ag.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","Helmy",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Menna","Shalaby",(byte) 46,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","Marei",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("Code 36",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",4.3f,2006,1.55f,"Sharif, a bodyguard, encounters various challenges when he is assigned to protect Noorhan, who is the target of a terrorist group.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/code36.jpeg"));
//        movies.getLast().addCast(new Cast("Mostafa","Shaaban",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ahmed","Samir",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("El Ba3d La Yazhab",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",8.3f,2021,1.41f,"When a technical error cancels the union of all married couples in Egypt, a journalist sets out to investigate the marital problems that arise, including his own.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elBa3dLaYazhab.jpeg"));
//        movies.getLast().addCast(new Cast("Karim","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Maged","El Kedwany",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ahmed","El-Gendy",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("Elbes 3ashan Khargen",new ArrayList<>(Arrays.asList("Comedy","Romance")),"Arabic","Egypt",4.1f,2016,1.45f,"Ramzi, a young man who fears commitment, meets Leila, his manager's daughter, and falls for her. One night, they stumble upon a bag full of cash and embark on dangerous adventures to find the owner.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elbes.jpeg"));
//        movies.getLast().addCast(new Cast("Hassan","El Radad",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Emy","Samir",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Bayomy","Fouad",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Nesreen","Amin",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","El-halfawy",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("El Dada Dody",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.1f,2008,1.45f,"A girl thief pretending to be a nanny so she can steal a rich man's house but his 6 children made her lose her mind.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ElDadaDody.jpeg"));
//        movies.getLast().addCast(new Cast("Yasmin","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Salah","Abdullah",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ali","Idrees",(byte) 46,"Egypt","Director"));
//
//
//
//        movies.add(new Movie("El Def",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",6.6f,2018,1.39f,"The Guest tells the story of a young man who visits a family during dinner, and then the events develop in a direction that no one expects.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/eldef.jpeg"));
//        movies.getLast().addCast(new Cast("Khaled","El Sawy",(byte) 54,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Shereen","Reda",(byte) 52,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ahmed","Malek",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Gamila","Awad",(byte) 36,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Hady","El-Bagory",(byte) 46,"Egypt","Director"));
//
//
//
//
//        movies.add(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//        movies.getLast().addCast(new Cast("Karim","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Hend","Sabry",(byte) 45,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Nelly","Karim",(byte) 47,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Eyad","Nassar",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","El Sawy",(byte) 54,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Shereen","Reda",(byte) 52,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Marwan","Hamed",(byte) 46,"Egypt","Director"));
//
//
//
//        movies.add(new Movie("El Feel El Azra2",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2014,2.51f,"Tired of his monotonous life, Yehia begins working at a psychiatric hospital. He meets an old friend, who has been accused of killing his wife, and delves into his psyche to understand his actions.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2One.jpeg"));
//        movies.getLast().addCast(new Cast("Karim","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Nelly","Karim",(byte) 47,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Marwan","Hamed",(byte) 46,"Egypt","Director"));
//
//
//
//        movies.add(new Movie("El Khaleya",new ArrayList<>(Arrays.asList("Action")),"Arabic","Egypt",6.3f,2017,2.11f,"Saif, a special operations officer, enlists the help of Officer Saber to avenge the death of his colleague, Amro, and hunt down multiple terror cells and Marwan, a terrorist.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elkhalya.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","Ezz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Mohamed","Mamdouh",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Amina","Khalil",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Tarek","El-aryan",(byte) 46,"Egypt","Director"));
//
//
//
//        movies.add(new Movie("El Sandok El Eswed",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",4.6f,2020,2.11f,"Two strangers break into Yasmine's house determined to locate and steal an important object. She fights back and tries to escape, will she be successful?",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elSnadokElEswed.jpeg"));
//        movies.getLast().addCast(new Cast("Monna","Zaky",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast( new Cast("Mohamed","Farag",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Mostafa","Khater",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Mahmoud","Kamel",(byte) 46,"Egypt","Director"));
//
//        movies.add(new Movie("Cazablanca",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",6.1f,2019,1.56f,"A group of robbers steal a large shipment of diamonds successfully, believing they have done the perfect crime until one of them betrays the others and runs away with the diamonds to Morocco.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/kazablanca.jpeg"));
//        movies.getLast().addCast(new Cast("Amir","Karara",(byte) 45,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Eyad","Nassar",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Amr","Abdelgelil",(byte) 58,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ghada","Adel",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("peter","Mimi",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("Kera w El Gen",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",7.9f,2022,2.55f,"Two men team up to fight against British occupation in Egypt during the 1919 revolution.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/keraWelGen.jpeg"));
//        movies.getLast().addCast(new Cast("Karim","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ahmed","Ezz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Marwan","Hamed",(byte) 46,"Egypt","Director"));
//
//
//        movies.add(new Movie("Laf w Dawaran",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.5f,2016,1.31f,"A wedding gets cancelled and Noor, a tourist guide, impersonates the groom to take advantage of their honeymoon package and meet his prospective bride at the fancy hotel.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/lafwdawaran.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","Helmy",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Donia","Samir",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Gamila","Awad",(byte) 36,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Bayomy","Fouad",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","Marei",(byte) 46,"Egypt","Director"));
//
//        movies.add(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","El Sakka",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Monna","Zaky",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Sherif","Mounir",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Noor","",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Salah","Abdullah",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Mervat","Amin",(byte) 54,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Gamila","Awad",(byte) 36,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Amr","Arafa",(byte) 46,"Egypt","Director"));
//
//
//
//
//        movies.add(new Movie("Nady El Regal El Sery",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",4.5f,2019,1.52f,"Where some men decide to assemble, and call it \"the secret men's club\", where the dentist helps Adham a group of male friends to join the club.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/nadyelregal.jpeg"));
//        movies.getLast().addCast(new Cast("Karim","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Maged","El Kedwany",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Ghada","Adel",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Bayomy","Fouad",(byte) 42,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","El-halfawy",(byte) 46,"Egypt","Director"));
//
//
//
//
//
//        movies.add(new Movie("Taymor W Shafika",new ArrayList<>(Arrays.asList("Action","Romance")),"Arabic","Egypt",5.8f,2007,1.39f,"Taimoor and Shafika are childhood sweethearts. Their love is put to the test when Shafika grows up to become a minister and Taimoor her bodyguard.",244432,221438,"src/main/resources/com/example/uservalidation/Posters/TaymorWShafika.jpeg"));
//        movies.getLast().addCast(new Cast("Ahmed","El Sakka",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Monna","Zaky",(byte) 51,"Egypt","Actor"));
//        movies.getLast().addCast(new Cast("Khaled","Marei",(byte) 46,"Egypt","Director"));
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        casts.add(new Cast("Ahmed","Helmy",(byte) 51,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Keda Reda",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.5f,2007,1.53f,"Identical triplet brothers, named Reda by their father, who was a con man, grow up and develop different personalities. They encounter trouble when the three of them fall for the same woman, Nadia.",204012,245512,"src/main/resources/com/example/uservalidation/Posters/kedareda.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("1000 Mabrouk",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.4f,2009,1.55f,"Ahmad faces many obstacles on his wedding day before succumbing to death at midnight. He panics after waking up in the morning as he realises he is stuck in a time loop and is reliving that day.",201412,245512,"src/main/resources/com/example/uservalidation/Posters/alfMabrok.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Matab Sena3y",new ArrayList<>(Arrays.asList("Comedy", "Drama", "ForKids")),"Arabic","Egypt",6.6f,2006,2.11f,"Mimi, an ambitious young man, gets the chance to work for Farouq, a businessman. But when Farouq enters a coma, Mimi is forced to run his business and become the legal guardian of his daughter, Zeina.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/matabsena3y.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Asef Ala El Ez3ag",new ArrayList<>(Arrays.asList("Drama", "Social", "Comedy")),"Arabic","Egypt",8.1f,2008,1.55f,"Hassan, a flight engineer who works on a project to reduce the cost of aviation fuel, gets schizophrenia after the death of his father. Later, he meets a beautiful girl and starts dating her.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/asefAlEz3ag.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Laf w Dawaran",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.5f,2016,1.31f,"A wedding gets cancelled and Noor, a tourist guide, impersonates the groom to take advantage of their honeymoon package and meet his prospective bride at the fancy hotel.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/lafwdawaran.jpeg"));
//
//
//        casts.add(new Cast("Ahmed","Ezz",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Khaleya",new ArrayList<>(Arrays.asList("Action")),"Arabic","Egypt",6.3f,2017,2.11f,"Saif, a special operations officer, enlists the help of Officer Saber to avenge the death of his colleague, Amro, and hunt down multiple terror cells and Marwan, a terrorist.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elkhalya.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Kera w El Gen",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",7.9f,2022,2.55f,"Two men team up to fight against British occupation in Egypt during the 1919 revolution.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/keraWelGen.jpeg"));
//
//
//        casts.add(new Cast("Eyad","Nassar",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Cazablanca",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",6.1f,2019,1.56f,"A group of robbers steal a large shipment of diamonds successfully, believing they have done the perfect crime until one of them betrays the others and runs away with the diamonds to Morocco.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/kazablanca.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//
//
//        casts.add(new Cast("Nelly","Karim",(byte) 47,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2014,2.51f,"Tired of his monotonous life, Yehia begins working at a psychiatric hospital. He meets an old friend, who has been accused of killing his wife, and delves into his psyche to understand his actions.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2One.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//
//
//
//        casts.add(new Cast("Hend","Sabry",(byte) 45,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Ahla El Aw2at",new ArrayList<>(Arrays.asList("Drama", "Romance", "Social")),"Arabic","Egypt",6.7f,2004,1.41f,"Salma is devastated after her mother's death and decides to leave the house where her stepfather lives. Her life changes when she starts receiving letters and cassettes from an unknown sender.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ahlaElAw2at.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//
//
//
//        casts.add(new Cast("Shereen","Reda",(byte) 52,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Def",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",6.6f,2018,1.39f,"The Guest tells the story of a young man who visits a family during dinner, and then the events develop in a direction that no one expects.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/eldef.jpeg"));
//
//
//
//        casts.add(new Cast("Khaled","El Sawy",(byte) 54,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Keda Reda",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.5f,2007,1.53f,"Identical triplet brothers, named Reda by their father, who was a con man, grow up and develop different personalities. They encounter trouble when the three of them fall for the same woman, Nadia.",204012,245512,"src/main/resources/com/example/uservalidation/Posters/kedareda.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Def",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",6.6f,2018,1.39f,"The Guest tells the story of a young man who visits a family during dinner, and then the events develop in a direction that no one expects.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/eldef.jpeg"));
//
//
//
//        casts.add(new Cast("Hanan","Turk",(byte) 55,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Ahla El Aw2at",new ArrayList<>(Arrays.asList("Drama", "Romance", "Social")),"Arabic","Egypt",6.7f,2004,1.41f,"Salma is devastated after her mother's death and decides to leave the house where her stepfather lives. Her life changes when she starts receiving letters and cassettes from an unknown sender.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ahlaElAw2at.jpeg"));
//
//
//        casts.add(new Cast("Menna","Shalaby",(byte) 46,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Keda Reda",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.5f,2007,1.53f,"Identical triplet brothers, named Reda by their father, who was a con man, grow up and develop different personalities. They encounter trouble when the three of them fall for the same woman, Nadia.",204012,245512,"src/main/resources/com/example/uservalidation/Posters/kedareda.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Asef Ala El Ez3ag",new ArrayList<>(Arrays.asList("Drama", "Social", "Comedy")),"Arabic","Egypt",8.1f,2008,1.55f,"Hassan, a flight engineer who works on a project to reduce the cost of aviation fuel, gets schizophrenia after the death of his father. Later, he meets a beautiful girl and starts dating her.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/asefAlEz3ag.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Ahla El Aw2at",new ArrayList<>(Arrays.asList("Drama", "Romance", "Social")),"Arabic","Egypt",6.7f,2004,1.41f,"Salma is devastated after her mother's death and decides to leave the house where her stepfather lives. Her life changes when she starts receiving letters and cassettes from an unknown sender.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ahlaElAw2at.jpeg"));
//
//
//
//        casts.add(new Cast("Amir","Karara",(byte) 45,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Cazablanca",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",6.1f,2019,1.56f,"A group of robbers steal a large shipment of diamonds successfully, believing they have done the perfect crime until one of them betrays the others and runs away with the diamonds to Morocco.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/kazablanca.jpeg"));
//
//
//        casts.add(new Cast("Ghada","Adel",(byte) 51,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Nady El Regal El Sery",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",4.5f,2019,1.52f,"Where some men decide to assemble, and call it \"the secret men's club\", where the dentist helps Adham a group of male friends to join the club.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/nadyelregal.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Cazablanca",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",6.1f,2019,1.56f,"A group of robbers steal a large shipment of diamonds successfully, believing they have done the perfect crime until one of them betrays the others and runs away with the diamonds to Morocco.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/kazablanca.jpeg"));
//
//
//        casts.add(new Cast("Amr","Abdelgelil",(byte) 58,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Cazablanca",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",6.1f,2019,1.56f,"A group of robbers steal a large shipment of diamonds successfully, believing they have done the perfect crime until one of them betrays the others and runs away with the diamonds to Morocco.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/kazablanca.jpeg"));
//
//
//        casts.add(new Cast("Ahmed","El Sakka",(byte) 51,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Taymor W Shafika",new ArrayList<>(Arrays.asList("Action","Romance")),"Arabic","Egypt",5.8f,2007,1.39f,"Taimoor and Shafika are childhood sweethearts. Their love is put to the test when Shafika grows up to become a minister and Taimoor her bodyguard.",244432,221438,"src/main/resources/com/example/uservalidation/Posters/TaymorWShafika.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Africano",new ArrayList<>(Arrays.asList("Action", "Comedy", "Drama","Romance")),"Arabic","Egypt",5.9f,2001,1.51f,"Bader travels to South Africa to collect his inheritance, an open zoo, which he shares with his cousin Jamila. Later, he finds out that the zoo has been taken over by someone.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/africano.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//
//
//
//        casts.add(new Cast("Sherif","Mounir",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//
//
//        casts.add(new Cast("Monna","Zaky",(byte) 51,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Taymor W Shafika",new ArrayList<>(Arrays.asList("Action","Romance")),"Arabic","Egypt",5.8f,2007,1.39f,"Taimoor and Shafika are childhood sweethearts. Their love is put to the test when Shafika grows up to become a minister and Taimoor her bodyguard.",244432,221438,"src/main/resources/com/example/uservalidation/Posters/TaymorWShafika.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Africano",new ArrayList<>(Arrays.asList("Action", "Comedy", "Drama","Romance")),"Arabic","Egypt",5.9f,2001,1.51f,"Bader travels to South Africa to collect his inheritance, an open zoo, which he shares with his cousin Jamila. Later, he finds out that the zoo has been taken over by someone.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/africano.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Sandok El Eswed",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",4.6f,2020,2.11f,"Two strangers break into Yasmine's house determined to locate and steal an important object. She fights back and tries to escape, will she be successful?",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elSnadokElEswed.jpeg"));
//
//
//
//        casts.add(new Cast("Salah","Abdullah",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Dada Dody",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.1f,2008,1.45f,"A girl thief pretending to be a nanny so she can steal a rich man's house but his 6 children made her lose her mind.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ElDadaDody.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//
//
//        casts.add(new Cast("Mervat","Amin",(byte) 54,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//
//
//        casts.add(new Cast("Gamila","Awad",(byte) 36,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Laf w Dawaran",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.5f,2016,1.31f,"A wedding gets cancelled and Noor, a tourist guide, impersonates the groom to take advantage of their honeymoon package and meet his prospective bride at the fancy hotel.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/lafwdawaran.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Def",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",6.6f,2018,1.39f,"The Guest tells the story of a young man who visits a family during dinner, and then the events develop in a direction that no one expects.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/eldef.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//
//
//        casts.add(new Cast("Maged","El Kedwany",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Nady El Regal El Sery",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",4.5f,2019,1.52f,"Where some men decide to assemble, and call it \"the secret men's club\", where the dentist helps Adham a group of male friends to join the club.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/nadyelregal.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Ba3d La Yazhab",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",8.3f,2021,1.41f,"When a technical error cancels the union of all married couples in Egypt, a journalist sets out to investigate the marital problems that arise, including his own.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elBa3dLaYazhab.jpeg"));
//
//
//
//        casts.add(new Cast("Yasmin","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Dada Dody",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.1f,2008,1.45f,"A girl thief pretending to be a nanny so she can steal a rich man's house but his 6 children made her lose her mind.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/ElDadaDody.jpeg"));
//
//
//        casts.add(new Cast("Mohamed","Farag",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("1000 Mabrouk",new ArrayList<>(Arrays.asList("Comedy", "ForKids", "Drama")),"Arabic","Egypt",7.4f,2009,1.55f,"Ahmad faces many obstacles on his wedding day before succumbing to death at midnight. He panics after waking up in the morning as he realises he is stuck in a time loop and is reliving that day.",201412,245512,"src/main/resources/com/example/uservalidation/Posters/alfMabrok.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Sandok El Eswed",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",4.6f,2020,2.11f,"Two strangers break into Yasmine's house determined to locate and steal an important object. She fights back and tries to escape, will she be successful?",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elSnadokElEswed.jpeg"));
//
//
//        casts.add(new Cast("Mostafa","Khater",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Sandok El Eswed",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",4.6f,2020,2.11f,"Two strangers break into Yasmine's house determined to locate and steal an important object. She fights back and tries to escape, will she be successful?",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elSnadokElEswed.jpeg"));
//
//
//        casts.add(new Cast("Bayomy","Fouad",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Laf w Dawaran",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.5f,2016,1.31f,"A wedding gets cancelled and Noor, a tourist guide, impersonates the groom to take advantage of their honeymoon package and meet his prospective bride at the fancy hotel.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/lafwdawaran.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Nady El Regal El Sery",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",4.5f,2019,1.52f,"Where some men decide to assemble, and call it \"the secret men's club\", where the dentist helps Adham a group of male friends to join the club.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/nadyelregal.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Elbes 3ashan Khargen",new ArrayList<>(Arrays.asList("Comedy","Romance")),"Arabic","Egypt",4.1f,2016,1.45f,"Ramzi, a young man who fears commitment, meets Leila, his manager's daughter, and falls for her. One night, they stumble upon a bag full of cash and embark on dangerous adventures to find the owner.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elbes.jpeg"));
//
//
//
//        casts.add(new Cast("Mohamed","Mamdouh",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Khaleya",new ArrayList<>(Arrays.asList("Action")),"Arabic","Egypt",6.3f,2017,2.11f,"Saif, a special operations officer, enlists the help of Officer Saber to avenge the death of his colleague, Amro, and hunt down multiple terror cells and Marwan, a terrorist.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elkhalya.jpeg"));
//
//
//        casts.add(new Cast("Amina","Khalil",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Khaleya",new ArrayList<>(Arrays.asList("Action")),"Arabic","Egypt",6.3f,2017,2.11f,"Saif, a special operations officer, enlists the help of Officer Saber to avenge the death of his colleague, Amro, and hunt down multiple terror cells and Marwan, a terrorist.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elkhalya.jpeg"));
//
//
//        casts.add(new Cast("Mostafa","Shaaban",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Code 36",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",4.3f,2006,1.55f,"Sharif, a bodyguard, encounters various challenges when he is assigned to protect Noorhan, who is the target of a terrorist group.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/code36.jpeg"));
//
//
//
//        casts.add(new Cast("Ahmed","Malek",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Def",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",6.6f,2018,1.39f,"The Guest tells the story of a young man who visits a family during dinner, and then the events develop in a direction that no one expects.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/eldef.jpeg"));
//
//        casts.add(new Cast("Donia","Samir",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Laf w Dawaran",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",5.5f,2016,1.31f,"A wedding gets cancelled and Noor, a tourist guide, impersonates the groom to take advantage of their honeymoon package and meet his prospective bride at the fancy hotel.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/lafwdawaran.jpeg"));
//
//
//        casts.add(new Cast("Noor","",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Matab Sena3y",new ArrayList<>(Arrays.asList("Comedy", "Drama", "ForKids")),"Arabic","Egypt",6.6f,2006,2.11f,"Mimi, an ambitious young man, gets the chance to work for Farouq, a businessman. But when Farouq enters a coma, Mimi is forced to run his business and become the legal guardian of his daughter, Zeina.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/matabsena3y.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Men 30 Sana",new ArrayList<>(Arrays.asList("Drama")),"Arabic","Egypt",7.1f,2016,2.25f,"Omar decides to give his wealth to his family members but warns them that the money is cursed. His cousin Emad believes him after a series of awful accidents and they set out to uncover the mystery.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/mn30Sana.jpeg"));
//
//
//        casts.add(new Cast("Ezzat","Abo Ouf",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Matab Sena3y",new ArrayList<>(Arrays.asList("Comedy", "Drama", "ForKids")),"Arabic","Egypt",6.6f,2006,2.11f,"Mimi, an ambitious young man, gets the chance to work for Farouq, a businessman. But when Farouq enters a coma, Mimi is forced to run his business and become the legal guardian of his daughter, Zeina.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/matabsena3y.jpeg"));
//
//
//        casts.add(new Cast("Nesreen","Amin",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Elbes 3ashan Khargen",new ArrayList<>(Arrays.asList("Comedy","Romance")),"Arabic","Egypt",4.1f,2016,1.45f,"Ramzi, a young man who fears commitment, meets Leila, his manager's daughter, and falls for her. One night, they stumble upon a bag full of cash and embark on dangerous adventures to find the owner.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elbes.jpeg"));
//
//
//        casts.add(new Cast("Emy","Samir",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Elbes 3ashan Khargen",new ArrayList<>(Arrays.asList("Comedy","Romance")),"Arabic","Egypt",4.1f,2016,1.45f,"Ramzi, a young man who fears commitment, meets Leila, his manager's daughter, and falls for her. One night, they stumble upon a bag full of cash and embark on dangerous adventures to find the owner.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elbes.jpeg"));
//
//
//        casts.add(new Cast("Hassan","El Radad",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Elbes 3ashan Khargen",new ArrayList<>(Arrays.asList("Comedy","Romance")),"Arabic","Egypt",4.1f,2016,1.45f,"Ramzi, a young man who fears commitment, meets Leila, his manager's daughter, and falls for her. One night, they stumble upon a bag full of cash and embark on dangerous adventures to find the owner.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elbes.jpeg"));
//
//        casts.add(new Cast("Karim","Abdelaziz",(byte) 42,"Egypt","Actor"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Kera w El Gen",new ArrayList<>(Arrays.asList("Action","Drama")),"Arabic","Egypt",7.9f,2022,2.55f,"Two men team up to fight against British occupation in Egypt during the 1919 revolution.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/keraWelGen.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2 ||",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2019,2.11f,"A new inmate in the psychiatric hospital turns Dr. Yehia's life upside down when he foretells the death of his entire family.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2Two.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Feel El Azra2",new ArrayList<>(Arrays.asList("Horror","Drama")),"Arabic","Egypt",8.1f,2014,2.51f,"Tired of his monotonous life, Yehia begins working at a psychiatric hospital. He meets an old friend, who has been accused of killing his wife, and delves into his psyche to understand his actions.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elFeelElAzra2One.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("Nady El Regal El Sery",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",4.5f,2019,1.52f,"Where some men decide to assemble, and call it \"the secret men's club\", where the dentist helps Adham a group of male friends to join the club.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/nadyelregal.jpeg"));
//        casts.get(casts.size()-1).setActedMovie(new Movie("El Ba3d La Yazhab",new ArrayList<>(Arrays.asList("Comedy","Drama")),"Arabic","Egypt",8.3f,2021,1.41f,"When a technical error cancels the union of all married couples in Egypt, a journalist sets out to investigate the marital problems that arise, including his own.",251410,221438,"src/main/resources/com/example/uservalidation/Posters/elBa3dLaYazhab.jpeg"));
//
//
//
//


        stage.setOnCloseRequest(windowEvent -> {
            saveUsersToFile("USERSS.txt");
            saveMoviesToFile("MOVIESS.txt");
            saveCastToFile("CASTSS.txt");
        });







        for (Cast it : casts)
        {
            System.out.println(it);
        }




        for (Movie it : movies)
        {
            System.out.println(it);
        }




        for (User it : users)
        {
            System.out.println(it);
        }



        //WHEN THE admin  LOG IN
        // this must run onceeee
//        StatisticsManager.analyseMonthRevenue();



        if(users.isEmpty())
        {
            User.userIdCounter=0;
        }
        else
        {
            User.userIdCounter=users.get(users.size()-1).getUserId();
        }





        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Watch it");
        Image icon = new Image(getClass().getResourceAsStream("/com/example/uservalidation/wwww.png"));
        stage.getIcons().add(icon);
        stage.setWidth(1293);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}