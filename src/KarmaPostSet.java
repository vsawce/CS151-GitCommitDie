public class KarmaPostSet {
    public int userPostID;
    int userKarmaState;
    boolean isComment;

    KarmaPostSet(int upid, int uks, boolean ic){}

    int getUserPostID()     { return userPostID; }
    int getUserKarmaState() { return userKarmaState; }
    boolean getIsComment()  { return isComment; }

    //For tracking if users have already upvoted/downvoted something
    //0 = untouched
    //1 = upvoted
    //2 = downvoted
    void setUserKarmaState (int uks) { userKarmaState = uks; }
}
