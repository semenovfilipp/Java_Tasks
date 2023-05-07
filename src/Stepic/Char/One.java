package Stepic.Char;
//Напишите программу, определяющую, является ли данный символ цифрой или нет.

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(Character.isDigit(a.charAt(0))? "YES" : "NO");
    }
}

