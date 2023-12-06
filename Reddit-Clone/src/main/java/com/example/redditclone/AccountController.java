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

import java.io.IOException;
import java.util.ArrayList;

public class AccountController extends ViewController{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public static ArrayList<User> allUsers = new ArrayList<>();
    @FXML
    private TextField user;
    @FXML
    private PasswordField pw;
    @FXML

    User u = new User("", "");
    Post p = new Post();
    String name;

    @Override
    public void switchDefaultHomePage(ActionEvent e) throws IOException {
        super.switchDefaultHomePage(e);
    }

    public void submitInfoSignUp(ActionEvent e) throws IOException {
        switchAuthHomePage(e);
        String username = user.getText();
        String password = pw.getText();
        u.setName(username);
        u.setPassword(password);
        p.setUser(u);
        name = p.user.getName();
        if(!(allUsers.contains(u))) allUsers.add(u);
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
        switchAuthHomePage(e);
        String username = user.getText();
        String password = pw.getText();
        u.setName(username);
        u.setPassword(password);
        Post p = new Post();
        p.setUser(u);
        if(allUsers.contains(u)) {
            switchAuthHomePage(e);
        }
        else {
            //errorMessage.setText("Username or password is incorrect.");
        }
    }

}
