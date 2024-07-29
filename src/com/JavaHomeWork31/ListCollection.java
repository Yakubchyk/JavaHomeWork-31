package com.JavaHomeWork31;

import java.util.*;

public class ListCollection implements Iterable<Integer> {

    private final int[][] matrix = new int[5][5];

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

//        int row = 0;
//        int col = 0;
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < matrix.length * matrix[0].length; // смотрит чтобы значение курсора было меньше чем матрица


//            if (row < matrix.length && col < matrix[row].length) {
//                return true;
//            }
        }

        @Override
        public Integer next() {

            int element;
            element = matrix[cursor / matrix[0].length][cursor % matrix[0].length];// вычисляет индекс строки и столбца
            cursor++;

            return element;
        }
    }
}
