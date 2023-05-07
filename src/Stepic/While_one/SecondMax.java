package Stepic.While_one;///Последовательность состоит из различных натуральных чисел и завершается числом 0.
// Определите значение второго по величине элемента в этой последовательности.
//Числа, следующие за числом 0, считывать не нужно.
//Входные данные
//Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит). Гарантируется, что будет введено хотя бы 2 числа.

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max1 = x;
        int max2 = 0;
        while (x != 0) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            }else if (x>max2 & x<max1) {
                max2 = x;
            }
            x = sc.nextInt();
        }
        System.out.println(max2);
    }
}
