package Stepic.For.Two;
//Вводится 2 целых числа a и b (a <= b). Необходимо вычислить произведение всех чисел от а до b включительно
//Входные данные
//Заданы два целых числа а и b
//Выходные данные
//Выведите единственное число - ответ на задачу.
//Примечание
//В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.


import java.util.Scanner;

public class ProdTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;

        for (int i = a;i<=b;i++){
            count*=i;
        }

        System.out.println(count);
    }
}
