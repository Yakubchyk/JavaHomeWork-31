package com.JavaHomeWork31;

import java.util.*;

public class ListCollection implements Iterable<Integer> {

    private final int matrix[][] = new int[5][5];

    public void add(int value, int row, int col) {
        matrix[row][col] = value;

    }

    public int get(int row, int col) {
        return matrix[row][col];

    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void remove(int row, int col) {
        matrix[row][col] = 0;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Integer> {

        int row = 0;
        int col = 0;

        @Override
        public boolean hasNext() {
            if (row < matrix.length && col < matrix[row].length) {
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            int element = matrix[row][col++];
            if (col >= matrix[row].length) {
                col = 0;
                row++;

            }

            return element;
        }
    }
}
