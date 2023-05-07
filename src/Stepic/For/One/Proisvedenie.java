package Stepic.For.One;///Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
// Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".
//Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:
//String s = "45";
//int n = Integer.parseInt(s); //в переменной n окажется число 45

import java.util.Scanner;

public class Proisvedenie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean flag = false;
        int prod = 1;
        for (s = sc.next(); !s.equals("СТОП"); s = sc.next()) {
            int a = Integer.parseInt(s);

            if (a != 0) {
                prod *= a;
                flag = true;

            }
        }
        System.out.print(flag ? prod : "Не найдено");
    }
}