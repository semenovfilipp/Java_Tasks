package Stepic.If_Else//Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения.
// Определите количество его корней.
// Вам достаточно вывести одно целое число - количество корней уравнения.
// Если корней бесконечно много, ты выведите строку "inf".
//Если вы не знаете, что такое квадратное уравнение, то вот вам ссылка. Если коротко, то вот:


import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        if (a == 0 && b != 0) {
            System.out.print(1);
        }
        else if (a == 0 && b == 0 && c != 0) {
            System.out.print(0);
        }
        else if (a == 0 && b == 0 && c == 0) {
            System.out.print("inf");
        }
        else if (a != 0 && d > 0) {
            System.out.print(2);
        }
        else if (a != 0 && d == 0) {
            System.out.print(1);
        }
        else if (a != 0 && d < 0) {
            System.out.print(0);
        }
    }
}

