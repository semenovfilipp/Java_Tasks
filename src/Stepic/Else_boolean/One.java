package Stepic.Else_boolean;///Напишите программу, которая по введённым времени и скорости найдёт пройденный путь.
// Сначала вводится время движения, затем скорость.

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println(v*t);



    }
}