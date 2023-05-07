package Stepic.For.One;
///Последовательность состоит из натуральных чисел и завершается числом 0.
// Всего вводится не более 10000 чисел (не считая завершающего числа 0).
// Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//Числа, следующие за числом 0, считывать не нужно.

import java.util.Scanner;

public class HowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;

        for (int n = sc.nextInt(); n!=0; n = sc.nextInt()) {
            if (max < n) {
                max = n;
                count = 0;
            }
            if (max == n)
                count++;
        }
        System.out.println(count);
    }
}