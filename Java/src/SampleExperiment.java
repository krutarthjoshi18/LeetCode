import java.util.*;

/**
 * Created by krutarthjoshi on 6/21/16.
 */
public class SampleExperiment {

    public static void main(String[] args) throws InputMismatchException {
        SampleExperiment se = new SampleExperiment();
        System.out.println(se.convertToTitle(987));
        int[] input = {1, 2, 4};
        System.out.println(Arrays.binarySearch(input, 3));
    }

    public String convertToTitle(int n) {
        Queue<Integer> q = new LinkedList<>();
        while (!q.isEmpty()) {

        }
        q.poll();
        int base = (int) (Math.log(n) / Math.log(26));
        int div = (int) Math.pow(26, base);
        StringBuilder sb = new StringBuilder();
        while (div > 1) {
            char c = (char) (n / div + 64);
            sb.append(c);
            n %= div;
            div /= 26;
        }
        sb.append((char) (n + 64));
        System.out.println(sb);
        return sb.toString();
    }
}