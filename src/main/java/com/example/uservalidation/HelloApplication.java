package com.example.uservalidation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {



    public static ArrayList<User> users = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {

        users.add(new User("Ahmed","Nader","_Naderr","ahmed412naderr@gmail.com","12345678"));
        users.add(new User("Farrah","Sherif","_Farrah","farrah23sherif@gmail.com","87654321"));

        users.get(0).getInfo();
        users.get(1).getInfo();


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