package Stepic.Array;
////Вводится число n, затем n чисел целых, по одному на каждой строке.
// Затем вводится число, на которое нужно умножить все введённые выше числа.
// Выведите на экран результат умножения построчно.

import java.util.Scanner;

public class SimpleMassive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];


        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        int prod = sc.nextInt();
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i] *= prod);
        }
    }
}
