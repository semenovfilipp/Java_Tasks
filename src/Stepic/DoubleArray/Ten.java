package Stepic.DoubleArray;
//Вводится натуральное число n.
// Затем вводится двумерный массив размером n*n.
// Отобразите его относительно главной диагонали
// (из левого верхнего угла до правого нижнего) и выведите на экран (через пробел).

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] array = new int[n][n];
        //
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                array [i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
