import java.util.Random;

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

}
