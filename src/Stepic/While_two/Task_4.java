package Stepic.While_two;//Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100).
// Выведите на экран построчно все числа кратные k от 1 до n включительно.

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            if (count % k == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}