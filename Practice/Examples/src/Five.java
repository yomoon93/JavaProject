public class Five {
    // Five: For and If
    public static void main(String[] args) {
        int[] myInts = {5, -2, 8, 9, 1, 5, -3, 2, -11};
        for (int num : myInts) {
            if (num % 2 == 0){
                System.out.println("Even: "+num);
            } else if (num < 0) {
                System.out.println("Negative: "+num);
            }
        }
    }
}