package org.example.task16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Matrix {
    private int[][] data;

    public Matrix add(Matrix other) {
        int rows = this.data.length;
        int cols = this.data[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        int rows = this.data.length;
        int cols = other.data[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < this.data[0].length; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }
}
