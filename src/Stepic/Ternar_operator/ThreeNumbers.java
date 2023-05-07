package Stepic.Ternar_operator;//Дано три числа, записанный в отдельных строках.
// Упорядочите их в порядке неубывания.
// Программа должна считывать три числа a, b, c, затем программа должна менять их значения так,
// чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.
//Вводятся три числа, каждое записано в отдельной строке.
//Выходные данные
//Выведите ответ на задачу.

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int med = a+b+c-max-min;
        System.out.println(min + " "+ med + " "+ max);
    }
}
