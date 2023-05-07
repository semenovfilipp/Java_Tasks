package Stepic.Basic_types;///ВАЛЛ-И очень любит читать.
// В его книге n страниц и каждый день он читает по s страниц.
// Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через d дней.

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int result = (n - (d*s));
        System.out.println(result);
   }
}
