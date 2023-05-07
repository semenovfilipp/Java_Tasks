package Stepic.Basic_types;//ВАЛЛ-И за 1 день выучивает n иностранных слов.
// Составьте программу, которая рассчитает, сколько иностранных слов выучит робот за d дней.


import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int result = n*d;
        System.out.println(result);
    }
}
