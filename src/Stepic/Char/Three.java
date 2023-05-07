package Stepic.Char;
//Дана строка.
//Сначала выведите третий символ этой строки.
//Во второй строке выведите предпоследний символ этой строки.
//В третьей строке выведите первые пять символов этой строки.
//В четвертой строке выведите всю строку, кроме последних двух символов.
//На пятой строке выведите всю строку, кроме первых 3 символов.
//На шестой строке выведите длину данной строки.
//Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char a = s.charAt(2);
        System.out.println(a); //one

        char b = s.charAt(s.length()-2);
        System.out.println(b);      //two

        String g = s.substring(0,5);
        System.out.println(g);        ///three


        String c = s.substring(0,s.length() - 2);
        System.out.println(c);          //four

        String d = s.substring(3);
        System.out.println(d);      /// five

        System.out.println(s.length());         ///six
    }
}

