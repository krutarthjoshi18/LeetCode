import java.util.*;

/**
 * Created by krutarthjoshi on 6/21/16.
 */
public class SampleExperiment {


    public static void main(String[] args) throws InputMismatchException {
        SampleExperiment se = new SampleExperiment();
        /*int[] input = {19, 15, 18, 20, 5, 4, 5, 24, 1, 13, 16, 12, 5};
        String exp = "(16 / 3 + 5)";
        *//*System.out.println(se.expressionArithmetic(exp));
        se.heapSort(input);*//*
        System.out.println(se.sortedMapSample(420, "CharSoBees"));*/
        se.dequeExperiments();
    }

    private int expressionArithmetic(String exp) {
        Stack<Integer> vals = new Stack<>();
        Stack<Character> ops = new Stack<>();
        int i = 0;
        while (i < exp.length()) {
            char c = exp.charAt(i);
            if (c == ' ' || c == '(') {
                i++;
                continue;
            } else if (c == ')') {
                while (!vals.isEmpty() && !ops.isEmpty()) {
                    int val1 = vals.pop();
                    if (vals.isEmpty()) {
                        throw new IllegalArgumentException("Invalid Input");
                    }
                    int val2 = vals.pop();
                    char op = ops.pop();
                    if (op == '+') {
                        vals.push(val1 + val2);
                    } else if (op == '*') {
                        vals.push(val1 * val2);
                    } else if (op == '-') {
                        vals.push(val2 - val1);
                    } else {
                        vals.push(val2 / val1);
                    }
                }
            } else if (!(c - '0' >= 0 && c - '0' <= 9)) {
                ops.push(c);
            } else {
                StringBuilder sb = new StringBuilder();
                while (c - '0' >= 0 && c - '0' <= 9) {
                    sb.append(c);
                    vals.push(Integer.valueOf(sb.toString()));
                    i++;
                    c = exp.charAt(i);
                }
                continue;
            }
            i++;
        }
        return vals.peek();
    }

    private void heapSort(int[] nums) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(4);
        for (int num : nums) {
            if (pq1.size() < (nums.length - 4 + 1)) {
                pq1.offer(num);
            } else {
                if (pq1.peek() > num) {
                    pq1.poll();
                    pq1.offer(num);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            result.add(pq1.poll());
        }
        System.out.println(result);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq2.offer(num);
            if (pq2.size() > 4) {
                pq2.poll();
            }
        }
        System.out.println(pq2);
    }

    private void dequeExperiments() {
        Deque<Integer> queue = new ArrayDeque<>(1);
        /*for (int i = 0; i < 5; i++) {
            System.out.println(queue.remove());
        }*/

        Deque<Integer> q = new ArrayDeque<>(1);
        for (int i = 0; i < 5; i++) {
            System.out.println(q.poll());
        }
    }

    private String sortedMapSample(int key, String val) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(key, val);
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(99, "Ninty Nine");
        map.put(1, "One");

        System.out.println(map);
        return map.get(map.lastKey());
    }
}