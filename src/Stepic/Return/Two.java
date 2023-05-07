package Stepic.Return;
//Напишите функцию arhimed, которая принимает на вход 2 натуральных числа: плотность жидкости (кг/м^3),
// в которую погружают тело и объём тела (м^3). Функция должна именно вернуть значение силы Архимеда.
// Считать g = 10 H/кг. Содержание функции main менять запрещено.

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F +"H");
    }

    private static int arhimed(int ro, int v) {
        return ro * v * 10;
    }
}
