import java.util.ArrayList;

public class Post{
    private User user;
    private String date;
    private String time;
    private int postID;
    private int karma;
    private ArrayList<String> comments = new ArrayList<>();

    public void setUser(User user)      { this.user = user; }
    public void setDate(String date)    { this.date = date; }
    public void setTime(String time)    { this.time = time; }
    public void setPostID(int postID)   { this.postID = postID; }
    public void setKarma (int karma)    { this.karma = karma; }

    public User getUser()               { return user; }
    public String getDate()             { return date; }
    public String getTime()             { return time; }
    public int getPostID()              { return postID; }
    public int getKarma()               { return karma; }

    public ArrayList<String> getComments() { return comments;}

    void deletePost(ArrayList list, int index){ list.remove(index); }
    void setInfo(Post p, User user, int id, String date, String time, int karma){
        p.setUser(user);
        p.setDate(date);
        p.setTime(time);
        p.setPostID(id);
        p.setKarma(karma);
        this.user.addAssociatedPost(this); //Associates post with user once setInfo is called
    }

    void incrementKarma(){ karma++; }
    void decrementKarma(){ karma--; }
}

/**import java.util.ArrayList;
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
}**/
