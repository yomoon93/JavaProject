public class Player1 {
    private String name;
    private int score;
    private int totScore;
    private int timesPlayed;

    public Player1(String name, int score, int totScore) {
        this(name,0,0,0);
    }

    public Player1(String name, int score, int totScore, int timesPlayed) {
        this.name = name;
        this.score = score;
        this.totScore = totScore;
        this.timesPlayed = timesPlayed;
    }

    public Player1(String name) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotScore() {
        return totScore;
    }

    public void setTotScore(int totScore) {
        this.totScore = totScore;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public void setTimesPlayed(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }

    @Override
    public String toString() {
        return "Player1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", totScore=" + totScore +
                ", timesPlayed=" + timesPlayed +
                '}';
    }
}
