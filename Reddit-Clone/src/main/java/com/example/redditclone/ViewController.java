package com.example.redditclone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewController<filename> {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchPage(ActionEvent e, String filename) throws IOException {
        root = FXMLLoader.load(getClass().getResource(filename));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAccountInfoPages(ActionEvent e) throws IOException {
        switchPage(e, "signup.fxml");
    }

    public void switchDefaultHomePage(ActionEvent e) throws IOException {
        switchPage(e, "default-home-page.fxml");
    }

    public void switchAuthHomePage(ActionEvent e) throws IOException {
        switchPage(e, "auth-home-page.fxml");
    }

    public void switchToDetailedTextPost(ActionEvent e) throws IOException {
        switchPage(e, "detailed-post-page.fxml");
    }

    public void switchToDefaultDetailedTextPost(ActionEvent e) throws IOException {
        switchPage(e, "default-detailed-post-page.fxml");
    }

    public void switchUserList(ActionEvent e) throws IOException {
        switchPage(e, "user-list.fxml");
    }

}
