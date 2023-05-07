package Stepic.While_one;//Пользователь вводит натуральное число.
// Необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.


import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        for (int i = 1; i*i < x; i++){
            System.out.println(i*i);
        }
    }
}

/** C Циклом While
 * int a = sc.nextInt();
 * int b = 1;
 * while (b * b <= a){
 *     System.out.println(b * b);
 *     b++;
 * }
 */
