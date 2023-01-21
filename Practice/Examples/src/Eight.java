import java.util.Arrays;

public class Eight {
    // Eight: and finally...
    public static void main(String[] args) {
        double[] myDoubles = new double[]{1.25, 5.3, 3.99, 8.1, 2.2};
        System.out.println(Arrays.toString(x(myDoubles)));
    }

    public static double[] x(double[] lst) {
        for (int i = 0; i < lst.length; i++) {
            double temp = lst[i];
            lst[i] = lst[lst.length-i-1];
            lst[lst.length-i-1] = temp;
        }
        return lst;
    }
}