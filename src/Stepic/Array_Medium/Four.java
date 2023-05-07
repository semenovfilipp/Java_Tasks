package Stepic.Array_Medium;
//Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
// Напишите код, который создаст массив с именем array на n элементов,
// в котором буду храниться введённые числа (элемент массива равен соответствующему числу
// в во второй строке). На следующей строке вводится 2 числа - индексы элементов,
// сумму которых вам надо найти.
// Выведите на экран сумму этих двух элементов.
// Гарантируется, что индексы лежат в диапазоне от 0 до n - 1.

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0;i < arr.length;i++){
            arr [i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(arr[a] + arr[b]);
    }
}
