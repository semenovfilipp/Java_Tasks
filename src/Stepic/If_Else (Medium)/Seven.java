package Stepic.If_Else//Вводятся два действительных числа: координаты точки на плоскости.
// Определите, принадлежит ли эта точка закрашенной области.
// Выведите ответ на задачу в формате "Yes"/"No".
//Функция y=2*x


import java.util.Scanner;

public class Seven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.print(x*2>=y ? "No" : "Yes");

    }
}