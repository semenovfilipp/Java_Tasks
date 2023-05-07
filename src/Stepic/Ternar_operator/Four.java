package Stepic.Ternar_operator;

import java.util.Scanner;

////Вводятся три целых числа.
// Необходимо определить, существует ли треугольник с такими сторонами. В ответ выведите "Yes"/"No".
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b>c & b+c>a & a+c>b) ? "Yes" : "No");

    }
}
