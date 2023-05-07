package Stepic.While_For;///Вводятся два целых числа: a и b (a <=b ).
// Выведите на экран все числа от b до а через одно на разных строчках.


import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i<=b; b-=2){
            System.out.println(b);
        }
    }
}