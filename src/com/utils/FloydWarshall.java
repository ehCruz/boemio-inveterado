package com.utils;

public class FloydWarshall {

    public static void floydWarshall(Double[][] grafo) {
        Double[][] dest = grafo;
        Double[][] seq = new Double[dest.length][dest.length];

        for (int i = 0; i < dest.length; i++) {
            for (int j = 0; j < dest.length; j++) {
                seq[i][j] = i + 1.0;
            }
        }

        for (int k = 0; k < dest.length; k++) {
            for (int i = 0; i < dest.length; i++) {
                for (int j = 0; j < dest.length; j++) {
                    if (dest[i][j] > (dest[i][k] + dest[k][j])) {
                        dest[i][j] = dest[i][k] + dest[k][j];
                        seq[i][j] = seq[k][j];
                    }
                }
            }
        }
        exibirRotas(dest);
    }

    public static void exibirRotas(Double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i != j)
                    System.out.printf("%.3f ", matrix[i][j]);
                else
                    System.out.printf("  %s   ", "-");
            }
            System.out.println();
        }
    }
}
