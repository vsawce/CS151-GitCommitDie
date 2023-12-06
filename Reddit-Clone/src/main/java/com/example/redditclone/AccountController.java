package com.example.redditclone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import src.Post;
import src.User;
import src.LoggedInUserSingleton;

import java.io.IOException;
import java.util.ArrayList;

public class AccountController extends ViewController{

    private Stage stage;
    private Scene scene;
    private Parent root;
    private LoggedInUserSingleton loggedInUser;

    public AccountController() {
        loggedInUser = LoggedInUserSingleton.getInstance();
    }

    @FXML
    public static ArrayList<User> allUsers = new ArrayList<>();
    @FXML
    private TextField user;
    @FXML
    private PasswordField pw;
    //@FXML

    //User u = new User("", "");
    //Post p = new Post();
    String name;

    @Override
    public void switchDefaultHomePage(ActionEvent e) throws IOException {
        super.switchDefaultHomePage(e);
    }

    public void submitInfoSignUp(ActionEvent e) throws IOException {
        User temp_u = new User(user.getText(), pw.getText());

        for (User u : allUsers) {
            if (temp_u.getName().equals(u.getName()) &&
                temp_u.getPassword().equals(u.getPassword())) {
                loggedInUser.setName(temp_u.getName());
                loggedInUser.setPassword(temp_u.getPassword());
                allUsers.add(temp_u);
                break;
            }
        }
        switchAuthHomePage(e);
    }

    public String getName(){
        return name;
    }

    public void switchToLogin(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void submitInfoLogin(ActionEvent e) throws IOException {
        User temp_u = new User(user.getText(), pw.getText());
        for (User u : allUsers) {
            if (temp_u.getName().equals(u.getName()) &&
                temp_u.getPassword().equals(u.getPassword()))
            {
                loggedInUser.setName(temp_u.getName());
                loggedInUser.setPassword(temp_u.getPassword());
                break;
            }
        }
        // else {
        //     //errorMessage.setText("Username or password is incorrect.");
        // }
        switchAuthHomePage(e);
    }

}
