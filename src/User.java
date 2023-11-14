import java.util.ArrayList;

public class User {
    String name;
    String password;
    boolean authStatus;
    int totalKarma;
    ArrayList<KarmaPostSet> kpSet;
    ArrayList<Post> associatedPosts;

    User(String name, String password){
        this.name = name;
        this.password = password;
        this.associatedPosts = new ArrayList<>(); //Allocate memory for ArrayList
    }

    void setName(String newName)        { this.name = newName; }
    void setPassword(String newPass)    { this.password = newPass;}
    void setAuthStatus(boolean newAuth) { this.authStatus = newAuth; }

    String getName()                    { return name; }
    String getPassword()                { return password; }
    boolean getAuthStatus()             { return authStatus; }
    int getKarma() {
        updateKarma(); //Update before getting karma
        return totalKarma;
    }

    void addAssociatedPost(Post p)      { associatedPosts.add(p); }
    void displayAssociatedPosts()       { System.out.println(associatedPosts); }
    void updateKarma() {
        int karmaSum = 0;
        for (Post p : associatedPosts) {
            karmaSum += p.getKarma();
        }
        totalKarma = karmaSum;
    }

    int getPostKarmaState(int pid){
        KarmaPostSet post = kpSet.get(pid);
        return post.getUserKarmaState();
    }

    boolean checkPassword(String pwAttempt){
        if (pwAttempt.equals(this.password)) return true;
        else return false;
    }

    void deleteAccount(ArrayList list, int index){ list.remove(index); }
}

/**public class User {
    private String  name; //
    private String  password; // 
    private boolean authStatus; //

    public          User(String nm, String pwd) {
        name = nm;
        password = pwd;
    }

    public String   getName() {
        return name;
    }
    private String  getPassword() {
        return password;
    }
    public boolean  getAuthStatus() {
        return authStatus;
    }

    // private void    setName(String newName) {
    //     name = newName;
    // }
    // private void    setPassword(String newPass) {
    //     password = newPass;
    // }
    private void    setAuthStatus(boolean newAuth) { //
        authStatus = newAuth;
    }

    public boolean  checkPassword(String pwAttempt) {
        boolean passCorrect;

        if (pwAttempt == getPassword()) { passCorrect = true; }
        else                            { passCorrect = false; }

        setAuthStatus(passCorrect);
        return passCorrect;
    }
}**/
