package Stepic.While_one;//Последовательность состоит из натуральных чисел и завершается числом 0.
// Определите, сколько элементов этой последовательности больше предыдущего элемента. Гарантируется ввод хотя бы двух ненулевых чисел.
//
//Числа, следующие за числом 0, считывать не нужно.

import java.util.Scanner;

public class NumBigPrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        int max = 0;
        max = x;
        while (x!=0){
            if (x>max) {
                n++;

            }
            x = sc.nextInt();
        }
        System.out.println(n);
    }
}
