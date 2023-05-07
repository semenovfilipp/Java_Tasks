package Stepic.While_one;///Дано целое число, не меньшее 2.
// Выведите его наименьший натуральный делитель, отличный от 1.

import java.util.Scanner;

public class MinDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 2;
        while (x%i!=0){
            i++;
        }
        System.out.println(i);
    }
}
