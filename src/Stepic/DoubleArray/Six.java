package Stepic.DoubleArray;
///Сначала вводятся два натуральных числа n и m -
// количество строки и столбцов в двумерном массиве.
// Затем вводится сами элементы массива.
// Определите индексы минимального элемента этого двумерного массива.
// Гарантируется, что такой элемент единственный.
// Выведите в качестве ответа два целых числа через пробел.

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        int mini = 0;
        int minj = 0;


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] < array[mini][minj]){
                    mini = i;
                    minj = j;
                }
            }
        }
        System.out.println(mini + " " + minj);

    }
}
