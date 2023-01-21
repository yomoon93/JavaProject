public class ForumUser {

    private static int totalUsers = 1;
   private int userID;
    private String username;

    public ForumUser(String userName){
        this.username = userName;
        this.userID = totalUsers++;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                '}';
    }
}
