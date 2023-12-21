package com.example.uservalidation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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



        loadUsersFromFile("Users.txt");

        loadMoviesFromFile("movies.txt");

        loadCastFromFile("casts.txt");


        stage.setOnCloseRequest(event -> {
            saveMoviesToFile("movies.txt");
            saveCastToFile("casts.txt");
            saveUsersToFile("Users.txt");
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






        if(users.isEmpty())
        {
            User.userIdCounter=0;
        }
        else
        {
            User.userIdCounter=users.get(users.size()-1).getUserId();
        }








        Genra.addToGenres();



        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setWidth(1293);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}