package Stepic.DoubleArray;
//Напишите программу, которая проверяет, является ли квадратная матрица магическим квадратом?
//Входные данные
//Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве.
// Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array [][] = new int[n][n];
        boolean isMagic = true;
        ///наполнение
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                array[i][j] = sc.nextInt();
            }
        }
        ///сумма для сравнения
        int magicSum = 0;
        for (int i = 0;i < n;i++){
            magicSum += array[i][0];
        }
        //сумма строк
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += array[i][j];
            if (sum != magicSum){
                isMagic = false;
            }
        }
        //сумма столбцов
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += array[i][j];
            if (sum != magicSum) {
                isMagic = false;
            }
        }
        //сумма главной диагонали
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += array[i][i];
        if (sum != magicSum){
            isMagic = false;
        //сумма побочной диагонали
        sum = 0;
        for (int i = 0; i < n; i++)
            sum += array[i][n - i - 1];
        if (sum != magicSum) {
            isMagic = false;
            }
        }
        System.out.println(isMagic == true ? "YES" : "NO");
    }
}
