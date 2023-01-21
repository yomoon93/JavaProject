import java.util.Random;

public class MyRandom {

    private Random rand = new Random();

    public int nextInt(int bound) {
        return rand.nextInt(bound);
    }
}