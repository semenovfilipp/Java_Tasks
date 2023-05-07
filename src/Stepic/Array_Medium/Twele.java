package Stepic.Array_Medium;
///Вводится натуральное число n.
// На следующей строчке вводятся n целых чисел.
// Считайте их как массив на n элементов. на следующей строке вводятся два индекса: l и r.
// Найдите среднее арифметическое всех элементов с индексами от l до r включительно.
// Выведите в ответ одно действительное число.
// Гарантируется, что 0 <= l <= r < n.

import java.util.Scanner;

public class Twele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int sum = 0;
        int count = 0;

        for (int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();

        for (int i = l;i <= r;i++){
            sum+=a[i];
            count++;
        }
        System.out.println((double)sum/count);
    }
}
