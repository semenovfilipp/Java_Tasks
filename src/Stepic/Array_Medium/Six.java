package Stepic.Array_Medium;
///Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
// Напишите код, который создаст массив с именем array на n элементов,
// в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).
// На следующей строке вводится число t - Количество запросов к вашей программе.
// Каждый запрос состоит из пары целых чисел и записывается на отдельной строке.
// Каждая пара чисел - индексы элементов, сумму которых вам надо найти. Выведите на экран сумму этих двух элементов для каждого запроса на каждой строке по отдельности.
// Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1, то выведите на экран слово Error.

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i = 0;i < array.length;i++){
            array [i] = sc.nextInt();
        }

        int t = sc.nextInt();
        for (int i = 0;i < t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= 0 && a < n && b >= 0 && b < n) {
                System.out.println(array[a] + array[b]);
            } else {
                System.out.println("Error");

            }
        }
    }
}
