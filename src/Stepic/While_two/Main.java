package Stepic.While_two;//Вводится число натуральное число n.
// Выведите на экран построчно все числа от 1 до n.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        while (start != n){
            start++;
            System.out.println(start);
        }

    }
}
