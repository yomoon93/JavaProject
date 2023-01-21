public class Post {
   private ForumUser postUser;
    private String postMessage;

  public Post(ForumUser postUser, String postMessage){
      this.postUser = postUser;
      this.postMessage = postMessage;
  }

    public ForumUser getPostUser() {
        return postUser;
    }

    public String getPostMessage() {
        return postMessage;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postUser=" + postUser +
                ", postMessage='" + postMessage + '\'' +
                '}';
    }
}
