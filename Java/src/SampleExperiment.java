import java.util.*;

/**
 * Created by krutarthjoshi on 6/21/16.
 */
public class SampleExperiment {

    public static void main(String[] args) {
        SampleExperiment se = new SampleExperiment();
        int[] balloons = {2, 100, 42, 21};
        System.out.println(se.sum(balloons));
    }

    private void checkingContinue(int[] A) {
        for (int i = 0; i < 10; i++) {
            if (A[i] % 10 == 0) {
                continue;
            }
            System.out.println(A[i]);
        }
    }

    private int sum(int[] balloons) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        for (int i : balloons) {
            list.add(i);
        }
        list.add(-1);
        int sum = 0;
        Arrays.sort(balloons);
        int i = 0;
        while (i < balloons.length || list.size() < 3) {
            int num = balloons[i];
            if (list.size() > 5 && (list.indexOf(num) == 1 || list.indexOf(num) == list.size() - 2)) {
                i++;
                continue;
            }
            if (list.size() > 5) {
                int index = list.indexOf(num);
                sum += list.get(index - 1) * num * list.get(index + 1);
                list.remove(index);
            } else {
                if (list.size() == 5) {
                    sum += list.get(1) * list.get(2) * list.get(3);
                    list.remove(2);
                } else {
                    if (list.size() == 4) {
                        int index = list.get(1) > list.get(2) ? 2 : 1;
                        int temp = -1 * list.get(index - 1) * list.get(index) * list.get(index + 1);
                        sum += temp;
                        list.remove(index);
                    } else {
                        sum += list.get(0) * list.get(1) * list.get(2);
                        list.remove(1);
                    }
                }
            }
            i++;
        }
        return sum;
    }
}