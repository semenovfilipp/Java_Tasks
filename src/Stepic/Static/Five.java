package Stepic.Static;
//Необходимо написать программу для поиска площади и периметра квадрата или круга.
// Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число (либо радиус круга, либо сторону квадрата).
// Как результат они выводят периметр и площадь фигуры соответственно.
// В ответ они должны вывести именно целое число (при надобности округлять "вверх", то есть до ближайшего большего целого числа).
// Содержание функции main менять запрещено. Пи брать как 3.14.

import java.util.Scanner;

class Five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }

    public static void area(String figure, int x) {
        double s = 0;
        if (figure.equalsIgnoreCase("квадрат")){
            s = Math.pow(x,2); // площадь квадрата
        }else if (figure.equalsIgnoreCase("круг")){
            s = (Math.pow(x,2)) * Math.PI; //площадь круга
            }
        System.out.println((int)Math.ceil(s));
        }

    public static void perimeter(String figure, int x) {
        double p = 0;
        if (figure.equalsIgnoreCase("квадрат")){
            p = x + x + x + x;
        } else if (figure.equalsIgnoreCase("круг")) {
            p = 2 * Math.PI * x;
        }
        System.out.println((int)Math.ceil(p));

    }
}
