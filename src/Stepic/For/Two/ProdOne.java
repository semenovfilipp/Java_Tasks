package Stepic.For.Two;
////Составьте программу, которая запрашивает ввод n чисел и считает их произведение.
//Входные данные
//На первой строке вводится натуральное число n. Затем вводится n строк, на каждой из которых находится ровно одно целое число.
//Выходные данные
//Выведите единственное число - ответ на задачу.
//Примечание
//В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.

import java.util.Scanner;

public class ProdOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 1;

        for (int i = 0;i<n;i++){
            long x = sc.nextInt();
            count*=x;
        }
        System.out.println(count);
    }
}
