package src;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Post{
    private final String timezone = "UTC";
    public User user;
    //private String date;
    private long time;
    private int postID;
    private int karma;
    private ArrayList<String> comments = new ArrayList<>();

    public void setUser(User user)      { this.user = user; }
    //public void setDate(String date)    { this.date = date; }
    public void setTime(long time)    { this.time = time; }
    public void setPostID(int postID)   { this.postID = postID; }
    public void setKarma (int karma)    { this.karma = karma; }

    public User getUser()               { return user; }
    //public String getDate()             { return date; }
    public long getTime()               { return time; }
    public int getPostID()              { return postID; }
    public int getKarma()               { return karma; }

    public String epochToReadableDateString(long time) {
        //Epoch to readable time conversion
        Date t = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone(timezone));
        return sdf.format(t);
    }

    public ArrayList<String> getComments() { return comments;}

    void deletePost(ArrayList list, int index){ list.remove(index); }
    //void setInfo(Post p, User user, int id, String date, String time, int karma){
    void setInfo(Post p, User user, int id, long time, int karma){
        p.setUser(user);
        //p.setDate(date);
        p.setTime(time);
        p.setPostID(id);
        p.setKarma(karma);
        this.user.addAssociatedPost(this); //Associates post with user once setInfo is called
    }

    void incrementKarma(){ karma++; }
    void decrementKarma(){ karma--; }
}