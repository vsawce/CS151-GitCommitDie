import java.util.ArrayList;

public class Page {
    //private int     pageType;
    private User     currUser;
    private TextPost currPost;
    private Comment  currComment;
    private ArrayList<Post> posts;
     

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

    void sortByTime(){
        
        Collections.sort(posts, (n1,n2) -> {

            int n1Month = Integer.parseInt(n1.getDate().subString(5, 7));
            
            int n2Month = Integer.parseInt(n2.getDate().subString(5, 7));
            int n1Day = Integer.parseInt(n1.getDate().subString(8, 10));
            int n2Day = Integer.parseInt(n2.getDate().subString(8, 10));
            int n1Year = Integer.parseInt(n1.getDate().subString(0, 4));
            int n2Year = Integer.parseInt(n2.getDate().subString(0, 4));

            int n1TimeHr = Integer.parseInt(n1.getTime().subString(0, 2));
            int n2TimeHr = Integer.parseInt(n2.getTime().subString(0, 2));
            int n1TimeMin = Integer.parseInt(n1.getTime().subString(3, 5));
            int n2TimeMin = Integer.parseInt(n2.getTime().subString(3, 5));
            int n1TimeSec = Integer.parseInt(n1.getTime().subString(6, 8));
            int n2TimeSec = Integer.parseInt(n2.getTime().subString(6, 8));
            Date1 = new Date(n1Year, n1Month, n1Day, n1TimeHr, n1TimeMin, n1TimeSec);
            Date2 = new Date(n2Year, n2Month, n2Day, n2TimeHr, n2TimeMin, n2TimeSec);

            return Date1.compareTo(Date2);
        } );

        
    }
    void sortByKarma(){

        Collections.sort(posts, (n1,n2) -> {

            return Integer.compare(n1.getKarma(), n2.getKarma());
        });
        

        
    }
}
