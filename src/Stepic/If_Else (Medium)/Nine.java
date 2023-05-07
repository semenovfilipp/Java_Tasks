package Stepic.If_Else///Вводятся два действительных числа: координаты точки на плоскости.
// Определите, принадлежит ли эта точка закрашенной области.
// Выведите ответ на задачу в формате "Yes"/"No".
//Функция y=x/2   y=(x*x)-2x-3

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x * x - 2 * x - 3 < y & (x / 2) > y) {
            System.out.println("Yes");
        }else {
            System.out.println("No");

        }
    }
}
