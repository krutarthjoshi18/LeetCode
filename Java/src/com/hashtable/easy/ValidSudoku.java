package com.hashtable.easy;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 9/25/16.
 * LeetCode 36 - Valid Sudoku
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 */
public class ValidSudoku {

    public static void main(String[] args) {
        ValidSudoku vs = new ValidSudoku();
        char[][] board = {};
        System.out.println(vs.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {

        //Check for row and column
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, 0, i, 9)) {
                return false;
            }
            if (!isValid(board, 0, i, 9, i)) {
                return false;
            }
        }

        //Check for mini sudoku
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValid(board, i * 3, j * 3, (i * 3) + 3, (j * 3) + 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int starti, int startj, int stopi, int stopj) {
        Set<Character> isValidChar = new HashSet<>();
        boolean[] isValid = new boolean[9];
        for (int i = starti; i < stopi; i++) {
            for (int j = startj; j < stopj; j++) {
                if (board[i][j] != '.') {
                    if (isValid[board[i][j] - '1']) {
                        return false;
                    }
                    isValid[board[i][j] - '1'] = true;
/*
                        if (!isValidChar.add(board[i][j])) {
                            return false;
                        }
*/
                }
            }
        }
        return true;
    }
}
