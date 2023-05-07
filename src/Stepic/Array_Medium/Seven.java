package Stepic.Array_Medium;
///Вводится натуральное число n (n > 1).
// На следующей строчке вводятся n целых чисел.
// Считайте их как массив на n элементов.
// Выведите на экран n - 1 число: сумму первого элемента и второго,
// затем сумму второго и третьего, третьего и четвёртого и т.д.
//Подсказка: Обратите внимание, что в данном случае на каждой итерации циклам
// вам необходимо знать сразу два элемента массива.
// В таком случае обычно поступают так:
// внутри цикла обращаются сразу к элементам с индексами i - 1 и i,
// но при этом начинают перебирать значения в цикле не с 0, а с 1.
// Иначе выйдем за пределы массива.

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i< array.length;i++){
            array[i] = sc.nextInt();
        }
        for (int i=1;i< array.length;i++){
            array[i] = array[i-1]+array[i];
            System.out.print(array[i]+" ");
        }
    }
}