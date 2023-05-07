package Stepic.DoubleArray;
//Главной диагональю в таблице (правильнее говорить матрице)
// называют диагональ, идущую из верхнего левого угла в нижний правый.
//Вводится число n. Выведите на экран матрицу размером n на n, у которой:
//все элементы главной диагонали равны 1
//все элементы, которые лежат ниже главной диагонали равны 2
//все элементы, которые лежат выше главной диагонали равны 0.
//Внутри строки между элементами должен находится пробел.

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] array = new int[n][n];

        for (int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i][j] = 1;
                    System.out.println();
                } else if (i < j) {
                    array[i][j] = 0;
                } else if (i > j) {
                    array[i][j] = 2;
                }
            }
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
