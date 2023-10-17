// Hello World Template
// FileName : "HelloWorld.java". 
  
public class Runner { 
    public static void main(String args[]) 
    { 
        //Test code for compilation testing purposes
        User nerd = new User("vsawce", "123");
        Post p = new Post(nerd, "r/tifu blah blah blah");
        System.out.println("----------------");
        System.out.println("Username: " + p.getUser().getName());
        System.out.println("Date: " + p.getDate());
        System.out.println("Post Id: " + p.getPostId());
        System.out.println("\n"+p.getTextPostContents());
        System.out.println("----------------");


    } 
}