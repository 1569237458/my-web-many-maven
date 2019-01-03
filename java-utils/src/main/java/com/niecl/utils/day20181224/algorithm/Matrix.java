package com.niecl.utils.day20181224.algorithm;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 9:13
 * 输入一个矩阵，按照从里到外顺时针的顺序打印每个数字
 */
public class Matrix {

    public static void main(String... args) {
        int[][] num = new int[100][100];

        int n = 6;
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = count++;
            }
        }
        forEa();
        outPut(num, 0, n - 1);
    }

    public static void forEa() {
        for (int i = 1; i <= 36; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0) {
                System.out.println(" ");
            }
        }
    }

    public static void outPut(int[][] num, int start, int end) {
        if (start > end || end <= 0) return;

        for (int i = start; i <= end; i++) {
            System.out.print(num[start][i] + ",");
        }

        for (int i = start + 1; i <= end; i++) {
            System.out.print(num[i][end] + ",");
        }

        for (int i = end - 1; i >= start; i--) {
            System.out.print(num[end][i] + ",");
        }

        for (int i = end - 1; i > start; i--) {
            System.out.print(num[i][start] + ",");
        }
        outPut(num, start + 1, end - 1);

    }


}
