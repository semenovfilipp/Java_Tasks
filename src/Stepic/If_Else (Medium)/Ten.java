package Stepic.If_Else//Вводятся два действительных числа: координаты точки на плоскости.
// Определите, принадлежит ли эта точка закрашенной области.
// Выведите ответ на задачу в формате "Yes"/"No".
//y*y + x*x=5    y = x*x -3

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y*y + x*x < 5 & x*x-3 > y) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
