package Stepic.Data_types;

import java.util.Scanner;

class Eight{
    public static void  main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n % 10) + (n / 10) % 10 + (n / 100));
    }
}