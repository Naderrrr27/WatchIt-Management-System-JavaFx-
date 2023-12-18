package com.example.uservalidation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MenuController implements Initializable{

    @FXML
    private AnchorPane genera1;

    @FXML
    private AnchorPane history1;

    @FXML
    private AnchorPane home1;

    @FXML
    private AnchorPane list1;

    @FXML
    private AnchorPane movie1;

    @FXML
    private Label subLabel;

    @FXML
    private ImageView search1;

    @FXML
    private ImageView userAcc1;

    @FXML
    private AnchorPane bigConrainer;

    @FXML
    private Label profileLabel;

    @FXML
    private AnchorPane cancelSearch;

    @FXML
    private AnchorPane bigConSearch;

    @FXML
    private TextField searchFeild;

    @FXML
    private Label warningSearch;

    @FXML
    private AnchorPane contForSAndIcon;

    @FXML
    private VBox fakeCombo;

    @FXML
    private ImageView fakeIqon;

    @FXML
    private AnchorPane closeDropDown;

    @FXML
    private Label realUserName;

    @FXML
    private TilePane movieTilePane1;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Label closeLabel;

    @FXML
    private AnchorPane userNomAnchor;

    @FXML
    private Label signOutLabel;


    @FXML
    void gPressed(MouseEvent event) {
        genera1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
        history1.setStyle("-fx-background-color: transparent ;");
        movie1.setStyle("-fx-background-color: transparent ;");
        list1.setStyle("-fx-background-color: transparent ;");
        home1.setStyle("-fx-background-color: transparent ;");
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }

    @FXML
    void historyPressed(MouseEvent event) {
        history1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
        movie1.setStyle("-fx-background-color: transparent ;");
        list1.setStyle("-fx-background-color: transparent ;");
        home1.setStyle("-fx-background-color: transparent ;");
        genera1.setStyle("-fx-background-color: transparent;");
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }

    @FXML
    void homePressed(MouseEvent event) {
        home1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
        movie1.setStyle("-fx-background-color: transparent ;");
        list1.setStyle("-fx-background-color: transparent ;");
        genera1.setStyle("-fx-background-color: transparent;");
        history1.setStyle("-fx-background-color: transparent ;");
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }

    @FXML
    void listPressed(MouseEvent event) {
        list1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
        genera1.setStyle("-fx-background-color: transparent;");
        history1.setStyle("-fx-background-color: transparent ;");
        home1.setStyle("-fx-background-color:transparent;");
        movie1.setStyle("-fx-background-color: transparent ;");
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }

    @FXML
    void moviePressed(MouseEvent event) {
        movie1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
        list1.setStyle("-fx-background-color: transparent ;");
        home1.setStyle("-fx-background-color: transparent ;");
        genera1.setStyle("-fx-background-color: transparent;");
        history1.setStyle("-fx-background-color: transparent ;");
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }

    @FXML
    void searchPressed(MouseEvent event) {
        bigConrainer.setVisible(false);
        bigConSearch.setVisible(true);
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }

    @FXML
    void cancelSsearch(MouseEvent event) {
        bigConrainer.setVisible(true);
        bigConSearch.setVisible(false);
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
        warningSearch.setVisible(false);
        searchFeild.clear();
    }


    @FXML
    void userAccPressed(MouseEvent event) {
        fakeCombo.setVisible(true);
        fakeIqon.setVisible(true);
    }

    @FXML
    void validateSearch(KeyEvent event) {
//        System.out.println(searchFeild.getText().length());
        if(searchFeild.getText().length()  < 3 && searchFeild.getText().length() > 0)
            warningSearch.setVisible(true);
        else
            warningSearch.setVisible(false);
    }

    @FXML
    void hoverSearch(MouseEvent event) {
        contForSAndIcon.setStyle("-fx-border-color:rgba(172, 172, 172, 0.5);");
    }
    @FXML
    void noHoverSearch(MouseEvent event) {
        contForSAndIcon.setStyle("-fx-border-color:rgba(172, 172, 172, 0.3);");
    }

    @FXML
    void closeThis(MouseEvent event) {
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }






////////

        @FXML
    void userrHoverIn(MouseEvent event) {
        realUserName.setStyle("-fx-text-fill: rgba(220, 165, 35, 6.0);");
    }

    @FXML
    void userrHoverOut(MouseEvent event) {
        realUserName.setStyle("-fx-text-fill: white");
    }
    @FXML
    void profileHoverIn(MouseEvent event) {
        profileLabel.setStyle("-fx-text-fill: rgba(220, 165, 35, 6.0);");
    }

    @FXML
    void profileHoverOut(MouseEvent event) {
        profileLabel.setStyle("-fx-text-fill: white");
    }
    @FXML
    void hoverSignOutLabelIn(MouseEvent event) {
        signOutLabel.setStyle("-fx-text-fill: rgba(220, 165, 35, 6.0);");
    }

    @FXML
    void hoverSignOutLabelOut(MouseEvent event) {
        signOutLabel.setStyle("-fx-text-fill: white;");
    }

    @FXML
    void subHoverIn(MouseEvent event) {
        subLabel.setStyle("-fx-text-fill: rgba(220, 165, 35, 6.0);");
    }

    @FXML
    void subHoverOut(MouseEvent event) {
        subLabel.setStyle("-fx-text-fill: white");
    }

    @FXML
    void closeHoverrIn(MouseEvent event) {
        closeLabel.setStyle("-fx-text-fill: rgba(220, 165, 35, 6.0);");
    }

    @FXML
    void closeHoverrOut(MouseEvent event) {
        closeLabel.setStyle("-fx-text-fill: white;");
    }

    private void loadMovies() {
        for (int i=0;i<HelloApplication.movies.size();i++)
        {
            addMovieToHome(HelloApplication.movies.get(i));
        }
    }

    private void addMovieToHome(Movie movie) {

        StackPane movieBox = new StackPane();


        File file = new File(movie.getPoster());


        ImageView posterImageView = new ImageView();
        posterImageView.setImage(new Image(file.toURI().toString()));
        posterImageView.setFitWidth(305);
        posterImageView.setFitHeight(150);
        posterImageView.setOpacity(0.85);

        Rectangle clip = new Rectangle(posterImageView.getFitWidth(), posterImageView.getFitHeight());
        clip.setArcWidth(20);
        clip.setArcHeight(20);
        posterImageView.setClip(clip);

        Glow glow = new Glow();
        glow.setLevel(0.9);



        Label movieLabel = new Label(movie.getTitle());
        movieLabel.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:10 10 10 10; ");
        movieLabel.setEffect(glow);
        movieBox.setStyle("-fx-border-color: black;");

        movieBox.getChildren().addAll(posterImageView,movieLabel);

        movieBox.setOnMouseEntered(event -> {
            movieBox.setOpacity(0.5);
            movieBox.setCursor(Cursor.HAND);
        });

        movieBox.setOnMouseExited(event -> {
            movieBox.setOpacity(1.0);
            movieBox.setCursor(Cursor.DEFAULT);
        });

        movieBox.setOnMouseClicked(event ->{
            showPoster(movie);
        });

        movieBox.setAlignment(movieLabel, Pos.BOTTOM_LEFT);
        movieTilePane1.setHgap(10.0);
        movieTilePane1.setVgap(10.0);


        movieTilePane1.getChildren().add(movieBox);



    }
    private void showPoster(Movie movie) {

        VBox movieBox = new VBox();

       
        File im = new File("src/main/resources/com/example/uservalidation/icons/watch.png");
        File ad = new File("src/main/resources/com/example/uservalidation/icons/add.png");

        File file = new File(movie.getPoster());

        movieTilePane1.getChildren().clear();


        ImageView moviePoster = new ImageView(new Image(file.toURI().toString()));
        moviePoster.setFitWidth(800);
        moviePoster.setFitHeight(400);

        Rectangle clip = new Rectangle(moviePoster.getFitWidth(), moviePoster.getFitHeight());
        clip.setArcWidth(25);
        clip.setArcHeight(25);
        moviePoster.setClip(clip);

        Label movieTitle = new Label(movie.getTitle());
        movieTitle.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;");

        Label movieDescription = new Label(movie.getMovieDescription());
        movieDescription.setStyle("-fx-text-fill: white;-fx-font-weight: 700;-fx-padding: 0 10 10 10;");
        movieDescription.setWrapText(true);

        movieTitle.setPadding(new Insets(0, 0, 0, 0));
        movieDescription.setPadding(new Insets(0, 0, 0, 0));


        Button watch = new Button("Watch");
        Button add = new Button("My List");

        ImageView playIcon = new ImageView(new Image(im.toURI().toString()));
        ImageView addIcon = new ImageView(new Image(ad.toURI().toString()));
        addIcon.setFitWidth(20);
        addIcon.setFitHeight(20);

        playIcon.setFitWidth(20);
        playIcon.setFitHeight(20);

        watch.setGraphic(playIcon);

        playIcon.setFitWidth(20);
        playIcon.setFitHeight(20);

        add.setGraphic(addIcon);


        movieTilePane1.setPrefWidth(1250);

        movieTilePane1.setPrefHeight(500);
        movieTilePane1.setPrefTileWidth(1280);


        watch.setStyle("-fx-text-fill: black; -fx-font-size: 19;-fx-font-weight: 700; -fx-background-color: white;");
        watch.setPrefSize(150,50);

        add.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700; -fx-background-color: #383533;");
        add.setPrefSize(150,50);

        ArrayList<ImageView> rates = new ArrayList<>();
        for (int i=0;i<5;i++)
        {
            File beforeRateIm=new File("src/main/resources/com/example/uservalidation/icons/beforeRating.png");
            rates.add(new ImageView(new Image(beforeRateIm.toURI().toString())));
            rates.get(i).setFitWidth(50);
            rates.get(i).setFitHeight(50);
        }

        VBox rightInfo = new VBox();




        movieBox.setStyle("-fx-padding:20px");

        HBox ratees = new HBox();
        ratees.getChildren().addAll(rates);


        HBox buttons = new HBox();
        buttons.getChildren().addAll(watch,add);

        Label year = new Label(Integer.toString(movie.getYear())+" "+movie.getRunningtime());
        year.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;");


        rightInfo.getChildren().addAll(movieTitle,year,buttons);


        HBox head = new HBox();
        head.setSpacing(10);




        head.getChildren().addAll(moviePoster,rightInfo);


        movieBox.getChildren().addAll(head, movieDescription);

        movieBox.setSpacing(10);
        buttons.setSpacing(20);



        movieTilePane1.getChildren().addAll(movieBox);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 10px;");


        loadMovies();


        scrollPane.setContent(movieTilePane1);
        scrollPane.setStyle("-fx-background-color: #0F0A05;");

        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    }



}
