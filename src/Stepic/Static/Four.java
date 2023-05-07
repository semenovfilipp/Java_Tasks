package Stepic.Static;
//Площадь треугольника можно вычислить по формуле Герона.
// Напишите функцию geron, которая по трём действительным числам находит площадь треугольника и выводит её на экран.
// Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует".
// Содержимое функции main менять запрещено.

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }
    public static void geron (double s1, double s2, double s3) {
        double p = (s1 + s2 + s3) / 2;
        double s = Math.sqrt(p * ((p - s1) * (p - s2) * (p - s3)));
        System.out.println(s>0 ? s : "Такого треугольника не существует");
    }
}
