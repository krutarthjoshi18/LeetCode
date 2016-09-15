import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by krutarthjoshi on 6/21/16.
 */
public class SampleExperiment {

    public static void main(String[] args) {
        SampleExperiment se = new SampleExperiment();
        int[] balloons = {2, 100, 42, 21};
        ArrayList<String> lexicograph = new ArrayList<>();
        for (int i = 1; i <= 49999; i++) {
            lexicograph.add(Integer.toString(i));
        }
        Collections.sort(lexicograph);
        ArrayList<Integer> result = new ArrayList<>();
        for (String curr : lexicograph) {
            result.add(Integer.valueOf(curr));
        }
        System.out.println(result);
        se.sample();
    }

    private void sample() {

    }
}