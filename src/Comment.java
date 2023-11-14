import java.util.ArrayList;

public class Comment extends Post{
    String commentText;
    int commentID;
    ArrayList<String> comments;

    public Comment(String comment){
        commentText = comment;
    }

    void setCommentText(String commentText) { this.commentText = commentText; }
    void setCommentID(int commentID)        { this.commentID = commentID; }
    String getCommentText()                 { return commentText; }
    int getCommentID()                      { return commentID; }

    String displayComment(int id, String name, String comment, int karma, String date, String time){
        String commentInfo = ("----- CommentID: " + id + "\n" + "      @" + name
                              + "\n      " + comment + "\n      Karma: " + karma
                              + "\n      " + date + " " + time + "\n");
        System.out.println(commentInfo);
        return commentInfo;
    }
}

/**import java.util.Random;

public class Comment {

    private String commentText; //
    private int commentId; //

    public Comment(String ct) {
        commentText = ct;

        Random rn = new Random(); //Random id
        commentId = rn.nextInt() + 1;
    }

    public String   getCommentText() {
        return commentText;
    }
    public int      getCommentId() {
        return commentId;
    }
    public void     setCommentText(String ct) { //
        commentText = ct;
    }
    public void     setCommentId(int cid) { //
        commentId = cid;
    }

}**/
