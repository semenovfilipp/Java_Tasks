package Stepic.If_Else

import java.util.Scanner;

//Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения (a != 0).
// Определите количество его корней.
// Вам достаточно вывести одно целое число - количество корней квадратного уравнения.
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b * b) - 4 * a * c;
        if (d < 0) {
            System.out.println(0);
        } else if (d == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
