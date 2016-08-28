package com.binarysearch.easy;

/**
 * Created by krutarthjoshi on 8/14/16.
 */
public class GuessGame {

    private int num;
    private int max;

    public GuessGame(int max, int num) {
        this.max = max;
        this.num = num;
    }

    public static void main(String[] args) {
        GuessGame gg = new GuessGame(8979, 4);
        System.out.println(gg.guessNumber(10));
    }

    private int guess(int n) {
        if (n > this.num) {
            return 1;
        }
        if (n < this.num) {
            return -1;
        }
        return 0;
    }

    private int guessNumber(int n) {
        int low = 0;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int target = guess(mid);
            if (target == 0) {
                return mid;
            }
            if (target == -1) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }
}
