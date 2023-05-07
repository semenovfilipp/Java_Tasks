package Stepic.Else_boolean;///Вводится 3 целых числа, выведите большее из них

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.print(a);
        }
        if (b > c && b > a) {
            System.out.print(b);

        }
        if (c > b && c > a) {
            System.out.print(c);
        }
    }
}
