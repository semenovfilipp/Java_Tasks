package Stepic.Char;
///Вася написал книгу рецептов для своего лучшего друга Коли, но забыл,
// что у него аллергия на один из продуктов.
// Тогда Вася решил заменить этот продукт на некоторый другой.
// Вася не хочет переписывать всю книгу, поэтому помогите ему написать программу, которая сделает это за него.
//На первой строке записывается, на какой продукт аллергия у Коли.
// На второй - на какой продукт его следует заменить.
// После даётся одна строка, в которой, теоретически, записана вся книга.
// Все слова написаны с маленькой буквы.

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String str = sc.nextLine();

        String replStr =str.replace(a,b);
        System.out.println(replStr);
    }
}
