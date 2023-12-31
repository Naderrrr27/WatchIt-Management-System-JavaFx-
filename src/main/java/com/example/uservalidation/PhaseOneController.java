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
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;


import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;
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
    private Label analysisTxt1;

    @FXML
    private ImageView anaylsisImg1;

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
    private AnchorPane statPage;
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
    private Label alreadyHaveAccLabel;

    @FXML
    private Button backToMainBttn;

    @FXML
    private Label subTitlePS;

    @FXML
    private Label titlePS;

    @FXML
    private AnchorPane subscriptionPlanss;

    @FXML
    private AnchorPane mainMenu;


    @FXML
    private AnchorPane signOut;

    @FXML
    private Button signOutSubButtn;

    @FXML
    private AnchorPane userProfile;

    @FXML
    private ImageView profImg;

    @FXML
    private Label endDatee;

    @FXML
    private Label planNomm;

    @FXML
    TextField monthTextField = new TextField();

    @FXML
    Label resultLabel = new Label();

    @FXML
    private Label planPriccc;

    @FXML
    Button getButton = new Button("Get");

    @FXML
    private Label remaningDyss;

    @FXML
    private Label remaningMvs;

    @FXML
    private AnchorPane subscriptionInfo;

    @FXML
    private Label startDatee;

    @FXML
    private Button backToMainBttn1;

    @FXML
    private AnchorPane displaySubInfo;

    @FXML
    private ImageView fifteenMvsImg;

    @FXML
    private ImageView fivMvsImg;

    @FXML
    private ImageView tenMvsImg;

    //stat
    @FXML
    private Label analysisTxt;

    Button closee = new Button();

    @FXML
    private Button backStatMain;

    Label BigT = new Label();

    @FXML
    private ImageView anaylsisImg;


    private VBox vboxxx = new VBox();

    private VBox vboxxx2 = new VBox();


    boolean checkEntered = false;

    String userPlan = "";


    VBox container = new VBox();


    Label headerLabel = new Label("");

    //Controlled
    TilePane controlled = new TilePane();


    //details
    StackPane details = new StackPane();

    //likeThis
    StackPane likeThis = new StackPane();

    TilePane searchTilPane = new TilePane();

    ImageView statIcon = new ImageView();

    @FXML
    ImageView stattIcon = new ImageView();

    @FXML
    ScrollPane scrollPaneSearch = new ScrollPane();

    TilePane viewTilePane = new TilePane();

    TilePane rateTilePane = new TilePane();


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
        if(User.whoIsActive!=-1 && !userPlan.isEmpty())
        {
            //setSubscriptionActive when the user choose plane
            HelloApplication.users.get(User.whoIsActive-1).setSubscriptionActive(true);
            HelloApplication.users.get(User.whoIsActive-1).setSubscription(new Subscription(userPlan));
            mainMenu.setVisible(true);
            signInForm.setVisible(false);
            signUpForm.setVisible(false);
            subscriptionPlanss.setVisible(false);


            bigConrainer.setVisible(true);
            movieTilePane1.getChildren().clear();
            container.getChildren().clear();

            home1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
            movie1.setStyle("-fx-background-color: transparent ;");
            list1.setStyle("-fx-background-color: transparent ;");
            genera1.setStyle("-fx-background-color: transparent;");
            history1.setStyle("-fx-background-color: transparent ;");
            fakeCombo.setVisible(false);
            fakeIqon.setVisible(false);

            viewTilePane.getChildren().clear();
            rateTilePane.getChildren().clear();

            container.getChildren().clear();


            Label viewLabel = new Label("Top Views");
            viewLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");

            Label rateLabel = new Label("Top Rates");
            rateLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");


            VBox highViews = new VBox();
            highViews.getChildren().addAll(viewLabel,viewTilePane);

            VBox highRates = new VBox();
            highRates.getChildren().addAll(rateLabel,rateTilePane);

            container.getChildren().clear();
            container.getChildren().addAll(highViews);
            container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");



            scrollPane.setContent(container);
            scrollPane.setVvalue(0.0);



            scrollPane.setContent(container);



            for (Movie movie : StatisticsManager.getTopViewsMovies())
            {
                addMovieToTilePane(movie,viewTilePane);
            }



        }
    }



    //mola7azat?
    public void signOut(ActionEvent event)
    {

        stattIcon.setVisible(false);

        signInForm.setVisible(true);
        signUpForm.setVisible(false);
        subscriptionPlanss.setVisible(false);

        User.whoIsActive = -1;

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

                    if(emailSignIn.getText().equals("admin@gmail.com")&&passwordSignIn.getText().equals("admin111"))
                    {
                        it.setSubscription(new Subscription("Basic"));
                        it.setSubscriptionActive(true);


                        stattIcon.setVisible(true);
                    }

                    if(it.isSubscriptionActive()==false)
                    {
                        subscriptionPlanss.setVisible(true);
                        signInForm.setVisible(false);
                        signUpForm.setVisible(false);
                        User.whoIsActive = it.getUserId();

                    }
                    else
                    {
                        emailValid.setVisible(false);
                        passwordValid.setVisible(false);
                        mainMenu.setVisible(true);
                        signInForm.setVisible(false);
                        User.whoIsActive = it.getUserId();

                        viewTilePane.getChildren().clear();
                        rateTilePane.getChildren().clear();

                        container.getChildren().clear();


                        Label viewLabel = new Label("Top Views");
                        viewLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");

                        Label rateLabel = new Label("Top Rates");
                        rateLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");


                        VBox highViews = new VBox();
                        highViews.getChildren().addAll(viewLabel,viewTilePane);

                        VBox highRates = new VBox();
                        highRates.getChildren().addAll(rateLabel,rateTilePane);

                        container.getChildren().clear();
                        container.getChildren().addAll(highViews);
                        container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");



                        scrollPane.setContent(container);
                        scrollPane.setVvalue(0.0);



                        scrollPane.setContent(container);



                        for (Movie movie : StatisticsManager.getTopViewsMovies())
                        {
                            addMovieToTilePane(movie,viewTilePane);
                        }

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

        //Valid username in both cases
         if (isUsernameExist() == true && userNameSignUp.getText().isEmpty() == false && (User.whoIsActive == -1 || ( checkEntered == true && User.whoIsActive != -1 && HelloApplication.users.get(User.whoIsActive-1).getUserName().equals(userNameSignUp.getText()) == false)))
        {
            userNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            userNameValid.setText("This already existing");
            userNameValid.setVisible(true);
        }
         //update userName
         else if(isUsernameExist() == false && (checkEntered == true &&  User.whoIsActive != -1 && HelloApplication.users.get(User.whoIsActive-1).getUserName().equals(userNameSignUp.getText()) == false))
         {
             HelloApplication.users.get(User.whoIsActive-1).setUserName(userNameSignUp.getText());
             userNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #4a944a;");
             userNameValid.setText("Username updated ✅");
             userNameValid.setStyle(" -fx-text-fill:#4a944a;");
             userNameValid.setVisible(true);
         }
          //check if email exist in both cases
        if (isEmailExist()  && emailSignUp.getText().isEmpty() == false && (User.whoIsActive == -1 || ( checkEntered == true &&  User.whoIsActive != -1 && HelloApplication.users.get(User.whoIsActive-1).getEmail().equals(emailSignUp.getText()) == false)))
        {
            emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            emailSignUpValid.setText("This already existing");
            emailSignUpValid.setVisible(true);
        }
        //check if email valid in both cases
         if(validEmail()==false && emailSignUp.getText().isEmpty() == false && (User.whoIsActive == -1 || ( checkEntered == true &&  User.whoIsActive != -1 && HelloApplication.users.get(User.whoIsActive-1).getEmail().equals(emailSignUp.getText()) == false)))
        {
            System.out.println(11);
            emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            emailSignUpValid.setStyle("-fx-font-size: 15;");
            emailSignUpValid.setText("Invalid email address");
            emailSignUpValid.setVisible(true);
        }
         //UPDATE EMAIL
         if (isEmailExist() == false && validEmail() == true && (checkEntered == true && User.whoIsActive != -1 && HelloApplication.users.get(User.whoIsActive-1).getEmail().equals(emailSignUp.getText()) == false))
         {
             HelloApplication.users.get(User.whoIsActive-1).setEmail(emailSignUp.getText());
             emailSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #4a944a;");
             emailSignUpValid.setText("Email updated ✅");
             emailSignUpValid.setStyle(" -fx-text-fill:#4a944a;");
             emailSignUpValid.setVisible(true);
         }
         //UPDATE FIRST AND LAST NAME
        if ( checkEntered == true &&  User.whoIsActive != -1 && firstNameSignUp.getText().equals(HelloApplication.users.get(User.whoIsActive-1).getFirstName()) == false)
        {
            HelloApplication.users.get(User.whoIsActive-1).setFirstName(firstNameSignUp.getText());
            firstNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #4a944a;");
            fullNameValid.setText("Update to full-name completed ✅");
            fullNameValid.setStyle(" -fx-text-fill:#4a944a;");
            fullNameValid.setVisible(true);
        }
        if ( checkEntered == true &&  User.whoIsActive != -1 && lastNameSignUp.getText().equals(HelloApplication.users.get(User.whoIsActive-1).getLastName()) == false)
        {
            HelloApplication.users.get(User.whoIsActive-1).setLastName(lastNameSignUp.getText());
            lastNameSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #4a944a;");
            fullNameValid.setText("Update to full-name completed ✅");
            fullNameValid.setStyle(" -fx-text-fill:#4a944a;");
            fullNameValid.setVisible(true);
        }

        //make sure that the password is ok
        if(passwordSignUp.getText().length() < 8 &&  passwordSignUp.getText().isEmpty() == false && (User.whoIsActive == -1 ||(checkEntered == true && HelloApplication.users.get(User.whoIsActive-1).getPassword().equals(passwordSignUp.getText()) == false)))
        {
            passwordSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #D22F26;");
            passwordSignUpValid.setText("At least 8 characters");
            passwordSignUpValid.setVisible(true);
        }
        //update password
        else if(passwordSignUp.getText().length() >= 8  && checkEntered == true   && HelloApplication.users.get(User.whoIsActive-1).getPassword().equals(passwordSignUp.getText()) == false)
         {
             HelloApplication.users.get(User.whoIsActive-1).setPassword(passwordSignUp.getText());
             passwordSignUp.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #4a944a;");
             passwordSignUpValid.setText("Password updated ✅");
             passwordSignUpValid.setStyle(" -fx-text-fill:#4a944a;");
             passwordSignUpValid.setVisible(true);
         }
         if(firstNameSignUp.getText().isEmpty() == false  && lastNameSignUp.getText().isEmpty() == false && userNameSignUp.getText().isEmpty() == false && passwordSignUp.getText().isEmpty() == false && emailSignUp.getText().isEmpty() == false  && isUsernameExist() == false && isEmailExist() == false  && validEmail()== true && passwordSignUp.getText().length() >= 8 && User.whoIsActive == -1)
        {
            HelloApplication.users.add(new User(firstNameSignUp.getText(),lastNameSignUp.getText(),userNameSignUp.getText(),emailSignUp.getText(),passwordSignUp.getText()));
//            HelloApplication.saveUsersToFile("Users.txt");

            User.whoIsActive = HelloApplication.users.get(HelloApplication.users.size()-1).getUserId();
            subscriptionPlanss.setVisible(true);
            System.out.println(HelloApplication.users.size());
            signInForm.setVisible(false);
            signUpForm.setVisible(false);
            firstNameSignUp.clear();
            firstNameSignUp.setStyle("-fx-border-width: 0");
            lastNameSignUp.clear();
            lastNameSignUp.setStyle("-fx-border-width: 0");
            emailSignUp.clear();
            emailSignUp.setStyle("-fx-border-width: 0");
            passwordSignUp.clear();
            passwordSignUp.setStyle("-fx-border-width: 0");
            userNameSignUp.clear();
            userNameSignUp.setStyle("-fx-border-width: 0");
        }
    }


    @FXML
        //sign out when subscriptionPlanes are displayed
    void sugnOutSub(ActionEvent event) {

        stattIcon.setVisible(false);

        signInForm.setVisible(true);
        signUpForm.setVisible(false);
        subscriptionPlanss.setVisible(false);
        User.whoIsActive = -1 ;
        emailSignIn.clear();
        emailSignIn.setStyle("-fx-border-width: 0");
        passwordSignIn.clear();
        passwordSignIn.setStyle("-fx-border-width: 0");

        firstNameSignUp.clear();
        firstNameSignUp.setStyle("-fx-border-width: 0");
        lastNameSignUp.clear();
        lastNameSignUp.setStyle("-fx-border-width: 0");
        emailSignUp.clear();
        emailSignUp.setStyle("-fx-border-style: none; ");
        passwordSignUp.clear();
        passwordSignUp.setStyle("-fx-border-width: 0");
        userNameSignUp.clear();
        userNameSignUp.setStyle("-fx-border-width: 0");
    }

    public void switchForm(ActionEvent event)
    {
        fullNameValid.setVisible(false);
        emailSignUpValid.setVisible(false);
        userNameValid.setVisible(false);
        passwordSignUpValid.setVisible(false);
        emailValid.setVisible(false);
        passwordValid.setVisible(false);
        emailSignIn.setStyle("-fx-border-width: 0 ; -fx-border-style: none;  ");
        passwordSignIn.clear();
        passwordSignIn.setStyle("-fx-border-width: 0; -fx-border-style: none;");
        firstNameSignUp.clear();
        firstNameSignUp.setStyle("-fx-border-width: 0");
        lastNameSignUp.clear();
        lastNameSignUp.setStyle("-fx-border-width: 0");
        emailSignUp.clear();
        emailSignUp.setStyle("-fx-border-style: none; ");
        passwordSignUp.clear();
        passwordSignUp.setStyle("-fx-border-width: 0");
        userNameSignUp.clear();
        userNameSignUp.setStyle("-fx-border-width: 0");

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
        movieTilePane1.getChildren().clear();
        scrollPane.setContent(movieTilePane1);
        movieTilePane1.setStyle("-fx-background-color:#0F0A05;");
        displayGenre(Genra.getGenres());
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

        headerLabel.setText("Continue Watching");
        headerLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");

        movieTilePane1.getChildren().clear();
        movieTilePane1.setPrefWidth(1700);
        movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 0;");



        container.getChildren().clear();
        container.getChildren().addAll(headerLabel, movieTilePane1);

        container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");

        scrollPane.setContent(container);
        scrollPane.setVvalue(0.0);

        scrollPane.setContent(container);

        for (UserWatchRecord record : HelloApplication.users.get(User.whoIsActive-1).getHistory())
        {
            addMovieToTilePane(record,movieTilePane1);
        }


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

        viewTilePane.getChildren().clear();
        rateTilePane.getChildren().clear();

        container.getChildren().clear();


        Label viewLabel = new Label("Top Views");
        viewLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");

        Label rateLabel = new Label("Top Rates");
        rateLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");


        VBox highViews = new VBox();
        highViews.getChildren().addAll(viewLabel,viewTilePane);

        VBox highRates = new VBox();
        highRates.getChildren().addAll(rateLabel,rateTilePane);

        container.getChildren().clear();
        container.getChildren().addAll(highViews);
        container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");



        scrollPane.setContent(container);
        scrollPane.setVvalue(0.0);



        scrollPane.setContent(container);



        for (Movie movie : StatisticsManager.getTopViewsMovies())
        {
            addMovieToTilePane(movie,viewTilePane);
        }

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



        headerLabel.setText("My List");
        headerLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: 900;-fx-padding:0px 0 30px 20px;");

        movieTilePane1.getChildren().clear();
        movieTilePane1.setPrefWidth(1700);
        movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 0;");



        container.getChildren().clear();
        container.getChildren().addAll(headerLabel, movieTilePane1);

        container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");

        scrollPane.setContent(container);
        scrollPane.setVvalue(0.0);

        scrollPane.setContent(container);

        for (Movie movie : HelloApplication.users.get(User.whoIsActive-1).getMovieList())
        {
            addMovieToTilePane(movie,movieTilePane1);
        }

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




        loadMovies();
    }

    @FXML
    void searchPressed(MouseEvent event) {
        bigConrainer.setVisible(false);
        bigConSearch.setVisible(true);
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
        searchTilPane.setPrefWidth(1500);
        searchTilPane.setPrefHeight(800);
        searchTilPane.setStyle("-fx-background-color: #0F0A05; -fx-padding: 0 0 0 0;");
        scrollPaneSearch.setContent(searchTilPane);
    }

    @FXML
    void cancelSsearch(MouseEvent event) {
        bigConrainer.setVisible(true);
        bigConSearch.setVisible(false);
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
        warningSearch.setVisible(false);
        searchFeild.clear();
        searchTilPane.getChildren().clear();
    }


    @FXML
    void userAccPressed(MouseEvent event) {
        fakeCombo.setVisible(true);
        fakeIqon.setVisible(true);
        realUserName.setText(HelloApplication.users.get(User.whoIsActive-1).getUserName());
    }

    @FXML
    void validateSearch(KeyEvent event) {
        String s =searchFeild.getText();
        searchTilPane.getChildren().clear();

        Set<Movie> movies = new LinkedHashSet<>();

        movies.addAll(SearchManager.searchMovie(s));
        movies.addAll(SearchManager.searchCast(s));
        movies.addAll(SearchManager.searchGenra(s));

        if(searchFeild.getText().length()  < 3 && searchFeild.getText().length() >= 0)
        {
            warningSearch.setText("The minimum number of characters is 3");
            warningSearch.setPrefWidth(500);
            warningSearch.setVisible(true);
        }
        else
        {
            warningSearch.setVisible(false);
            Search(movies);
            scrollPaneSearch.setContent(searchTilPane);

        }
    }



    private void Search (Set<Movie> myMovies)
    {

        if(myMovies.isEmpty())
        {
            warningSearch.setText("We couldn't find any results that match your search");
            warningSearch.setVisible(true);
        }
        else
        {
            for(Movie movie: myMovies)
            {
                addMovieToTilePane(movie,searchTilPane);
            }
        }

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

    @FXML
    void signOutt(MouseEvent event) {

        stattIcon.setVisible(false);


        signInForm.setVisible(true);
        mainMenu.setVisible(false);
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
        User.whoIsActive = -1;
        emailSignIn.clear();
        emailSignIn.setStyle("-fx-border-width: 0");
        passwordSignIn.clear();
        passwordSignIn.setStyle("-fx-border-width: 0");
        firstNameSignUp.clear();
        firstNameSignUp.setStyle("-fx-border-width: 0");
        lastNameSignUp.clear();
        lastNameSignUp.setStyle("-fx-border-width: 0");
        emailSignUp.clear();
        emailSignUp.setStyle("-fx-border-width: 0");
        passwordSignUp.clear();
        passwordSignUp.setStyle("-fx-border-width: 0");
        userNameSignUp.clear();
        userNameSignUp.setStyle("-fx-border-width: 0");


        home1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
        movie1.setStyle("-fx-background-color: transparent ;");
        list1.setStyle("-fx-background-color: transparent ;");
        genera1.setStyle("-fx-background-color: transparent;");
        history1.setStyle("-fx-background-color: transparent ;");
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);

        movieTilePane1.getChildren().clear();
        container.getChildren().clear();
        searchTilPane.getChildren().clear();
        searchFeild.clear();
        bigConSearch.setVisible(false);
    }

    @FXML
    void displayProfileInfo(MouseEvent event) {
        checkEntered = true ;
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
        mainMenu.setVisible(false);
        signUpForm.setVisible(true);
        titlePS.setText("Profile Info ");
        subTitlePS.setVisible(false);
        submitSignUp.setText("Save Changes");
        topSingUpButton.setVisible(false);
        alreadyHaveAccLabel.setVisible(false);
        signUpHyper.setVisible(false);
        profImg.setVisible(true);
        backToMainBttn.setVisible(true);
        firstNameSignUp.setText(HelloApplication.users.get(User.whoIsActive-1).getFirstName());
        firstNameSignUp.setStyle(" -fx-text-inner-color:#DCA523; -fx-border-width: 0");
        lastNameSignUp.setText(HelloApplication.users.get(User.whoIsActive-1).getLastName());
        lastNameSignUp.setStyle(" -fx-text-inner-color:#DCA523; -fx-border-width: 0");
        emailSignUp.setText(HelloApplication.users.get(User.whoIsActive-1).getEmail());
        emailSignUp.setStyle(" -fx-text-inner-color:#DCA523; -fx-border-width: 0");
        userNameSignUp.setText(HelloApplication.users.get(User.whoIsActive-1).getUserName());
        userNameSignUp.setStyle(" -fx-text-inner-color:#DCA523; -fx-border-width: 0");
        passwordSignUp.setText(HelloApplication.users.get(User.whoIsActive-1).getPassword());
        passwordSignUp.setStyle(" -fx-text-inner-color:#DCA523; -fx-border-width: 0");
        fullNameValid.setVisible(false);
        emailSignUpValid.setVisible(false);
        userNameValid.setVisible(false);
        passwordSignUpValid.setVisible(false);

    }

    @FXML
    void backToMain(MouseEvent event) {
        checkEntered = false ;
        mainMenu.setVisible(true);
        signUpForm.setVisible(false);
        titlePS.setText("Create your Account");
        subTitlePS.setVisible(true);
        submitSignUp.setText("Next");
        topSingUpButton.setVisible(true);
        alreadyHaveAccLabel.setVisible(true);
        signUpHyper.setVisible(true);
        backToMainBttn.setVisible(false);
        firstNameSignUp.clear();
        lastNameSignUp.clear();
        emailSignUp.clear();
        userNameSignUp.clear();
        passwordSignUp.clear();
        profImg.setVisible(false);
    }

    @FXML
    void displaySubscriptionInfo(MouseEvent event) {
        subscriptionInfo.setVisible(true);
        mainMenu.setVisible(false);
        planNomm.setText(HelloApplication.users.get(User.whoIsActive-1).subscription.getSubscriptionPlan());
        planPriccc.setText(String.valueOf(HelloApplication.users.get(User.whoIsActive-1).subscription.getPrice()));
        startDatee.setText(HelloApplication.users.get(User.whoIsActive-1).subscription.getStartDate().toString());
        endDatee.setText(HelloApplication.users.get(User.whoIsActive-1).subscription.getEndDate().toString());
        remaningDyss.setText(String.valueOf(HelloApplication.users.get(User.whoIsActive-1).subscription.getRemaningDays()));
        remaningMvs.setText(String.valueOf(HelloApplication.users.get(User.whoIsActive-1).subscription.getCapacity()));
        if(HelloApplication.users.get(User.whoIsActive-1).subscription.getSubscriptionPlan() == "Basic")
            fivMvsImg.setVisible(true);
        else if(HelloApplication.users.get(User.whoIsActive-1).subscription.getSubscriptionPlan() == "Standard")
            tenMvsImg.setVisible(true);
        else
            fifteenMvsImg.setVisible(true);

    }

    @FXML
    void closeSubInfo(MouseEvent event) {
        subscriptionInfo.setVisible(false);
        mainMenu.setVisible(true);
        fakeCombo.setVisible(false);
        fakeIqon.setVisible(false);
    }


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


    @FXML
    void closeStat(MouseEvent event) {
        statPage.setVisible(false);
        mainMenu.setVisible(true);
        backStatMain.setVisible(false);
    }
    @FXML
     void toStatPage(MouseEvent event) {
       statPage.setVisible(true);
       mainMenu.setVisible(false);
        backStatMain.setVisible(true);
        StatisticsManager.analyseMonthRevenue();
   }

    void setvboxxx(){
        vboxxx.setSpacing(10);
        closee.setCursor(Cursor.HAND);
        closee.setText("Back");
        closee.setStyle("  -fx-background-color: #dca523; -fx-text-fill: #090909; -fx-font-weight: bold;");
        BigT.setText("Month Revenue...");
        BigT.setStyle("-fx-font-size: 51px;  -fx-font-family: 'NotoSans-Regular', 'Roboto', 'Helvetica Neue', 'sans-serif'; -fx-font-weight: bold; -fx-text-fill: #dca523; ");
        BigT.setLayoutX(400);
        BigT.setLayoutY(95);
        closee.setLayoutX(1200);
        closee.setLayoutY(20);
        analysisTxt.setVisible(false);
        anaylsisImg.setVisible(false);
        analysisTxt1.setVisible(false);
        anaylsisImg1.setVisible(false);
        backStatMain.setVisible(false);
        for (Map.Entry<String, Integer> entry : StatisticsManager.getMonthsRevenue().entrySet()) {
            String month = entry.getKey();
            Integer revenue = entry.getValue();
            System.out.println(month);
            System.out.println(revenue);
            Label label = new Label(month + " : " + revenue + " 💵");

            label.setStyle("-fx-font-size: 20px;  -fx-font-family: 'NotoSans-Regular', 'Roboto', 'Helvetica Neue', 'sans-serif'; -fx-font-weight: bold; -fx-text-fill: black; fx-padding: 5;  -fx-border-color: black;  -fx-border-width: 1;   -fx-border-style: solid;   -fx-background-color: white");

            vboxxx.getChildren().add(label);
        }
        for (Map.Entry<String, HashMap<String, Integer>> entry : StatisticsManager.getHighestPlan().entrySet()) {
            Label plansss = new Label();
            plansss.setText(entry.getValue().toString() + " 👥");
            plansss.setStyle("-fx-font-size: 20px;  -fx-font-family: 'NotoSans-Regular', 'Roboto', 'Helvetica Neue', 'sans-serif'; -fx-font-weight: bold; -fx-text-fill: white ; fx-padding: 5;  -fx-border-color: white;  -fx-border-width: 0.5px;   -fx-border-style: solid; " );
            vboxxx2.getChildren().add(plansss);
        }
        vboxxx.setStyle("-fx-padding: 10;  -fx-spacing: 5;");
        vboxxx.setLayoutX(60);
        vboxxx.setLayoutY(200);
        vboxxx2.setStyle("-fx-padding: 10;  -fx-spacing: 5;");
        vboxxx2.setLayoutX(400);
        vboxxx2.setLayoutY(200);
        statPage.getChildren().add(closee);
        statPage.getChildren().add(BigT);
        statPage.getChildren().add(vboxxx);
        statPage.getChildren().add(vboxxx2);
        vboxxx.setVisible(true);
        vboxxx2.setVisible(true);
        closee.setVisible(true);
        BigT.setVisible(true);
    }

    void closeboxx (){
        analysisTxt.setVisible(true);
        anaylsisImg.setVisible(true);
        analysisTxt1.setVisible(true);
        anaylsisImg1.setVisible(true);
        backStatMain.setVisible(true);
        vboxxx.setVisible(false);
        vboxxx2.setVisible(false);
        closee.setVisible(false);
        getButton.setVisible(false);
        BigT.setVisible(false);
        statPage.getChildren().remove(vboxxx);
        statPage.getChildren().remove(vboxxx2);
        statPage.getChildren().remove(BigT);
        statPage.getChildren().remove(closee);
        statPage.getChildren().remove(monthTextField);
        statPage.getChildren().remove(resultLabel);
        statPage.getChildren().remove(getButton);
        resultLabel.setVisible(false);
        vboxxx.getChildren().removeAll();
        vboxxx.getChildren().clear();
        vboxxx2.getChildren().removeAll();
        vboxxx2.getChildren().clear();
        monthTextField.setVisible(false);
        monthTextField.clear();
        resultLabel.setText("");
    }

    @FXML
    void getHIghesttttPlannn(MouseEvent event) {

        vboxxx.setSpacing(10);
        closee.setCursor(Cursor.HAND);
        closee.setText("Back");
        closee.setStyle("  -fx-background-color: #dca523; -fx-text-fill: #090909; -fx-font-weight: bold;");
        BigT.setText("Enter the month for which you want to access his highest plan....");
        BigT.setStyle("-fx-font-size: 25px;  -fx-font-family: 'NotoSans-Regular', 'Roboto', 'Helvetica Neue', 'sans-serif'; -fx-font-weight: bold; -fx-text-fill: #dca523; ");
        BigT.setLayoutX(30);
        BigT.setLayoutY(100);
        closee.setLayoutX(1200);
        closee.setLayoutY(20);
        //
        monthTextField.setPromptText("Enter your month in number please");
        monthTextField.setStyle("-fx-text-fill: white; -fx-prompt-text-fill: white; -fx-background-color: #1a1919; -fx-font-weight: bold; -fx-border-width: 2px; -fx-border-color: white; -fx-border-radius: 2px; -fx-pref-width: 350px;");
        monthTextField.setLayoutX(30);
        monthTextField.setLayoutY(147);


        getButton.setOnAction(e -> {
            String enteredMonth = monthTextField.getText();
            String result = StatisticsManager.getetHighestPlanInEachMonth(enteredMonth);
            resultLabel.setText(result);
        });
        resultLabel.setStyle("-fx-font-size: 20px; -fx-font-family: 'NotoSans-Regular', 'Roboto', 'Helvetica Neue', 'sans-serif'; -fx-font-weight: bold; -fx-text-fill: white;");
        resultLabel.setLayoutX(30);
        resultLabel.setLayoutY(200);

        getButton.setStyle(" -fx-background-color: black; -fx-text-fill: white;  -fx-font-weight: bold; -fx-border-width: 4px; -fx-border-color: #666363; -fx-border-radius: 2px; -fx-pref-width: 90px;");
        getButton.setCursor(Cursor.HAND);
        getButton.setLayoutX(400);
        getButton.setLayoutY(147);
        analysisTxt.setVisible(false);
        anaylsisImg.setVisible(false);
        analysisTxt1.setVisible(false);
        anaylsisImg1.setVisible(false);
        backStatMain.setVisible(false);
        statPage.getChildren().add(resultLabel);
        statPage.getChildren().add(getButton);
        statPage.getChildren().add(monthTextField);
        statPage.getChildren().add(closee);
        statPage.getChildren().add(BigT);
        getButton.setVisible(true);
        closee.setVisible(true);
        BigT.setVisible(true);
        monthTextField.setVisible(true);
        resultLabel.setVisible(true);
    }

    private void loadMovies() {

        headerLabel.setText("Cinema Collection");
        headerLabel.setStyle("-fx-text-fill: white; -fx-font-size: 30; -fx-font-weight: bold;-fx-padding:0px 0 30px 20px;");

        movieTilePane1.getChildren().clear();
        movieTilePane1.setPrefWidth(1700);
        movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 0;");



        container.getChildren().clear();
        container.getChildren().addAll(headerLabel, movieTilePane1);

        container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");

        scrollPane.setContent(container);
        scrollPane.setVvalue(0.0);


        for (int i=0;i<HelloApplication.movies.size();i++)
        {
            addMovieToTilePane(HelloApplication.movies.get(i),movieTilePane1);
        }
    }

    private void addMovieToTilePane(Movie movie,TilePane tilePane) {

        StackPane stackBox = new StackPane();


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
        stackBox.setStyle("-fx-border-color: black;");




        stackBox.getChildren().addAll(posterImageView,movieLabel);

        stackBox.setOnMouseEntered(event -> {
            stackBox.setOpacity(0.5);
            stackBox.setCursor(Cursor.HAND);
        });

        stackBox.setOnMouseExited(event -> {
            stackBox.setOpacity(1.0);
            stackBox.setCursor(Cursor.DEFAULT);
        });

        stackBox.setOnMouseClicked(event ->{
            showPoster(movie);

            searchTilPane.getChildren().clear();

            movie1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
            list1.setStyle("-fx-background-color: transparent ;");
            home1.setStyle("-fx-background-color: transparent ;");
            genera1.setStyle("-fx-background-color: transparent;");
            history1.setStyle("-fx-background-color: transparent ;");
            fakeCombo.setVisible(false);
            fakeIqon.setVisible(false);

            bigConrainer.setVisible(true);
            bigConSearch.setVisible(false);
            fakeCombo.setVisible(false);
            fakeIqon.setVisible(false);
            warningSearch.setVisible(false);
            searchFeild.clear();
        });

        stackBox.setAlignment(movieLabel, Pos.BOTTOM_LEFT);
        tilePane.setHgap(10.0);
        tilePane.setVgap(10.0);

        tilePane.getChildren().add(stackBox);

    }

    private void addMovieToTilePane(UserWatchRecord record,TilePane tilePane) {

        StackPane stackBox = new StackPane();


        File file = new File(record.getMovie().getPoster());


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



        Label movieLabel = new Label(record.getMovie().getTitle());
        movieLabel.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:10 10 10 10; ");
        movieLabel.setEffect(glow);
        stackBox.setStyle("-fx-border-color: black;");




        Label watchingDate = new Label("Date: "+record.getDatOfWatching().toString());
        watchingDate.setStyle("-fx-text-fill: yellow; -fx-font-size: 17;-fx-font-weight: 700;-fx-padding:10 10 10 10; ");
        watchingDate.setVisible(false);




        stackBox.setOnMouseEntered(event -> {
            posterImageView.setOpacity(0.0);
            movieLabel.setOpacity(0.0);
            watchingDate.setVisible(true);
            stackBox.setCursor(Cursor.HAND);
        });

        stackBox.setOnMouseExited(event -> {
            posterImageView.setOpacity(1.0);
            movieLabel.setOpacity(1.0);
            watchingDate.setVisible(false);
            stackBox.setCursor(Cursor.DEFAULT);
            posterImageView.setOpacity(0.85);
        });

        stackBox.getChildren().addAll(posterImageView,movieLabel,watchingDate);


        stackBox.setOnMouseClicked(event ->{
            showPoster(record.getMovie());

            searchTilPane.getChildren().clear();

            movie1.setStyle("-fx-background-color:rgba(172, 172, 172, 0.35);");
            list1.setStyle("-fx-background-color: transparent ;");
            home1.setStyle("-fx-background-color: transparent ;");
            genera1.setStyle("-fx-background-color: transparent;");
            history1.setStyle("-fx-background-color: transparent ;");
            fakeCombo.setVisible(false);
            fakeIqon.setVisible(false);

            bigConrainer.setVisible(true);
            bigConSearch.setVisible(false);
            fakeCombo.setVisible(false);
            fakeIqon.setVisible(false);
            warningSearch.setVisible(false);
            searchFeild.clear();
        });

        stackBox.setAlignment(movieLabel, Pos.BOTTOM_LEFT);
        tilePane.setHgap(10.0);
        tilePane.setVgap(10.0);

        tilePane.getChildren().add(stackBox);

    }

    private void showPoster(Movie movie) {




        scrollPane.setVvalue(0.0);

        VBox movieBox = new VBox();

        //Clear the current page
        movieTilePane1.getChildren().clear();
        scrollPane.setContent(movieTilePane1);
        movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 10px;");


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

        //Labels
        Label movieTitle = new Label(movie.getTitle());
        movieTitle.setStyle("-fx-text-fill: white; -fx-font-size: 40;-fx-font-weight: 700;-fx-padding:0 30px 10px 0");
        movieTitle.setPrefWidth(400);
        movieTitle.setAlignment(Pos.CENTER_LEFT);
        Label year = new Label(Integer.toString(movie.getYear())+" "+Float.toString(movie.getRunningtime()).charAt(0)+" Hour "+Float.toString(movie.getRunningtime()).charAt(2)+Float.toString(movie.getRunningtime()).charAt(3)+" Minutes");
        year.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:0 0 0 4px;");
        Label movieDescription = new Label(movie.getMovieDescription());
        movieDescription.setStyle("-fx-text-fill: white;-fx-font-size:15.9px;-fx-font-weight: 700;-fx-padding:0 0 30px 4px;");
        movieDescription.setPrefWidth(moviePoster.getFitWidth()-400);
        movieDescription.setWrapText(true);



        //Buttons
        HBox buttons = new HBox();
        Button watch = new Button("Watch");
        Button add = new Button("Add");
        watch.setGraphic(playIcon);
        add.setGraphic(addIcon);

        if(!HelloApplication.users.get(User.whoIsActive-1).getMovieList().contains(movie))
        {
            add.setText("Add");
            addIcon.setRotate(0.0);
        }
        else
        {
            add.setText("Remove");
            addIcon.setRotate(90.0);
        }

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


        watch.setOnMouseClicked(event -> {

            if(!HelloApplication.users.get(User.whoIsActive-1).getEmail().equals("admin@gmail.com")&&!HelloApplication.users.get(User.whoIsActive-1).getSubscription().isPlaneActive())
            {

                HelloApplication.users.get(User.whoIsActive-1).setSubscriptionActive(false);

                subscriptionPlanss.setVisible(true);
                bigConrainer.setVisible(false);
                movieTilePane1.getChildren().clear();
                container.getChildren().clear();
                fakeCombo.setVisible(false);
                mainMenu.setVisible(false);
                fakeIqon.setVisible(false);


            }
            else if (!isWatchedBefore(movie))
            {
                HelloApplication.users.get(User.whoIsActive-1).getSubscription().setCapacity((byte) (HelloApplication.users.get(User.whoIsActive-1).getSubscription().getCapacity()-1));
                HelloApplication.users.get(User.whoIsActive-1).addToHistory(new UserWatchRecord(User.whoIsActive, movie.getMovieId(), movie));
                movie.watchemovie();
            }
            else
            {
                HelloApplication.users.get(User.whoIsActive-1).addToHistory(new UserWatchRecord(User.whoIsActive, movie.getMovieId(), movie));
                movie.watchemovie();
            }

        });

        add.setOnMouseClicked(event -> {
            if(!HelloApplication.users.get(User.whoIsActive-1).getMovieList().contains(movie))
            {
                HelloApplication.users.get(User.whoIsActive-1).addToMovieList(movie);
                add.setText("Remove");
                System.out.println("Added The Movie");
            }
            else
            {
                Iterator<Movie> iterator = HelloApplication.users.get(User.whoIsActive-1).getMovieList().iterator();

                while (iterator.hasNext()) {
                    Movie film = iterator.next();
                    if (movie.getMovieId() == film.getMovieId()) {
                        iterator.remove();
                    }
                }

                add.setText("Add");

            }
        });

        //Buttons styling
        watch.setStyle("-fx-text-fill: black; -fx-font-size: 19;-fx-font-weight: 700; -fx-background-color: white;");
        watch.setPrefSize(150,50);
        add.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700; -fx-background-color: #383533;");
        add.setPrefSize(150,50);
        buttons.getChildren().addAll(watch,add);

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
        type.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;-fx-padding:0 0 20px 4px;");

        //To set Border
        Rectangle clip = new Rectangle(moviePoster.getFitWidth(), moviePoster.getFitHeight());
        clip.setArcWidth(25);
        clip.setArcHeight(25);
        moviePoster.setClip(clip);

        //Right info container
        VBox rightInfo = new VBox();
        rightInfo.getChildren().addAll(movieTitle,year,type,movieDescription,buttons);

        //Right info and poster container
        HBox head = new HBox();
        head.getChildren().addAll(moviePoster,rightInfo);
        head.setSpacing(15);

        //controls
        Button castControl = new Button("Cast");
        Button detailsControl = new Button("Details");
        Button likeControl = new Button("More like this");
        castControl.setStyle("-fx-text-fill: white; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent;-fx-border-width:0 0 1px 0; -fx-border-color:yellow;");
        castControl.setPrefSize(50,50);
        detailsControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent;");
        detailsControl.setPrefSize(70,50);
        likeControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent;");
        likeControl.setPrefSize(120,50);

        castControl.setOnMouseEntered(event -> {
            castControl.setCursor(Cursor.HAND);
        });
        castControl.setOnMouseExited(event -> {
            castControl.setCursor(Cursor.DEFAULT);
        });
        detailsControl.setOnMouseEntered(event -> {
            detailsControl.setCursor(Cursor.HAND);
        });
        detailsControl.setOnMouseExited(event -> {
            detailsControl.setCursor(Cursor.DEFAULT);
        });
        likeControl.setOnMouseEntered(event -> {
            likeControl.setCursor(Cursor.HAND);
        });
        likeControl.setOnMouseExited(event -> {
            likeControl.setCursor(Cursor.DEFAULT);
        });

        castControl.setOnMouseClicked(event -> {
            castControl.setStyle("-fx-text-fill: white; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0 0 1px 0; -fx-border-color:yellow");
            detailsControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0;");
            likeControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0;");

            addCastToDisplay(movie.getCast());
        });

        detailsControl.setOnMouseClicked(event -> {
            detailsControl.setStyle("-fx-text-fill: white; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0 0 1px 0; -fx-border-color:yellow;");
            castControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0;");
            likeControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0;");

            addDetailsToDisplay(movie);
        });

        likeControl.setOnMouseClicked(event -> {
            likeControl.setStyle("-fx-text-fill: white; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0 0 1px 0; -fx-border-color:yellow;");
            detailsControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0;");
            castControl.setStyle("-fx-text-fill: #666462; -fx-font-size: 14;-fx-font-weight: 700; -fx-background-color: transparent; -fx-border-width:0;");

            addMoreLikeThisToDisplay(movie);
        });

        //cast
        addCastToDisplay(movie.getCast());

        HBox controls = new HBox();
        controls.getChildren().addAll(castControl,detailsControl,likeControl);
        controls.setSpacing(10);

        //All
        movieBox.setStyle("-fx-padding:20px");
        movieBox.setSpacing(10);
        movieBox.getChildren().addAll(head,controls,controlled);
        movieBox.setMargin(controls,new Insets(70,0,0,0));

        //All container
        movieTilePane1.getChildren().addAll(movieBox);
        movieTilePane1.setPrefWidth(1250);
        movieTilePane1.setPrefHeight(500);
    }

    private boolean isWatchedBefore(Movie movie)
    {
        boolean watchedBefore = false;

        Iterator<UserWatchRecord> iterator = HelloApplication.users.get(User.whoIsActive-1).getHistory().iterator();

        while (iterator.hasNext()) {
            UserWatchRecord UWR = iterator.next();
            if (UWR.getMovieId() == movie.getMovieId())
            {
                watchedBefore = true;
                iterator.remove();
            }
        }

        return watchedBefore;
    }

    private void addCastToDisplay(ArrayList<Cast> casts) {
        controlled.getChildren().clear();
        for (Cast actor : casts)
        {
            showCast(actor);
        }
    }
    private void showCast(Cast actor) {

        StackPane casts = new StackPane();

        File file = new File("src/main/resources/com/example/uservalidation/icons/castFrame.png");
        ImageView person = new ImageView(new Image(file.toURI().toString()));
        person.setFitWidth(155);
        person.setFitHeight(180);

        Label actorName=new Label(actor.getFirstName()+" "+actor.getLastName());
        actorName.setStyle("-fx-text-fill:white;-fx-font-size:17px; -fx-padding:0 0 30px 0;-fx-font-weight:700;");

        casts.getChildren().addAll(person,actorName);
        casts.setAlignment(actorName,Pos.BOTTOM_CENTER);

        casts.setStyle("-fx-margin:30px; -fx-border-width:1px;  -fx-border-radius:20px; -fx-background-color:transparent");

        casts.setOnMouseEntered(event -> {
            casts.setOpacity(0.5);
            casts.setCursor(Cursor.HAND);
        });

        casts.setOnMouseExited(event -> {
            casts.setOpacity(1.0);
            casts.setCursor(Cursor.DEFAULT);
        });

        casts.setOnMouseClicked(event ->{
            addActedMoviesForThisCast(actor);
        });


        controlled.getChildren().add(casts);
        controlled.setMargin(casts,new Insets(50,18,0,0));
    }
    private void addActedMoviesForThisCast(Cast actor) {
        movieTilePane1.getChildren().clear();

        Label firstName = new Label(actor.getFirstName());
        firstName.setStyle("-fx-text-fill: white; -fx-font-size: 60;-fx-font-weight: 500;-fx-background-color:#0F0A05; -fx-padding:0 0 0 20px;");
        firstName.setPrefWidth(350);

        Label lastName = new Label(actor.getLastName());
        lastName.setStyle("-fx-text-fill: white; -fx-font-size: 60;-fx-font-weight: 900;-fx-background-color:#0F0A05; -fx-padding:0 0 0 20px;");
        lastName.setPrefWidth(350);

        VBox fullName = new VBox();
        fullName.getChildren().addAll(firstName,lastName);


        HBox castsss = new HBox();
        castsss.setStyle("-fx-background-color:#0F0A05");

        movieTilePane1.setPrefWidth(1000);
        castsss.getChildren().addAll(fullName,movieTilePane1);
        scrollPane.setContent(castsss);
        scrollPane.setVvalue(0.0);

        for (int i=0 ; i<HelloApplication.movies.size() ; i++)
        {
            for(int j=0 ; j<HelloApplication.movies.get(i).getCast().size() ; j++)
            {
                if((HelloApplication.movies.get(i).getCast().get(j).getFirstName()+" "+HelloApplication.movies.get(i).getCast().get(j).getLastName()).equals(actor.getFirstName()+" "+actor.getLastName()))
                {
                    addMovieToTilePane(HelloApplication.movies.get(i),movieTilePane1);
                }
            }
        }
    }

    private void addDetailsToDisplay(Movie movie) {
        controlled.getChildren().clear();
        Label title = new Label(movie.getTitle());
        title.setStyle("-fx-text-fill: white; -fx-font-size: 16;-fx-font-weight: 900; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        Label type_year = new Label(movie.getTypes().get(0)+" "+movie.getYear());
        type_year.setStyle("-fx-text-fill: c1bdb9; -fx-font-size: 13;-fx-font-weight: 200; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        Label country = new Label("Country: "+movie.getCountry());
        country.setStyle("-fx-text-fill: white; -fx-font-size: 13;-fx-font-weight: 200; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        Label description = new Label(movie.getMovieDescription());
        description.setStyle("-fx-text-fill: white; -fx-font-size: 13;-fx-font-weight: 200; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        String castString = "Actor: ";
        for (int i=0 ; i<movie.getCast().size() ; i++)
        {
            if(i!=movie.getCast().size()-1)
            {
                castString += movie.getCast().get(i).getFirstName()+" "+movie.getCast().get(i).getLastName()+", ";
            }
            else
            {
                castString += movie.getCast().get(i).getFirstName()+" "+movie.getCast().get(i).getLastName();
            }
        }

        Label casts = new Label(castString);
        casts.setStyle("-fx-text-fill: white; -fx-font-size: 13;-fx-font-weight: 200; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        Label budget = new Label("Budget: "+Float.toString(movie.getBudget()));
        budget.setStyle("-fx-text-fill: white; -fx-font-size: 13;-fx-font-weight: 200; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        Label Revenue = new Label("Revenue :"+Float.toString(+movie.getRevenue()));
        Revenue.setStyle("-fx-text-fill: white; -fx-font-size: 13;-fx-font-weight: 200; -fx-background-color: transparent;-fx-padding:0 0 15px;");

        VBox details = new VBox();
        details.getChildren().addAll(title,type_year,country,description,casts,budget,Revenue);

        controlled.getChildren().add(details);
        controlled.setMargin(details,new Insets(30,0,0,0));

    }

    private void addMoreLikeThisToDisplay(Movie movie) {
        controlled.getChildren().clear();
        int c=0;
        for (Movie m : HelloApplication.movies)
        {
            if((movie.getTypes().get(0).equals(m.getTypes().get(0))||movie.getCast().get(0).getLastName().equals(m.getCast().get(0).getLastName()))&&!movie.getTitle().equals(m.getTitle()))
            {
                c++;
                showLikeThis(m);
            }
            if(c==4)
            {
                break;
            }
        }
    }

    private void showLikeThis(Movie movie)
    {
        StackPane moviePoster = new StackPane();

        File file = new File(movie.getPoster());
        ImageView poster = new ImageView(new Image(file.toURI().toString()));
        poster.setFitWidth(292);
        poster.setFitHeight(150);
        poster.setOpacity(0.85);

        Rectangle clip = new Rectangle(poster.getFitWidth(), poster.getFitHeight());
        clip.setArcWidth(20);
        clip.setArcHeight(20);
        poster.setClip(clip);

        Glow glow = new Glow();
        glow.setLevel(0.9);

        Label movieTitle = new Label(movie.getTitle());
        movieTitle.setStyle("-fx-text-fill: white; -fx-font-size: 19;-fx-font-weight: 700;");
        movieTitle.setEffect(glow);
        moviePoster.setStyle("-fx-border-color: black;");


        moviePoster.setStyle("-fx-border-color: black;");

        moviePoster.getChildren().addAll(poster,movieTitle);

        moviePoster.setOnMouseEntered(event -> {
            moviePoster.setOpacity(0.5);
            moviePoster.setCursor(Cursor.HAND);
        });

        moviePoster.setOnMouseExited(event -> {
            moviePoster.setOpacity(1.0);
            moviePoster.setCursor(Cursor.DEFAULT);
        });

        moviePoster.setOnMouseClicked(event ->{
            bigConSearch.setVisible(false);
            showPoster(movie);
        });

        moviePoster.setAlignment(movieTitle, Pos.BOTTOM_LEFT);

        controlled.getChildren().add(moviePoster);
        controlled.setPrefWidth(1224);

        controlled.setMargin(moviePoster,new Insets(50,10,0,0));

    }


    private void displayGenre(ArrayList<String> genres) {

        for (String genre : genres)
        {
            displayGenrePoster(genre);
        }

    }

    private void displayGenrePoster(String genre)
    {
        File file = new File("src/main/resources/com/example/uservalidation/icons/genraBackground.jpg");
        ImageView imageView = new ImageView(new Image(file.toURI().toString()));
        imageView.setFitWidth(405);
        imageView.setFitHeight(150);


        Label genreName = new Label(genre);
        genreName.setStyle("-fx-background-color:transparent; -fx-font-size:25px; -fx-text-fill:white ; -fx-font-weight:900;");


        Rectangle clip = new Rectangle(imageView.getFitWidth(), imageView.getFitHeight());
        clip.setArcWidth(20);
        clip.setArcHeight(20);
        imageView.setClip(clip);
        imageView.setOpacity(0.5);



        StackPane genrePoster = new StackPane();


        genrePoster.setOnMouseEntered(event -> {
            imageView.setOpacity(0.7);
            imageView.setCursor(Cursor.HAND);
        });

        genrePoster.setOnMouseExited(event -> {
            imageView.setOpacity(0.5);
            imageView.setCursor(Cursor.DEFAULT);
        });

        genrePoster.setOnMouseClicked(event -> {
            movieTilePane1.getChildren().clear();
            container.getChildren().clear();

            movieTilePane1.setStyle("-fx-background-color: #0F0A05; -fx-padding: 0;");

            Label genreTitle = new Label(genre);
            genreTitle.setStyle("-fx-background-color:transparent; -fx-font-size:30px; -fx-text-fill:white ; -fx-font-weight:900;");

            container.getChildren().addAll(genreTitle,movieTilePane1);
            container.setStyle("-fx-background-color: #0F0A05; -fx-padding: 20px 10px 0 10px;");

            container.setSpacing(10);

            scrollPane.setContent(container);

            for(Movie movie : HelloApplication.movies)
            {
                if(genre.equals(movie.getTypes().get(0)))
                {
                    addMovieToTilePane(movie,movieTilePane1);
                }
            }

        });



        genrePoster.getChildren().addAll(imageView,genreName);
        genrePoster.setAlignment(genreName, Pos.CENTER);

        movieTilePane1.getChildren().addAll(genrePoster);
        movieTilePane1.setStyle("-fx-padding:50px 10px 0 22px;-fx-background-color:#0F0A05;");
        movieTilePane1.setVgap(10);
        movieTilePane1.setHgap(10);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        emailSignIn.setText("admin@gmail.com");
        passwordSignIn.setText("admin111");

        analysisTxt.setOnMouseClicked(event -> setvboxxx());
        closee.setOnMouseClicked(event -> closeboxx());
        scrollPane.setStyle("-fx-background-color: #0F0A05;");
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        scrollPaneSearch.setStyle("-fx-background-color: #0F0A05;");
        scrollPaneSearch.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPaneSearch.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPaneSearch.setFitToWidth(true);
        scrollPaneSearch.setFitToHeight(true);

    }

}