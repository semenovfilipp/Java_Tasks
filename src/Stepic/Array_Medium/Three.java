package Stepic.Array_Medium;
///Вводится натуральное число n.
// На следующей строчке вводятся n целых чисел.
// Допишите код, который создаст массив с именем array на n элементов,
// в котором буду храниться введённые числа (элемент массива равен соответствующему числу
// в во второй строке).
//
//Написанный код менять запрещено.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
