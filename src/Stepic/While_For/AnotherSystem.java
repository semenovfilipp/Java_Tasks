package Stepic.While_For;//Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.
// Переведите число n из десятичной системы счисления в систему счисления с основанием k.

import java.util.Scanner;

public class AnotherSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String count = "";

            for (int i = n; i >= 1; i /= k) {
                count = (i % k) + count;
            }
            System.out.println(count);
            if (n==0){
                System.out.println(n);
        }
    }
}
