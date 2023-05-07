package Stepic.While_one;//Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N.

import java.util.Scanner;

public class SummNature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int summ = 0;
        while (n%10!=0){
            summ +=n%10;
            n = n/10;
        }
        System.out.println(summ);
    }
}


/**
 * Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt();
 *         int summ = 0;
 *         while (n>0){
 *             summ +=n%10;
 *             n = n/10;
 *         }
 *         System.out.println(summ);
 */