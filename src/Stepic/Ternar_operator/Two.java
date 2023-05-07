package Stepic.Ternar_operator;///Вводится два целых числа - длины катетов прямоугольного треугольника.
// Найдите гипотенузу этого треугольника.
// Если вы не знаете, как это сделать, то вот вам полезная ссылка

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = Math.hypot(x,y);
        System.out.println(z);
    }
}
