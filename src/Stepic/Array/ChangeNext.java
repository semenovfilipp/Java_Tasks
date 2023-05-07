package Stepic.Array;
//Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.).
// Если элементов нечетное число, то последний элемент остается на своем месте.

import java.util.Scanner;

public class ChangeNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        int a;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0 && i != n - 1) {
                a = mass[i];
                mass[i] = mass[i+1];
                mass[i+1] = a;
            }
        }

        for (int i = 0;i < mass.length;i++){
            System.out.println(mass[i]);
        }
    }
}
