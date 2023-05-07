package Stepic.DoubleArray;
///Дан зубчатый двумерный массив. необходимо определить номер строки с максимальной суммой,
// максимальную сумму и саму строку, которая даёт эту сумму.

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int lineLength = 0; // какой длины будет строка
        int sumLine = 0;  // сумма каждой строки массива
        int maxSum = Integer.MIN_VALUE;   // для сравнения
        int indMaxSum = 0;              // индекс строки с макс суммой

        for (int i = 0; i < n; i++) {
            lineLength = sc.nextInt();  // считываем длину массива-строки
            arr[i] = new int[lineLength];  // создаем массив-строку
            //заполняем массив-строку
            for (int j = 0; j < lineLength; j++) {
                arr[i][j] = sc.nextInt();
                sumLine += arr[i][j]; // сразу считаем сумму элементов в этой строке
            } // end for line
            //закончив массив-строку, делаем сравнения
            if (sumLine > maxSum) {
                maxSum = sumLine;
                indMaxSum = i;
            } // end if блока сравнения
            sumLine = 0; // сумму строки надо обнулить-подготовить для следующей строки- массива
        } // end for create full array

        System.out.println(indMaxSum + 1);
        System.out.println(maxSum);
        // выводим массив-строку с макс суммой
        for (int item : arr[indMaxSum]) {
            System.out.print(item);
            System.out.print(" ");
        } // end for

    }// end main
} // end class
