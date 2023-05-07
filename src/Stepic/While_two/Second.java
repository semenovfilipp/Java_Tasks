package Stepic.While_two;//Вводятся два целых числа a и b (a <= b).
// Выведите на экран все числа от a до b включительно.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        while(a<=b){
            System.out.println(a);
            a++;}
    }
}