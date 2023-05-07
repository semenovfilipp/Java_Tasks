package Stepic.While_one;//По данному натуральному n вычислите сумму 12+22+...+n2.

import java.util.Scanner;

public class SummSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int summ = 0;
        while (i <= n){
            summ += (i*i);
            i++;
        }
        System.out.println(summ);
    }
}
