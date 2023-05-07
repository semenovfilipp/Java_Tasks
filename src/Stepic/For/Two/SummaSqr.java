package Stepic.For.Two;

///Напишите программу, которая находит сумму квадратов натуральных чисел от 1 до n, где n вводится с клавиатуры.
//Входные данные
//Задано натуральное число n
//Выходные данные
//Выведите единственное число - ответ на задачу.

import java.util.Scanner;

public class SummaSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0;i<=n;i++){
            count+= Math.pow(i,2);
        }
        System.out.println(count);
    }
}
