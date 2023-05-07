package Stepic.If_Else//Вводятся два действительных числа: координаты точки на плоскости.
// Определите, принадлежит ли эта точка закрашенной области.
// Выведите ответ на задачу в формате "Yes"/"No".
///y*y + x*x=5  y = x*x -3   y=0.5*x-1

import java.util.Scanner;

public class Eleven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y*y + x*x < 5 & x*x-3 > y & y>0.5*x-1 ) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
