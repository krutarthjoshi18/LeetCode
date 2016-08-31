package com.math.hard;

/**
 * Created by krutarthjoshi on 8/30/16.
 * LeetCode 296 - Best Meeting Point
 * A group of two or more people wants to meet and minimize the total travel distance.
 * You are given a 2D grid of values 0 or 1, where each 1 marks the home of someone in the group.
 * The distance is calculated using Manhattan Distance, where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
 * For example, given three people living at (0,0), (0,4), and (2,2):
 * 1 - 0 - 0 - 0 - 1
 * |   |   |   |   |
 * 0 - 0 - 0 - 0 - 0
 * |   |   |   |   |
 * 0 - 0 - 1 - 0 - 0
 * The point (0,2) is an ideal meeting point, as the total travel distance of 2+2+2=6 is minimal. So return 6.
 */
public class BestMeetingPoint {

    public static void main(String[] args) {
        BestMeetingPoint bmp = new BestMeetingPoint();
        int[][] grid = {{1, 0, 1, 0, 1}};
        System.out.println(bmp.minTotalDistance(grid));
    }

    private int minTotalDistance(int[][] grid) {
        int l = grid.length;
        int b = grid[0].length;
        int numPeople = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                numPeople += grid[i][j] == 1 ? 1 : 0;
            }
        }
        int[][] locations = new int[2][numPeople];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                if (grid[i][j] == 1) {
                    numPeople--;
                    locations[0][numPeople] = i;
                    locations[1][numPeople] = j;
                }
            }
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                int currDist = 0;
                for (int k = 0; k < locations[0].length; k++) {
                    currDist += Math.abs(i - locations[0][k]) + Math.abs(j - locations[1][k]);
                }
                minDist = Math.min(minDist, currDist);
            }
        }
        return minDist;
    }
}
