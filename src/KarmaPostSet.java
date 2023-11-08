public class KarmaPostSet {
    public int userPostID;
    int userKarmaState;
    boolean isComment;

    KarmaPostSet(int upid, int uks, boolean ic){}

    int getUserPostID()     { return userPostID; }
    int getUserKarmaState() { return userKarmaState; }
    boolean getIsComment()  { return isComment; }

    void setUserKarma(int uks){}
}
