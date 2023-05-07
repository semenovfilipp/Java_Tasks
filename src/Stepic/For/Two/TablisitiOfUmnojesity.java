package Stepic.For.Two;

///Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.
//Входные данные
//Задано натуральное число n.
//Выходные данные
//Выведите ответ на задачу.

import java.util.Scanner;

public class TablisitiOfUmnojesity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i<=9;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
