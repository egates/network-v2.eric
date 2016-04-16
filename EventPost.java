/**
 * This class stores information about an Event type news feed post in a 
 * social network. Posts can be stored and displayed. 
 * It inherits from the Post superclass
 * 
 * @author Eric Gates
 * @version 0.1
 */
public class EventPost extends Post
{
    private String eventType;  //this was in the book - not sure what to do with it yet
    
    /**
     * Constructor for objects of class Post.
     * 
     * @param author    The username of the author of this post.
     */
    public EventPost(String author)
    {
        //initialize the EventPost and use "System" as the author
        //as these are system generated Posts
        super(author);
        eventType = "";
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
    */
    public void display()
    {
        System.out.println(getUserName() + " did something");
        System.out.print(getTimeString(getTimeStamp()));
        
        
    }
  }
