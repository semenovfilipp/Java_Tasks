package Stepic.Basic_types;///ВАЛЛ-И называет натуральное число, а ЕВА записывает 3 последовательных числа, следующих после него.
// Напишите программу, которая выводит числа  ЕВЫ через черточку.

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = ++x;
        System.out.println(result + "-" + ++result + "-" + ++result);
    }
}
