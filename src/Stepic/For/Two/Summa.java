package Stepic.For.Two;
///Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.
//Входные данные
//Задано натуральное число n
//Выходные данные
//Выведите единственное число - ответ на задачу.

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0;i<=n;i++){
            count+=i;
        }
        System.out.println(count);
    }
}
