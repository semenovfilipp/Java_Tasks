package Stepic.Static;
//Напишите функцию simple, которая принимает одно целое число и определяет,
// является ли число простым и выводит на экран ответ: "YES"/"NO".
// Содержание функции main менять запрещено.

import java.math.BigInteger;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);

    }

    public static void simple(int a) {
        Integer integer = a;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        if (a >= -1 && a <= 1) {
            System.out.println("NO");
        }else {
            System.out.println(probablePrime ? "YES" : "NO");
        }
    }
}

