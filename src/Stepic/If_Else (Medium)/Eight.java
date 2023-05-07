package Stepic.If_Else//Вводятся два действительных числа: координаты точки на плоскости.
// Определите, принадлежит ли эта точка закрашенной области.
// Выведите ответ на задачу в формате "Yes"/"No".
//Функция y=3x   y=2x

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y =sc.nextDouble();
        if ((3*x>y) && (2*x<y)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
