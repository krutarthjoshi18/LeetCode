package com.array.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 8/2/16.
 */
public class CombinationSumIII {

    public static void main(String[] args) {
        CombinationSumIII csiii = new CombinationSumIII();
        System.out.println(csiii.choduCode(8, 44));
    }

    private List<List<Integer>> choduCode(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        return combinationSum3(result, new ArrayList<>(), k, n, 1, 0);
    }

    private List<List<Integer>> combinationSum3(List<List<Integer>> result,
                                                List<Integer> temp, int k, int n, int indx, int currSum) {

        if (temp.size() == k) {
            if (currSum == n)
                result.add(temp);
            return result;
        }
        for (int i = indx; i < 10; i++) {

            List<Integer> curList = new ArrayList<>(temp);
            curList.add(i);
            if (currSum > n) break;
            combinationSum3(result, curList, k, n, i + 1, currSum + i);
        }

        return result;
    }
}
