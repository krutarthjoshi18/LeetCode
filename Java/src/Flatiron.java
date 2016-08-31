import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by krutarthjoshi on 8/29/16.
 * 5 min - 3 cents per sec
 * > 5 min - 150 cents per min
 */
public class Flatiron {

    public static void main(String[] args) {
        Flatiron fn = new Flatiron();
        String s = "01:02:03,123-456-789\n" +
                "03:04:05, 123-456-789\n" +
                "04:03:05, 321-456-789\n";
        System.out.println(s);
        System.out.println(fn.totalCost(s));
        System.out.println(Arrays.toString(fn.dist(new int[]{9, 1, 4, 9, 0, 4, 8, 9, 0, 1})));
    }

    private int totalCost(String s) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        String[] input = s.split("\\n");
        return 0;

    }

    private int generatePrice(String s) {
        String[] hms = s.split(":");
        if (Integer.valueOf(hms[0]) == 0 && Integer.valueOf(hms[1]) < 5) {
            return (Integer.valueOf(hms[1]) * 60 + Integer.valueOf(hms[2])) * 3;
        }
        int addedCost = Integer.valueOf(hms[2]) > 0 ? 1 : 0;
        return (Integer.valueOf(hms[0]) * 60 + Integer.valueOf(hms[1]) + addedCost) * 150;
    }

    private int totalTime(String s) {
        String[] hms = s.split(":");
        return Integer.valueOf(hms[0]) * 3600 + Integer.valueOf(hms[1]) * 60 + Integer.valueOf(hms[2]);
    }

    private int[] dist(int[] in) {
        int l = in.length;
        int[] output = new int[l];
        int capital = 0;
        for (int i = 0; i < l; i++) {
            if (i == in[i]) {
                capital = i;
                break;
            }
        }
        for (int i = 0; i < l; i++) {
            int count = i == capital ? 0 : 1;
            int[] temp = in.clone();
            while (temp[i] != capital) {
                temp[i] = temp[temp[i]];
                count++;
            }
            output[count]++;
        }
        return output;
    }
}