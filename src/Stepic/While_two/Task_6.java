package Stepic.While_two;//Пользователь вводит натуральные числа по одному на каждой строке.
// Когда ему надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        while (x!=0){
            n+= x;
            x = sc.nextInt();
        }
        System.out.println(n);
    }
}
