package com.example.redditclone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import src.TextPost;
import src.User;
import src.LoggedInUserSingleton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class HomePageController extends ViewController{

    @FXML
    private TextArea post;
    @FXML
    private Label postsList;

    ArrayList<TextPost> allPosts = new ArrayList<>();

    LoggedInUserSingleton liu = LoggedInUserSingleton.getInstance();

    String postContents;
    Random r = new Random();

    public void createPost() {
        TextPost tp = new TextPost(post.getText());
        tp.setPostID(r.nextInt(1000)); //Random post ID for now
        //tp.setUser();
        tp.setTime(System.currentTimeMillis());
        tp.setKarma(1); //Default karma = 1
        //postContents = tp.displayPost(r.nextInt(1000), accountController.getName(),
        //        post.getText(), System.currentTimeMillis(), tp.getKarma());
        allPosts.add(tp); //Add new post to existing ArrayList
        displayPost();
    }

    public void displayPost(){
        String postDisplay = "";
        //if (!(allPosts.contains(postContents))){
        //    allPosts.add(postContents);
        //    for (String p : allPosts){
        //        postDisplay = postDisplay + p;
        //    }
        //}
        for (TextPost tp : allPosts) {
            postDisplay += tp.displayPost(tp.getPostID(), liu.getName(), tp.getTextPost(), tp.getTime(), tp.getKarma());
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
