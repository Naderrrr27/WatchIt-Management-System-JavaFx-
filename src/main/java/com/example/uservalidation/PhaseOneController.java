package com.example.uservalidation;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhaseOneController implements Initializable {

    @FXML
    private TextField emailSignIn;

    @FXML
    private TextField emailSignUp;

    @FXML
    private TextField firstNameSignUp;

    @FXML
    private TextField lastNameSignUp;

    @FXML
    private PasswordField passwordSignIn;

    @FXML
    private PasswordField passwordSignUp;

    @FXML
    private AnchorPane signInForm;

    @FXML
    private Hyperlink signInHyper;

    @FXML
    private AnchorPane signUpForm;

    @FXML
    private Hyperlink signUpHyper;

    @FXML
    private Button submitSignIn;

    @FXML
    private Button submitSignUp;

    @FXML
    private Button topSignInButton;

    @FXML
    private Button topSingUpButton;

    @FXML
    private TextField userNameSignUp;

    @FXML
    private Label emailValid;

    @FXML
    private Label passwordValid;

    @FXML
    private Label fullNameValid;

    @FXML
    private Label userNameValid;

    @FXML
    private Label emailSignUpValid;

    @FXML
    private Label passwordSignUpValid;

    private boolean valid;


    @FXML
    private AnchorPane basicPlan;

    @FXML
    private Label basicTxt;

    @FXML
    private Label capacityB;

    @FXML
    private Label priceB;

    @FXML
    private AnchorPane standardPLan;

    @FXML
    private AnchorPane prePlan;

    @FXML
    private ImageView selectBasic;

    @FXML
    private ImageView standardSelect;

    @FXML
    private ImageView premiumSelect;

    @FXML
    private Label describeNote;

    @FXML
    private Label priceStand;

    @FXML
    private Label standTxt;

    @FXML
    private Label capStand;

    @FXML
    private Label capP;

    @FXML
    private Label preTxt;

    @FXML
    private Label priceP;

    @FXML
    private Button subBtttn;

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
    private AnchorPane subscriptionPlanss;
    String userPlan = "";

    public boolean validEmail()
    {
        Pattern emailPat = Pattern.compile("^[A-z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);

        Matcher match = emailPat.matcher(emailSignUp.getText());

        if(match.find())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void firstNameWriting()
    {
        firstNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        fullNameValid.setVisible(false);
    }
    public void lastNameWriting()
    {
        lastNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        fullNameValid.setVisible(false);
    }
    public void userNameWriting()
    {
        userNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        userNameValid.setVisible(false);
    }
    public void emailUpWriting()
    {
        emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        emailSignUpValid.setVisible(false);
    }
    public void passwordUpWriting()
    {
        passwordSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        passwordSignUpValid.setVisible(false);
    }

    public boolean isUsernameExist()
    {
        for (User itt : HelloApplication.users)
        {
            if(userNameSignUp.getText().equals(itt.getUserName()))
            {
                return true;
            }

        }

        return false;
    }

    public boolean isEmailExist()
    {
        for (User it : HelloApplication.users)
        {
            if(emailSignUp.getText().equals(it.getEmail()))
            {
                return true;
            }
        }

        return false;
    }

    public void subscribeNow(ActionEvent event)
    {
        for (User it : HelloApplication.users)
        {
            if(it.isActive()==true && !userPlan.isEmpty())
            {
                it.setSubscriptionActive(true);
                it.setSubscription(new Subscription(userPlan));

                HelloApplication.saveUsersToFile("users.txt");

                break;
            }
        }
    }

    public void signUp() throws IOException {
        if (firstNameSignUp.getText().isEmpty()||lastNameSignUp.getText().isEmpty()||userNameSignUp.getText().isEmpty()||emailSignUp.getText().isEmpty()||passwordSignUp.getText().isEmpty())
        {
            if (firstNameSignUp.getText().isEmpty())
            {
                firstNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
                fullNameValid.setText("Full Name is required");
                fullNameValid.setVisible(true);
            }
            if (lastNameSignUp.getText().isEmpty())
            {
                lastNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
                fullNameValid.setText("Full Name is required");
                fullNameValid.setVisible(true);
            }
            if (userNameSignUp.getText().isEmpty())
            {
                userNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
                userNameValid.setText("This field is required");
                userNameValid.setVisible(true);
            }
            if (emailSignUp.getText().isEmpty())
            {
                emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
                emailSignUpValid.setText("This field is required");
                emailSignUpValid.setVisible(true);
            }
            if (passwordSignUp.getText().isEmpty())
            {
                passwordSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
                passwordSignUpValid.setText("This field is required");
                passwordSignUpValid.setVisible(true);
            }
        }
        else if (isUsernameExist())
        {
            userNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            userNameValid.setText("This already existing");
            userNameValid.setVisible(true);
        }
        else if (isEmailExist())
        {
            emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            emailSignUpValid.setText("This already existing");
            emailSignUpValid.setVisible(true);
        }
        else if(validEmail()==false)
        {
            System.out.println(11);
            emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            emailSignUpValid.setStyle("-fx-font-size: 15;");
            emailSignUpValid.setText("Invalid email address");
            emailSignUpValid.setVisible(true);
        }
        else if(passwordSignUp.getText().length()<8)
        {
            passwordSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            passwordSignUpValid.setText("At least 8 characters");
            passwordSignUpValid.setVisible(true);
        }
        else
        {
            HelloApplication.users.add(new User(firstNameSignUp.getText(),lastNameSignUp.getText(),userNameSignUp.getText(),emailSignUp.getText(),passwordSignUp.getText()));
            HelloApplication.saveUsersToFile("users.txt");


            HelloApplication.users.get(HelloApplication.users.size()-1).setActive(true);


            subscriptionPlanss.setVisible(true);
            signInForm.setVisible(false);
            signUpForm.setVisible(false);

        }
    }

    public void signOut(ActionEvent event)
    {
        signInForm.setVisible(true);
        signUpForm.setVisible(false);
        subscriptionPlanss.setVisible(false);

        for(User it : HelloApplication.users)
        {
            if(it.isActive()==true)
            {
                it.setActive(false);
                break;
            }
        }

    }

    public void emailWriting()
    {
        emailSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        emailValid.setVisible(false);
    }
    public void passwordWriting()
    {
        passwordSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #DCA523;");
        passwordValid.setVisible(false);
    }

    public void signIn(ActionEvent event)
    {
        if(emailSignIn.getText().isEmpty()||passwordSignIn.getText().isEmpty())
        {
            if (emailSignIn.getText().isEmpty())
            {
                emailValid.setText("This field is required");
                emailValid.setVisible(true);
                emailSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            }
            if (passwordSignIn.getText().isEmpty())
            {
                passwordValid.setText("This field is required");
                passwordValid.setVisible(true);
                passwordSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            }

        }
        else
        {
            for (User it : HelloApplication.users)
            {
                if(emailSignIn.getText().equals(it.getEmail())&&passwordSignIn.getText().equals(it.getPassword()))
                {
                    if(it.isSubscriptionActive()==false)
                    {
                        subscriptionPlanss.setVisible(true);
                        signInForm.setVisible(false);
                        signUpForm.setVisible(false);
                        it.setActive(true);
                    }
                    else
                    {
                        emailSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #1de03a;");
                        passwordSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #1de03a;");
                        emailValid.setVisible(false);
                        passwordValid.setVisible(false);
                    }

                    this.valid=true;
                    break;
                }
            }
            if(this.valid==false)
            {
                emailValid.setText("Invalid email address");
                emailValid.setVisible(true);
                passwordValid.setVisible(false);
                emailSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
                passwordSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            }
            else
            {
                this.valid=false;
            }
        }
    }

    public void switchForm(ActionEvent event)
    {
        if(event.getSource()==signInHyper||event.getSource()==topSignInButton)
        {
            signUpForm.setVisible(true);
            signInForm.setVisible(false);
        }
        else if (event.getSource()==signUpHyper||event.getSource()==topSingUpButton)
        {
            signInForm.setVisible(true);
            signUpForm.setVisible(false);
        }
    }



    @FXML
    void basicSelected(MouseEvent event) {
        selectBasic.setVisible(true);
        premiumSelect.setVisible(false);
        standardSelect.setVisible(false);
        basicPlan.setStyle("-fx-border-width: 4.5px; -fx-border-color: #dca523; -fx-border-style: solid; -fx-start-margin: 4px; -fx-border-radius: 10px;");
        basicTxt.setStyle("-fx-text-fill: white;");
        capacityB.setStyle("-fx-text-fill: white;");
        priceB.setStyle("-fx-text-fill: white;");
        standTxt.setStyle("-fx-text-fill: #acacac;");
        capStand.setStyle("-fx-text-fill: #acacac;");
        priceStand.setStyle("-fx-text-fill: #acacac;");
        preTxt.setStyle("-fx-text-fill: #acacac;");
        capP.setStyle("-fx-text-fill: #acacac;");
        priceP.setStyle("-fx-text-fill: #acacac;");
        subBtttn.setStyle("-fx-text-fill: black;");
        standardPLan.setStyle("-fx-border-width : 0 ;");
        prePlan.setStyle(" -fx-border-width : 0 ;");
        describeNote.setText("You can watch only 5 movies in 30 days");
        userPlan = "Basic" ;
    }

    @FXML
    void standardSelected(MouseEvent event) {
        selectBasic.setVisible(false);
        premiumSelect.setVisible(false);
        standardSelect.setVisible(true);
        standardPLan.setStyle("-fx-border-width: 4.5px; -fx-border-color: #dca523; -fx-border-style: solid; -fx-start-margin: 4px; -fx-border-radius: 10px;");
        basicPlan.setStyle(" -fx-border-width : 0 ;");
        standTxt.setStyle("-fx-text-fill: white;");
        capStand.setStyle("-fx-text-fill: white;");
        priceStand.setStyle("-fx-text-fill: white;");
        basicTxt.setStyle("-fx-text-fill: #acacac;");
        capacityB.setStyle("-fx-text-fill: #acacac;");
        priceB.setStyle("-fx-text-fill: #acacac;");
        preTxt.setStyle("-fx-text-fill: #acacac;");
        capP.setStyle("-fx-text-fill: #acacac;");
        priceP.setStyle("-fx-text-fill: #acacac;");
        subBtttn.setStyle("-fx-text-fill: black;");
        prePlan.setStyle(" -fx-border-width : 0 ;");
        describeNote.setText("You can watch only 10 movies in 30 days");
        userPlan = "Standard" ;
    }



    @FXML
    void premiumSelected(MouseEvent event) {
        selectBasic.setVisible(false);
        premiumSelect.setVisible(true);
        standardSelect.setVisible(false);
        prePlan.setStyle("-fx-border-width: 4.5px; -fx-border-color: #dca523; -fx-border-style: solid; -fx-start-margin: 4px; -fx-border-radius: 10px;");
        basicPlan.setStyle(" -fx-border-width : 0 ;");
        standardPLan.setStyle(" -fx-border-width : 0 ;");
        preTxt.setStyle("-fx-text-fill: white;");
        capP.setStyle("-fx-text-fill: white;");
        priceP.setStyle("-fx-text-fill: white;");
        basicTxt.setStyle("-fx-text-fill: #acacac;");
        capacityB.setStyle("-fx-text-fill: #acacac;");
        priceB.setStyle("-fx-text-fill: #acacac;");
        standTxt.setStyle("-fx-text-fill: #acacac;");
        capStand.setStyle("-fx-text-fill: #acacac;");
        subBtttn.setStyle("-fx-text-fill: black;");
        priceStand.setStyle("-fx-text-fill: #acacac;");
        describeNote.setText("You can watch only 15 movies in 30 days");
        userPlan = "Premium";
    }

    //menu

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

        //Clear the current page
        movieTilePane1.getChildren().clear();


        //Files
        File im = new File("src/main/resources/com/example/uservalidation/icons/watch.png");
        File ad = new File("src/main/resources/com/example/uservalidation/icons/add.png");
        File file = new File(movie.getPoster());

        //Images
        ImageView moviePoster = new ImageView(new Image(file.toURI().toString()));
        moviePoster.setFitWidth(800);
        moviePoster.setFitHeight(400);
        ImageView playIcon = new ImageView(new Image(im.toURI().toString()));
        playIcon.setFitWidth(20);
        playIcon.setFitHeight(20);
        ImageView addIcon = new ImageView(new Image(ad.toURI().toString()));
        addIcon.setFitWidth(20);
        addIcon.setFitHeight(20);

        //Buttons
        HBox buttons = new HBox();
        Button watch = new Button("Watch");
        Button add = new Button("My List");
        watch.setGraphic(playIcon);
        add.setGraphic(addIcon);
        buttons.setSpacing(25);
        watch.setOnMouseEntered(event -> {
            watch.setOpacity(0.5);
            watch.setCursor(Cursor.HAND);
        });
        watch.setOnMouseExited(event -> {
            watch.setOpacity(1.0);
            watch.setCursor(Cursor.DEFAULT);
        });
        add.setOnMouseEntered(event -> {
            add.setOpacity(0.5);
            add.setCursor(Cursor.HAND);
        });
        add.setOnMouseExited(event -> {
            add.setOpacity(1.0);
            add.setCursor(Cursor.DEFAULT);
        });

        //Buttons styling
        watch.setStyle("-fx-text-fill: black; -fx-font-size: 19;-fx-font-weight: 700; -fx-background-color: white;");
        watch.setPrefSize(150,50);
        add.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700; -fx-background-color: #383533;");
        add.setPrefSize(150,50);
        buttons.getChildren().addAll(watch,add);

        //Labels
        Label movieTitle = new Label(movie.getTitle());
        movieTitle.setStyle("-fx-text-fill: white; -fx-font-size: 40;-fx-font-weight: 700;-fx-padding:0 30px 10px 0");
        movieTitle.setPrefWidth(400);
        movieTitle.setAlignment(Pos.CENTER_LEFT);
        Label year = new Label(Integer.toString(movie.getYear())+" "+Float.toString(movie.getRunningtime()).charAt(0)+" Hour "+Float.toString(movie.getRunningtime()).charAt(2)+Float.toString(movie.getRunningtime()).charAt(3)+" Minutes");
        year.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:0 0 0 7px;");
        Label movieDescription = new Label(movie.getMovieDescription());
        movieDescription.setStyle("-fx-text-fill: white;-fx-font-weight: 700;");

        //Movie genre label
        String typess = new String("");

        for (int i=0;i<movie.getTypes().size();i++)
        {
            if(i!=movie.getTypes().size()-1&&i!=1)
            {
                typess+=movie.getTypes().get(i)+"/";
            }
            else
            {
                typess+=movie.getTypes().get(i);
            }
            if(i==1)
            {
                break;
            }
        }
        Label type = new Label(typess);
        type.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:0 0 140px 7px;");






        //To set Border
        Rectangle clip = new Rectangle(moviePoster.getFitWidth(), moviePoster.getFitHeight());
        clip.setArcWidth(25);
        clip.setArcHeight(25);
        moviePoster.setClip(clip);




        //Rates
        ArrayList<ImageView> rates = new ArrayList<>();
        for (int i=0;i<5;i++)
        {
            File beforeRateIm=new File("src/main/resources/com/example/uservalidation/icons/beforeRating.png");
            rates.add(new ImageView(new Image(beforeRateIm.toURI().toString())));
            rates.get(i).setFitWidth(50);
            rates.get(i).setFitHeight(50);
        }

        HBox ratees = new HBox();
        ratees.getChildren().addAll(rates);
        ratees.setStyle("-fx-padding:20px 0 0 0 40px;");





        //Rates container
        VBox rightInfo = new VBox();
        rightInfo.getChildren().addAll(movieTitle,year,type,buttons,ratees);

        //Right info container
        HBox head = new HBox();
        head.getChildren().addAll(moviePoster,rightInfo);
        head.setSpacing(15);



        //All
        VBox movieBox = new VBox();
        movieBox.setStyle("-fx-padding:20px");
        movieBox.setSpacing(10);
        movieBox.getChildren().addAll(head, movieDescription);



        //All container
        movieTilePane1.getChildren().addAll(movieBox);
        movieTilePane1.setPrefWidth(1250);
        movieTilePane1.setPrefHeight(500);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        loadMovies();

        movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 10px;");

        scrollPane.setContent(movieTilePane1);
        scrollPane.setStyle("-fx-background-color: #0F0A05;");
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
    }


}