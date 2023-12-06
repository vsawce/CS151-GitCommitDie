package com.example.redditclone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PostViewController extends ViewController{

    @Override
    public void switchAuthHomePage(ActionEvent e) throws IOException {
        super.switchAuthHomePage(e);
    }

    @Override
    public void switchUserList(ActionEvent e) throws IOException {
        super.switchUserList(e);
    }

    public void sortCommentsByTime(ActionEvent e) throws IOException{

    }

    public void sortCommentsByKarma(ActionEvent e) throws IOException{

    }
}
