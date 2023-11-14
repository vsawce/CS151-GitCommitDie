public class TextPost extends Post{
    String postContents;
    public TextPost(String post) {
        super();
        postContents = post; }
    void setTextPost(String postContents){ this.postContents = postContents; }
    String getTextPost() { return postContents; }

    String displayPost(int id, String name, String post, String date, String time, int karma){
        String postInfo = ("PostID: " + id + "\n" + "@" + name + "\n"
                + post + "\nKarma: " + karma + "\n" + date + " " + time + "\n");
        System.out.println(postInfo);
        return postInfo;
    }
}

/**public class TextPost {

    private String postContents; //

    public          TextPost(String pc) { //
        postContents = pc;
    }

    public String   getTextPost() { //
        return postContents;
    }
    public void     setTextPost(String tp) { //
        postContents = tp;
    }
    
}**/
