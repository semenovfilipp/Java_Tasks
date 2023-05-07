package Stepic.DoubleArray;
///Вводится число n.
// Затем вводится 2 раза по n действительных чисел - два массива.
// Вывести на экран их сумму.

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double [] a = new double[(int) n];
        double [] b = new double[(int) n];

        for (int i = 0;i < a.length;i++){
            a[i] = sc.nextDouble();
        }

        for (int i = 0;i < b.length;i++){
            b[i] = sc.nextDouble();
        }

        for (int i = 0;i < a.length;i++){
            a[i] += b[i];
            System.out.println(a[i]);
        }
    }
}