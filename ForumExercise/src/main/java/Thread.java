import java.util.ArrayList;
import java.util.List;

public class Thread {
    private String threadTitle;
    private ForumUser threadUser;
    private List<Post> threadPost;




    public Thread(ForumUser threadUser, String threadTitle){
        this.threadUser = threadUser;
        this.threadTitle = threadTitle;
        this.threadPost = new ArrayList<>();
    }
    public Thread(ForumUser threadUser){
        this(threadUser,"untitled");
    }
//    public Thread(){this(new ArrayList<Post>());}

    public String getThreadTitle() {
        return threadTitle;
    }

    public ForumUser getThreadUser() {
        return threadUser;
    }

    public List<Post> getThreadPost() {
        return threadPost;
    }

    public void addPost(Post post){
        this.threadPost.add(post);

    }
    public void deletePost(Post post){
        this.threadPost.remove(post);

    }

    public int countPosts(){
        int counter = 0;
        for(Post c : threadPost){
            counter++;
        }
        return counter;
    }

    public int countCharacters(){
        int count=0;
        for (Post c : threadPost){
            count += c.getPostMessage().length();
        }
        return count;
    }

    @Override
    public String toString() {
        return "Thread{" +
                "threadTitle='" + threadTitle + '\'' +
                ", threadUser=" + threadUser +
                ", threadPost=" + threadPost +
                '}';
    }
}
