package Stepic.Static;
//Напишите функцию multiply, которая будет принимать в себя три целых числа и распечатывать на строке их произведение.
// Содержание функции main менять запрещено.

import java.util.Scanner;

public class Two {
    public static void multiply (int a, int b, int c){
        int n = (a*b*c);
        System.out.println(n);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        multiply(a, b, c);
    }



}
