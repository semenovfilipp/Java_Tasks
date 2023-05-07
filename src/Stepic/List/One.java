package Stepic.List;
//Напишите программу, которая считает натуральное число n,
// а затем выведет на экран построчно все числа от 1 до n включительно.

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++){
            System.out.println(i);
        }
    }
}
