package Stepic.Static;
//Напишите функцию twoWords, которая принимает две строки и сравнивает их длины.
// После чего выводит на экран либо "Первая строка длиннее", либо "Вторая строка длиннее", либо "Равная длина".
// Содержание функции main менять запрещено.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }
    public static void twoWords (String s1, String s2){
        if (s1.length()>s2.length()) {
            System.out.println("Первая строка длиннее");
        }
        if (s1.length()<s2.length()){
            System.out.println("Вторая строка длиннее");
        }if (s1.length() == (s2.length())){
            System.out.println("Равная длина");
        }
    }
}
