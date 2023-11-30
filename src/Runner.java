// Hello World Template
// FileName : "HelloWorld.java". 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.w3c.dom.Text;

import java.util.Random;

public class Runner { 
    /**public static void main(String args[]) 
    { 
        //Test code for compilation testing purposes
        User nerd = new User("vsawce", "123");
        Post p = new Post(nerd, "r/tifu blah blah blah");
        System.out.println("----------------");
        System.out.println("Username: " + p.getUser().getName());
        System.out.println("Date: " + p.getDate());
        System.out.println("Post Id: " + p.getPostId());
        System.out.println("\n"+p.getTextPostContents());
        System.out.println("----------------");
    } **/

    public static void print(String s) { System.out.println(s); }
    public static long time() { return System.currentTimeMillis(); }
    //public static String time() { return java.time.LocalTime.now().toString(); }
    //public static String date() { return java.time.LocalDate.now().toString(); }

    //For class demo only
    public static void delayMs(long timeout) {
        try {
            // Sleep for 3 seconds
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            // Handle the InterruptedException (if necessary)
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Page page = new Page();

        //creating a user
        print("###### Let's create Vincent's account #######");
        print("****** CREATING USER ******");
        User user1 = new User("vsawce", "abc123");
        print("username: " + user1.getName());
        print("password: " + user1.getPassword());

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        //creating second user
        print("###### Let's create Victorias's account #######");
        print("****** CREATING USER ******");
        User user2 = new User("levictoria0117", "abc123");
        print("username: " + user2.getName());
        print("password: " + user2.getPassword());

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        //checking login information
        print("###### Let's log Vincent in #######");
        print("****** CHECKING LOGIN INFO ******");
        boolean authSuccess = false;
        while (!authSuccess) {
            System.out.print("confirm password: ");
            String confirmPassword = myObj.nextLine();
            if (user1.checkPassword(confirmPassword)) {
                print("Passwords match. Login successful.");
                user1.setAuthStatus(true);
            }
            else{
                print("Passwords do not match. Please try again.");
                user1.setAuthStatus(false);
            }
            authSuccess = user1.getAuthStatus();
            System.out.println("User " + user1.getName() + " is authorized: " + user1.getAuthStatus() + "\n");
        }

        //viewing users
        print("****** USER & PASSWORD LIST ******");

        ArrayList<String> userInfo = new ArrayList<>();
        userInfo.add(user1.getName() + " " + user1.getPassword());
        userInfo.add(user2.getName() + " " + user2.getPassword());

        print("list of users:");
        for (int i = 0; i < userInfo.size(); i++) print(userInfo.get(i));

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        //creating a post
        print("****** CREATING A POST ******");

        Random r = new Random();
        String postString = "";
        do {
            postString = myObj.nextLine();
        } while (postString.trim().length() == 0); //While whitespace present

        TextPost post1 = new TextPost(postString);
        post1.setInfo(post1, user1, r.nextInt(1000), time(), 1);
        page.addPostToView(post1);

        print("");
        print("****** VIEWING ALL POSTS ******");
        page.displayListOfPosts();

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        //creating a post
        print("****** CREATING A POST ******");

        r = new Random();
        postString = "";
        do {
            postString = myObj.nextLine();
        } while (postString.trim().length() == 0); //While whitespace present

        TextPost post2 = new TextPost(postString);
        post2.setInfo(post2, user1, r.nextInt(1000), time(), 1);
        page.addPostToView(post2);
        
        print("");
        print("****** VIEWING ALL POSTS ******");
        page.displayListOfPosts();

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        //Signing vincent out
        print("###### Let's sign Vincent out ######");
        print("****** SIGNING OUT ******");
        user1.setAuthStatus(false);
        System.out.println("Signing user " + user1.getName() + " out.");
        System.out.println("User " + user1.getName() + " is authorized: " + user1.getAuthStatus() + "\n");

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        //checking login information
        print("###### Let's log Victoria in #######");
        print("****** CHECKING LOGIN INFO ******");
        authSuccess = false;
        while (!authSuccess) {
            System.out.print("confirm password: ");
            String confirmPassword = myObj.nextLine();
            if (user2.checkPassword(confirmPassword)) {
                print("Passwords match. Login successful.");
                user2.setAuthStatus(true);
            }
            else{
                print("Passwords do not match. Please try again.");
                user2.setAuthStatus(false);
            }
            authSuccess = user2.getAuthStatus();
            System.out.println("User " + user2.getName() + " is authorized: " + user2.getAuthStatus() + "\n");
        }

        print("###### Let's select a post to upvote from Victoria's account #######");
        print("****** SELECTING POST ******");
        boolean isNum = false;
        int postIdx = -1;
        while (!isNum) {
            System.out.print("Post index (starting from 0): ");
            String s = myObj.nextLine();
            try {
                postIdx = Integer.parseInt(s);
                if (postIdx > page.getNumberOfPosts() || postIdx < 0) {
                    System.out.println("Invalid index, try again");
                    isNum = false;
                }
                else {
                    System.out.println("Selected post index: " + postIdx);
                    isNum = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid index, try again");
                isNum = false;
            }
        }
        print("");
        
        TextPost selPost = page.getTextPostFromList(postIdx);

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        // Upvoting a post
        print("****** UPVOTING POST IDX " + postIdx + " ******");
        
        KarmaPostSet kPost = new KarmaPostSet(selPost.getPostID(), 0, false);
        if (kPost.getUserKarmaState() == 1 || kPost.getUserKarmaState() == 2) {
            System.out.println("You already left karma on this post.");
        }
        else {
            selPost.incrementKarma();
            kPost.userKarmaState = 1;
        }

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        print("****** VIEWING ALL POSTS ******");
        page.displayListOfPosts();

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        print("###### Let's say we want to sort by time, descending #######");
        boolean a = false;
        page.sortByTime(a);
        print("****** VIEWING ALL POSTS (SORTED BY TIME, ASCENDING:" + a + ") ******");
        page.displayListOfPosts();

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        print("###### Let's say we want to sort by karma, ascending #######");
        a = true;
        page.sortByKarma(a);
        print("****** VIEWING ALL POSTS (SORTED BY TIME, ASCENDING:" + a + ") ******");
        page.displayListOfPosts();

        myObj.nextLine(); //demo breakpoint //////////////////////////////////////////////////////

        print("****** USER KARMA SUMMARY ******");
        print("" + user1.getName() + " karma: " + user1.getKarma());
        print("" + user2.getName() + " karma: " + user2.getKarma());

        myObj.close(); //Close scanner to prevent resource leak & warning
    }
}
