// Hello World Template
// FileName : "HelloWorld.java". 
import java.util.ArrayList;
import java.util.Scanner;
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
    public static String time() { return java.time.LocalDate.now().toString(); }
    public static String date() { return java.time.LocalDate.now().toString(); }

    public static void main(String[] args) {

        //creating a user
        print("CREATING A USER");
        User user = new User("newuser", "password123");
        print("username: " + user.getName());
        print("password: " + user.getPassword());

        //changing username and password
        print("\nUPDATING USER");
        user.setName("username123");
        user.setPassword("123password");
        print("username: " + user.getName());
        print("password: " + user.getPassword());

        //checking login information
        print("\nCHECKING LOGIN INFORMATION");
        Scanner myObj = new Scanner(System.in);
        print("confirm password:");
        String confirmPassword = myObj.nextLine();

        if (user.checkPassword(confirmPassword)) {
            print("Passwords match. Login successful.");
            user.setAuthStatus(true);
        }
        else{
            print("Passwords do not match. Please try again.");
            user.setAuthStatus(false);
        }
        System.out.println("User is authorized: " + user.getAuthStatus() + "\n");

        //viewing users
        print("VIEW USERS");
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");

        ArrayList<String> userInfo = new ArrayList<>();
        userInfo.add(user1.getName() + " " + user1.getPassword());
        userInfo.add(user2.getName() + " " + user2.getPassword());
        userInfo.add(user3.getName() + " " + user3.getPassword());

        print("list of users:");
        for (int i = 0; i < userInfo.size(); i++) print(userInfo.get(i));

        //deleting users
        print("\nDELETING A USER");
        user1.deleteAccount(userInfo, 1);
        print("updated list of users:");
        for (int i = 0; i < userInfo.size(); i++) print(userInfo.get(i));

        //creating a post
        print("\nCREATING A POST");
        Random r = new Random();
        TextPost post = new TextPost("test post");
        post.setInfo(post, user, r.nextInt(1000), date(), time());

        //read post
        post.displayPost(post.getPostID(), post.getUser().getName(),
                post.getTextPost(), post.getDate(), post.getTime());

        //update post
        print("UPDATING A POST");
        post.setTextPost("updated test post");
        post.displayPost(post.getPostID(), post.getUser().getName(),
                post.getTextPost(), post.getDate(), post.getTime());

        //deleting post
        print("DELETING A POST" + "\n----- initial list of posts -----\n");

        ArrayList<TextPost> posts = new ArrayList<>();

        TextPost one = new TextPost("test post number one");
        one.setInfo(one, user, r.nextInt(1000), date(), time());

        TextPost two = new TextPost("test post number two");
        two.setInfo(two, user, r.nextInt(1000), date(), time());

        one.displayPost(one.getPostID(), one.getUser().getName(),
                one.getTextPost(), one.getDate(), one.getTime());
        two.displayPost(two.getPostID(), two.getUser().getName(),
                two.getTextPost(), two.getDate(), two.getTime());

        posts.add(one);
        posts.add(two);

        one.deletePost(posts, posts.indexOf(one));
        print("----- updated list of posts ------\n");
        for (int i = 0; i < posts.size(); i++){
            post = posts.get(i);
            post.displayPost(post.getPostID(), post.getUser().getName(),
                    post.getTextPost(), post.getDate(), post.getTime());
        }
        print("--------------------------------");

        //creating comment
        print("\nCREATING A COMMENT");
        Comment comment = new Comment("test comment");
        comment.setInfo(comment, user, r.nextInt(1000), date(), time());

        //read comment
        comment.displayComment(comment.getCommentID(),post.getUser().getName(),
                comment.getCommentText(), comment.getDate(),comment.getTime());

        //update comment
        print("UPDATING A COMMENT");
        comment.setCommentText("updated test comment");
        comment.displayComment(comment.getCommentID(),post.getUser().getName(),
                comment.getCommentText(), comment.getDate(),comment.getTime());

        //deleting comment
        print("DELETING A COMMENT" + "\n----- initial list of comments -----\n");
        ArrayList<Comment> comments = new ArrayList<>();
        Comment c1 = new Comment("test comment number 1");
        Comment c2 = new Comment("test comment number 2");
        Comment c3 = new Comment("test comment number 3");

        c1.setInfo(c1, user, r.nextInt(1000), date(), time());
        c2.setInfo(c2, user, r.nextInt(1000), date(), time());
        c3.setInfo(c3, user, r.nextInt(1000), date(), time());

        comments.add(c1);
        comments.add(c2);
        comments.add(c3);

        for (int i = 0; i < comments.size(); i++) {
            Comment cm = comments.get(i);
            cm.displayComment(cm.getPostID(), cm.getUser().getName(),
                    cm.getCommentText(), cm.getDate(), cm.getTime());
        }

        c2.deletePost(comments, comments.indexOf(c2));

        print("----- updated list of comments ------\n");
        for (int i = 0; i < comments.size(); i++){
            Comment cm = comments.get(i);
            cm.displayComment(cm.getPostID(), cm.getUser().getName(),
                    cm.getCommentText(), cm.getDate(), cm.getTime());
        }
        print("--------------------------------");

        //page
        User sampleUser = new User("sampleuser", "samplepassword");

        TextPost sampleTextPost = new TextPost("This is a sample post.");
        sampleTextPost.setInfo(sampleTextPost, sampleUser, r.nextInt(1000), date(), time());

        Comment sampleComment = new Comment("This is a sample comment");
        sampleComment.setInfo(sampleComment, sampleUser, r.nextInt(1000), date(), time());

        Page page = new Page();
        page.setCurrUser(sampleUser);
        page.setCurrPost(sampleTextPost);
        page.setCurrComment(sampleComment);
        page.displayPage();
    }
}
