package Stepic.For.Two;
//Дано натуральное число. Найдите произведение его цифр.

import java.util.Scanner;

public class ProdThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;

        while (n!=0) {
            prod *= (n % 10);
            n/=10;
        }
        System.out.println(prod);
    }
}
