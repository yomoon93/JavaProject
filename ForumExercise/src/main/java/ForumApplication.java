public class ForumApplication {

    public static void main(String[] args) {

    ForumUser firstUser = new ForumUser("elevate");
        System.out.println(firstUser);
        Thread thread1 = new Thread(firstUser,"Java Facts");
        System.out.println(thread1);
        Post post1 = new Post(firstUser,"This thread is for Java facts.");
        Post post2 = new Post(firstUser,"Originally named oak");
        Post post3 = new Post(firstUser,"The Creator of java is James Gosling");
        Post post4 = new Post(firstUser,"Java got created when the team was working on a set-up box by cleaning up C++, and ended up creating java.");
        Post post5 = new Post(firstUser,"Java is the most popular programming language after C.");
        System.out.println(post1);
        thread1.addPost(post1);
        thread1.deletePost(post1);
        thread1.addPost(post2);
        thread1.addPost(post3);
        thread1.addPost(post4);
        thread1.addPost(post5);
        System.out.println(thread1);
        System.out.println(thread1.countPosts());
        System.out.println(thread1.countCharacters());
    }

}
