package Stepic.For.Two;
///Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c.
import java.util.Scanner;

public class ProDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = a;i>=b;i-=c){
            System.out.println(i);
        }
    }
}
