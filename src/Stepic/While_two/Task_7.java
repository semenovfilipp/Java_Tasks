package Stepic.While_two;//Программа запрашивает два числа: n и x.
// Необходимо составить программу, которая будет прибавлять число x само к себе до тех пор,
// пока сумма не станет больше либо равна n. Выведите полученную сумму.

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int result = 0;
        while (result<n){
            result+=x;
        }
        System.out.println(result);
    }
}

/**
 * int i = x;
 *         while (n > i) {
 *             i = i + x;
 *         }
 *         System.out.println(i)
 */