package com.example.redditclone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToAccountInfoPages(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchDefaultHomePage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("default-home-page.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchAuthHomePage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("auth-home-page.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDetailedTextPost(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("detailed-post-page.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchUserList(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("user-list.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}