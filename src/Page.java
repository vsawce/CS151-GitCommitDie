import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Page {
    //private int     pageType;
    private User     currUser;
    private TextPost currPost;
    private Comment  currComment;
    private ArrayList<TextPost> tps = new ArrayList<>();
     

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
                currComment.getKarma(), currComment.getTime());
    }
    String displayCurrPost() {
        return currPost.displayPost(currPost.getPostID(),
                currUser.getName(), currPost.getTextPost(),
                currPost.getTime(), currPost.getKarma());
    }

    void addPostToView(TextPost tp) {
        tps.add(tp);
    }

    int getNumberOfPosts() {
        return tps.size();
    }

    TextPost getTextPostFromList(int idx) {
        return tps.get(idx);
    }

    void displayListOfPosts() {
        tps.forEach((tp) -> {
            tp.displayPost(tp.getPostID(),
                tp.getUser().getName(), tp.getTextPost(),
                tp.getTime(), tp.getKarma());
        });
    }

    void displayPage(){
        System.out.println("----- Display Page -----");
        System.out.println("User: " + displayCurrUser());
        displayCurrPost();
        displayCurrComment();
        System.out.println("------------------------");
    }

    void sortByTime(boolean ascending){
        Collections.sort(tps, new Comparator<TextPost>() {
            @Override
            public int compare(TextPost n1, TextPost n2) {
                //Ascending order
                if (ascending) {
                    return Long.compare(n1.getTime(), n2.getTime());
                }
                //Descending order (n1/n2 swapped)
                return Long.compare(n2.getTime(), n1.getTime());
            }
        });
    }
    void sortByKarma(boolean ascending){
        Collections.sort(tps, new Comparator<TextPost>() {
            @Override
            public int compare(TextPost n1, TextPost n2) {
                //Ascending order
                if (ascending) {
                    return Integer.compare(n1.getKarma(), n2.getKarma());
                }
                //Descending order (n1/n2 swapped)
                return Integer.compare(n2.getKarma(), n1.getKarma());
            }
        });
        
    }
}
