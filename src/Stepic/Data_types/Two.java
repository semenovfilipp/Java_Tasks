package Stepic.Data_types;///Напишите программу, которая считывает три целых числа и выводит их произведение.

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a * b * c);
        }
    }
}