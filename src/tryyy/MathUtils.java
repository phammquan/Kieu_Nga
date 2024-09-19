package tryyy;

import java.util.ArrayList;
import java.util.Random;

public class MathUtils {
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
        //Math.max(a,b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static int max(ArrayList<Integer> a) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max)
                max = a.get(i);
        }
        return max;
    }

    /**
     * @param a
     * @return
     */
    public static double max(double[] a) {
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(rand.nextInt(101));
        }
        double[] b = new double[10];
        for (int i = 0; i < 10; i++){
            b[i] = rand.nextDouble(11);
        }
        int x = rand.nextInt(101);
        int y = rand.nextInt(101);
        double n = rand.nextDouble(11);
        double m = rand.nextDouble(11);
        System.out.println("Max cua hai so nguyen la: " + max(x,y));
        System.out.println("Max cua hai so thuc la: " + max(n,m));
        System.out.println("Max cua mang so nguyen la: " + max(a));
        System.out.println("Max cua mang so thuc la: " + max(b));


    }
}
