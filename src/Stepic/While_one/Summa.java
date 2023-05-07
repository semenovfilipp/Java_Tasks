package Stepic.While_one;///Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c=a++;
        while(a<=b){
            c+=a++;
        }
        System.out.print(c);

    }
}
