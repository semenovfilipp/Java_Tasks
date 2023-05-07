package Stepic.DoubleArray;
///Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m.
// Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] array = new int[n][m];

        for (int i = 0;i < m;i++){
            for (int j = n-1;j>=0;j--){
                array[j][i] = sc.nextInt();
            }
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
