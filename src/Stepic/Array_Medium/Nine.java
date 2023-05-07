package Stepic.Array_Medium;
///Вводится натуральное число n.
// На следующей строчке вводятся n целых чисел.
// Считайте их как массив на n элементов. Затем вводится число k.
// Найдите индекс элемента k.
// Если такого элемента нет в массиве, выведите на экран слово Error.

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (k == a[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Error");
    }
}
