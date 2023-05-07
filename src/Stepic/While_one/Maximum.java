package Stepic.While_one;///Последовательность состоит из различных натуральных чисел и завершается числом 0.
// Определите значение максимального элемента в этой последовательности.
//Числа, следующие за числом 0, считывать не нужно.

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = 0;
        while (x!=0){
            if (x>max){
                max = x;
            }
            x = sc.nextInt();
        }
        System.out.println(max);
    }
}
