package Stepic.Ternar_operator;///Даны координаты двух точек на плоскости,
// требуется определить, лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).
////Входные данные
//Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).
////Выходные данные
//Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print((Math.signum(x1) == Math.signum(x2) && Math.signum(y1) == Math.signum(y2)) ? "YES":"NO");
    }
}
