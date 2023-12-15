//package com.example.uservalidation;
//
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.ScrollPane;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.TilePane;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//import java.io.File;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.ResourceBundle;
//
//public class HomeController implements Initializable {
//
//    @FXML
//    private TilePane movieTilePane;
//
//
//
//
//
//    private void loadMovies() {
//        for (Movie movie : HelloApplication.movies) {
//            addMovieToHome(movie);
//        }
//    }
//
//    private void addMovieToHome(Movie movie) {
//
//        // Create an HBox to hold the Label
//        StackPane movieBox = new StackPane();
//
//
//        File file = new File(movie.getPoster());
//
//
//        ImageView posterImageView = new ImageView();
//        posterImageView.setImage(new Image(file.toURI().toString()));
//        posterImageView.setFitWidth(235);
//        posterImageView.setFitHeight(150);
//
//        Rectangle clip = new Rectangle(posterImageView.getFitWidth(), posterImageView.getFitHeight());
//        clip.setArcWidth(20);
//        clip.setArcHeight(20);
//        posterImageView.setClip(clip);
//
//
//        Label movieLabel = new Label(movie.getTitle());
//        movieLabel.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:0 0 10 10");
//
//
////        movieBox.setSpacing(50.0);
//        movieBox.setStyle("-fx-border-color: black;");
//        movieBox.getChildren().addAll(posterImageView,movieLabel);
//
//        movieBox.setAlignment(movieLabel, Pos.BOTTOM_LEFT);
//
//        movieTilePane.setHgap(10.0);
//        movieTilePane.setVgap(10.0);
//        movieTilePane.getChildren().add(movieBox);
//
//    }
//
////    private Movie[] movies = {
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412,"C:/Users/ahmed nader ahmed/IdeaProjects/untitled/UserValidation/src/main/resources/com/example/uservalidation/Posters/weladRezk.jpg"),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
//////            new Movie(2, "Rivo", types, "Arabic", "Egypt",8.1f, 2010, 1.5f, "kskskskssks", 30000, 205412),
////
////            // Add more movies as needed
////    };
//
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//
//        movieTilePane.setStyle("-fx-background-color: black; -fx-padding: 10px;");
//
//
//        loadMovies();
//
//        ScrollPane scrollPane = new ScrollPane();
//        scrollPane.setContent(movieTilePane);
//        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
//
//
//
//    }
//}
