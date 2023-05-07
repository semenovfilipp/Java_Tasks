package Stepic.For.One;//Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7.
// Если ввели число, кратное 7, то программа должна завершиться (оно не суммируется).
// Во время решения задачи воспользуемся break и continue.


import java.util.Scanner;

public class OnlySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = sc.nextInt(); i % 7 != 0; i = sc.nextInt()) {
            if ( i%10 == 7 ){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
