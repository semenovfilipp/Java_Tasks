package Stepic.Array_Medium;
///Вводится натуральное число n (n > 1).
// На следующей строчке вводятся n целых чисел.
// Считайте их как массив на n элементов.
// Найдите количество элементов, которые больше предыдущего элемента.

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i--] > array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
