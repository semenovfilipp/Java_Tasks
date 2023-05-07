package Stepic.DoubleArray;
///Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
// Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
