package src;

import java.util.ArrayList;

import com.example.redditclone.AccountController;

public class LoggedInUserSingleton extends User {

    public LoggedInUserSingleton(String name, String password){
        super(name, password);
    }

    private static volatile LoggedInUserSingleton instance = null;
    public static LoggedInUserSingleton getInstance()
    {
        if (instance == null) {
            synchronized (LoggedInUserSingleton.class) {
                if (instance == null) {
                    instance = new LoggedInUserSingleton("", "");
                }
            }
        }
        return instance;
    }
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
