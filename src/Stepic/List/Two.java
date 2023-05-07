package Stepic.List;
//Напишите программу, которая считает строку и определит,
// есть ли в ней именно слово "повторение".
// Слово может быть написано как с маленькой, так и с большой буквы.
// Гарантируется, что знаки препинания из текста были удалены. На экран выведите YES/NO.

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().toLowerCase().split(" ");
        boolean flag = false;

        for (String s : str) {
            if (s.equals("повторение"))
                flag = true;
        }
        System.out.println(flag ? "YES" : "NO");

    }
}


