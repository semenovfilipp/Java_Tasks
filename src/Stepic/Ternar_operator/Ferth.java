package Stepic.Ternar_operator;////Требуется определить, бьет ли ФЕРЗЬ,
// стоящий на клетке с указанными координатами (номер строки и номер столбца),
// фигуру, стоящую на другой указанной клетке.
//Входные данные
//Вводятся четыре числа: координаты ферзь (два числа) и координаты другой фигуры (два числа),
// каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
import java.util.Scanner;

public class Ferth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println((x1==x2 || y1==y2) || Math.abs(x1-x2)==Math.abs(y1-y2) ? "YES" : "NO" );

    }
}
