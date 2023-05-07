package Stepic.Static;
//Напишите функцию simpleAB, которая принимает 2 натуральных числа a и b (a <= b)
// и анализирует все числа на промежутке от a до b включительно на их простоту.
// Она должна вывести на экран для каждого числа строку вида "{число} - {простое/составное/1}".
// Содержание функции main менять запрещено.

import java.math.BigInteger;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }

    private static void simpleAB(int x, int y) {
        for (int i = x;i <= y;i++){
            Integer integer = i;
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
            if (i == 1) {
                System.out.println(i + " - 1");
            }
            if (probablePrime & i!=1) {
                System.out.println(i + " - простое");
            }else if (!probablePrime & i!=1){
                System.out.println(i + " - составное");
            }
        }
    }
}

