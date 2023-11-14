import java.util.ArrayList;

public class Page {
    //private int     pageType;
    private User     currUser;
    private TextPost currPost;
    private Comment  currComment;

    //private void setPageType(int pageType) { this.pageType = pageType; }
    void setCurrUser(User currUser)          { this.currUser = currUser; }
    void setCurrPost(TextPost currPost)      { this.currPost = currPost; }
    void setCurrComment(Comment currComment) { this.currComment = currComment;}

    //private int getPageType()  { return pageType; }
    //User getCurrUser()         { return currUser; }
    //TextPost getCurrPost()     { return currPost; }

    String displayCurrUser()     { return currUser.getName(); }
    String displayCurrComment() {
        return currComment.displayComment(currComment.getPostID(),
                currUser.getName(), currComment.getCommentText(),
                currComment.getKarma(),
                currComment.getDate(), currComment.getTime());
    }
    String displayCurrPost() {
        return currPost.displayPost(currPost.getPostID(),
                currUser.getName(), currPost.getTextPost(),
                currPost.getDate(), currPost.getTime(), currPost.getKarma());
    }

    void displayPage(){
        System.out.println("----- Display Page -----");
        System.out.println("User: " + displayCurrUser());
        displayCurrPost();
        displayCurrComment();
        System.out.println("------------------------");
    }

    void sortByTime(ArrayList list){}
    void sortByKarma(ArrayList list){}
}
