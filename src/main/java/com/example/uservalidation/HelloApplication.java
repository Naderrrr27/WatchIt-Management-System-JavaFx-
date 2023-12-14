package com.example.uservalidation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.util.ArrayList;

public class HelloApplication extends Application {

    public static ArrayList<User> users = new ArrayList<>();
    public static File file = new File("users.txt");

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


    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {

        loadUsersFromFile("users.txt");


        if(users.isEmpty())
        {
            User.userIdCounter=0;
        }
        else
        {
            User.userIdCounter=users.get(users.size()-1).userId;
        }

        for (User it : users)
        {
            System.out.println(it);
        }




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