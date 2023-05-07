package Stepic.Array_Medium;
///Вводится натуральное число n.
// На следующей строчке вводятся n целых чисел.
// Считайте их как массив на n элементов.
// Затем вводится число k.
// Найдите количество элементов в массиве равных k.

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int count = 0;

        for (int i = 0;i < a.length;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0;i < a.length;i++){
            if (k == a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
