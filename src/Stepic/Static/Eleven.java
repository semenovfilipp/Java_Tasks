package Stepic.Static;
//На вход вашей функции maximin даётся зубчатый двумерный массив (сначала даётся число
// n - количество строк, а потом сами строки).
// Найдите максимальное значение среди минимальных элементов каждой строки.
// Содержание функции main менять запрещено.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        maximin(mas);



    }

    private static void maximin(int[][] mas) {
        ArrayList <Integer> minValue = new ArrayList<>();
        for (int i = 0;i < mas.length;i++){
            for (int j = 0; j < mas[i].length;j++){
                int min = 0;
                if (mas[i][j] > min){
                    min+=mas[i][j];
                    minValue.add(min);
                }
            }
        }
        System.out.println(Collections.max(minValue));
    }
}
