package com.array.easy;

/**
 * Created by krutarthjoshi on 12/6/16.
 */
public class ShortestWordDistance {

    public static void main(String[] args) {
        ShortestWordDistance distance = new ShortestWordDistance();
        String[] input = {"a", "b"};
        System.out.println(distance.shortestDistance(input, "b", "a"));
    }

    private int shortestDistance(String[] words, String word1, String word2) {
        if (words == null || word1 == null || word2 == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = words.length;
        int ind1 = -l;
        int ind2 = l;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            if (word1.equals(words[i])) {
                ind1 = i;
            }
            if (word2.equals(words[i])) {
                ind2 = i;
            }
            minDistance = Math.min(Math.abs(ind1 - ind2), minDistance);
        }
        minDistance = Math.min(Math.abs(ind1 - ind2), minDistance);
        return minDistance;
    }
}
