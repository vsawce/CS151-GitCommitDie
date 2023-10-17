import java.util.ArrayList;
import java.util.Random;

public class Post {
    private User    user; //
    private long    date; //Now long, epoch time (in ms)
    //private String  time; //
    private int     postId; //
    private TextPost    textPost; //
    private ArrayList<Comment> comments; //

    public Post(User u, String tpc) { //
        user = u;

        date = System.currentTimeMillis(); //Record current epoch time

        Random rn = new Random(); //Random id
        postId = rn.nextInt() + 1;

        TextPost tp = new TextPost(tpc); //
        textPost = tp; //Class member to new allocated TextPost object
    }

    public  User    getUser() {
        return user;
    }
    public  long    getDate() { //
        return date;
    }
    public  int     getPostId() {
        return postId;
    }
    public String   getTextPostContents() { //
         return textPost.getTextPost();
    }
    public ArrayList<Comment> getCommentList() {
        return comments;
    }

    public void     setUser(User u) { //
        user = u;
    }
    public void     setDate(long d) { //Epic argument list!!! B)
        date = d;
    }
    public void     setPostId(int pid) { //
        postId = pid;
    }

    public void     addComment(Comment c) { //
        comments.add(c);
    }
    public void     deleteComment(int idx) { //
        comments.remove(idx);
    }
}
