package Stepic.Basic_types;//ВАЛЛ-И случайно забрел на ферму, где увидел лошадей и гусей.
// Лошадей он насчитал h штук, гусей - g штук.
// Составьте программу, которая бы помогла ВАЛЛ-И узнать количество ног обитателей фермы.

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int g = sc.nextInt();
        int result = (h*4) + (g*2);
        System.out.println(result);

    }
}
