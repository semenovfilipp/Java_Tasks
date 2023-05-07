package Stepic.For.One;///Задача на поиск минимума и максимума.
// Пользователь вводит натуральное число n, затем n целых чисел. Необходимо определить и вывести на экран минимальное и максимальное из них.
//Обратите внимание, что в большинстве задач как минимальное и максимальное значения часто используются -2*109 и 2*109 соответственно.
// Но в олимпиадных задачах всегда смотрите на ограничения по числам (в них всегда оговорены границы, в которых будут лежать значения переменных).

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = sc.nextInt();
        int max = min;
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println(min);
        System.out.println(max);

    }
}