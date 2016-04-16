import java.util.ArrayList;

/**
 * This class stores information about a commented news feed post in a 
 * social network. Posts can be stored and displayed. This class
 * serves as a superclass for more specific post types that require comments.
 * It inherits from the Post superclass
 * 
 * @author Eric Gates
 * @version 0.1
 */
public class CommentedPost extends Post
{
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class Post.
     * 
     * @param author    The username of the author of this post.
     */
    public CommentedPost(String author)
    {
        super(author);
        likes = 0;
        comments = new ArrayList<String>();
    }

    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
        System.out.println(getUserName());
        System.out.print(getTimeString(getTimeStamp()));
        
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else {
            System.out.println("   " + comments.size() + " comment(s). Click here to view.");
        }
    }

  }
