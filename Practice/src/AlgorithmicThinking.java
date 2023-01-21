import java.util.Arrays;

public class AlgorithmicThinking {
    public static void main(String[] args) {
        Player[] playerList = {
                new Player("Kevin", 29),
                new Player("Alice", 50),
                new Player("Carol", 30),
                new Player("Dave", 45)
        };
//        System.out.println(linearSearch(playerList,"Dave"));
        System.out.println(Arrays.toString(bubbleSort(playerList)));
    }


    public static Player linearSearch(Player[] playerList, String toFind) {
        // for in the colon lets us go through each
        for (Player p : playerList) {
            if (p.name().equals(toFind)) {
                return p;
            }
        }
        return null;
    }


    public static Player[] bubbleSort(Player[] playerList) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < playerList.length - 1; i++) {
                if (playerList[i].age() > playerList[i + 1].age()) {
                    Player temp = playerList[i];
                    playerList[i] = playerList[i + 1];
                    playerList[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
        return playerList;
    }
}


record Player(String name, int age){}
