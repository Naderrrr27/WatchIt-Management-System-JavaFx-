package com.example.uservalidation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MenuController {

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
    private ImageView search1;

    @FXML
    private ImageView userAcc1;

    @FXML
    private AnchorPane bigConrainer;

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

    //userNameeeeeee

}
