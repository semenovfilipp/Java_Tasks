package Stepic.For.Two;

///Напишите программу, которая выводила бы на экран числа (например число а) следующим образом:
//a a.$
//Входные данные
//Вводятся два натуральных числа a и b (a <= b).
//Выходные данные
//Выведите ответ на задачу.

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a<=b){
            System.out.println(a + " " + a + ".$" );
            a++;
        }
    }
}
