import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by krutarthjoshi on 6/21/16.
 */
public class SampleExperiment {

    public static void main(String[] args) {
        SampleExperiment se = new SampleExperiment();
//        System.out.println(se.result(19, 19));
        System.out.println(5 ^ 3);
    }

    private int result(int m, int n) {
        int num = m + n - 2;
        int den = n - 1;
        double maxPaths = 1;
        for (int i = 1; i <= n - 1; i++) {
            maxPaths = maxPaths * ((double) (num - den + i) / (double) i);
        }
        return (int) Math.round(maxPaths);
    }
}