package Stepic.Ternar_operator;///Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца),
// фигуру, стоящую на другой указанной клетке.
//Входные данные
//Вводятся четыре числа: координаты коня (два числа) и координаты другой фигуры (два числа),
// каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
//
//Выходные данные
//Требуется вывести слово YES, если конь сможет побить фигуру за 1 ход и NO - в противном случае.

import java.util.Scanner;

public class Horse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int s = Math.abs(x1-x2);
        int t = Math.abs(y1-y2);
        System.out.print(  ((s==1 && t==2) || (s==2 && t==1))   ? "YES" : "NO" );
    }
}
