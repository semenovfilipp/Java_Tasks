package Stepic.While_two;//Программа запрашивает натуральное число n.
// Необходимо составить программу, которая будет считывать целые числа до тех пор, пока их произведение не станет больше либо равна n.
// Выведите через пробел количество введенных чисел и их произведение.
//Примечание: подумайте, что произойдёт, если n равно 1.

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int x = sc.nextInt ();
        int count = 1;
        int product = x;
        while (product<n) {
            x = sc.nextInt ();
            product *= x;
            count++;
        }
        System.out.print (count + " " + product);
    }
}
