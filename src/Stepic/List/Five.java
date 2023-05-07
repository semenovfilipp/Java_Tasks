package Stepic.List;
///Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
// в котором будут хранится строковые представления чисел от 0 до n-1.
// Затем программа считывает число m (m <= n) и строку s.
// Вставьте строку s на позицию m. Выведите список на экран через пробел.

import java.util.ArrayList;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= n-1; i++) {
            list.add(i, String.valueOf(i));
        }
        list.add(sc.nextInt(), sc.next());
        System.out.println(list);
    }
}

