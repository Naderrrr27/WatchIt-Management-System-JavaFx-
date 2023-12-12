package com.example.uservalidation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController implements Initializable {

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
        for (User it : HelloApplication.users)
        {
            if(userNameSignUp.getText().equals(it.getUserName()))
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

    public void signUp()
    {
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
                    emailSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #1de03a;");
                    passwordSignIn.setStyle("-fx-border-width: 0 0 2 0;-fx-border-radius: 10;-fx-text-inner-color:white;-fx-border-color: #1de03a;");
                    emailValid.setVisible(false);
                    passwordValid.setVisible(false);
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
}