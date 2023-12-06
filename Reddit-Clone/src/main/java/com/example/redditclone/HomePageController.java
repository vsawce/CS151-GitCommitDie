package com.example.redditclone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import src.TextPost;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class HomePageController extends ViewController{

    @FXML
    private TextArea post;
    @FXML
    private Label postsList;

    ArrayList<String> allPosts = new ArrayList<>();

    String postContents;
    String postDisplay;
    Random r = new Random();
    TextPost tp = new TextPost("");
    AccountController accountController = new AccountController();

    public void createPost() {
        postContents = tp.displayPost(r.nextInt(1000), accountController.getName(),
                post.getText(), System.currentTimeMillis(), tp.getKarma());
        displayPost();
    }

    public void displayPost(){
        if (!(allPosts.contains(postContents))){
            allPosts.add(postContents);
            for (String p : allPosts){
                postDisplay = postDisplay + p;
            }
        }
        postsList.setText(postDisplay);
    }

    public void sortPostsByTime(ActionEvent e) throws IOException{

    }

    public void sortPostsByKarma(ActionEvent e) throws IOException{

    }

    @Override
    public void switchUserList(ActionEvent e) throws IOException {
        super.switchUserList(e);
    }

    @Override
    public void switchToDetailedTextPost(ActionEvent e) throws IOException {
        super.switchToDetailedTextPost(e);
    }
}
