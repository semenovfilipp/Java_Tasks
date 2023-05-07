package Stepic.Char;
//Дана строка, в которой через пробел перечислены цифры.
// На следующей строке вводится цифра.
// Определите индексы первого и последнего её вхождения.

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String n = sc.nextLine();


        System.out.println(str.indexOf(n));
        System.out.println(str.lastIndexOf(n));
    }
}
