package Stepic.Static;
//Напишите функцию sortByLength,  которая принимает как аргумент строку и
// сортирует её по длине слова. Если длины слов одинаковы, то сортировать в алфавитном порядке.
// Содержание функции main менять запрещено.

import java.util.*;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortByLength(s);
    }

    public static void sortByLength(String s) {
        String mas[] = s.toLowerCase(Locale.ROOT).split(" ");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, mas);
        Collections.sort(list);
        list.sort(Comparator.comparingInt(String::length));

        for (String ma : list) {
            System.out.println(ma + " ");
        }
    }
}
