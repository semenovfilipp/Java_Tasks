package Stepic.While_two;//Вводятся два целых числа a и b.
// Выведите на экран все числа от a до b включительно.

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > 0) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= b) {
                System.out.println(a);
                a--;
            }
        }
    }
}