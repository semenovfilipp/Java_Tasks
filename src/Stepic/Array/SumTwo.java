package Stepic.Array;
///Вводится массив (сначала количество элементов, потом сами элементы).
// Найдите сумму его элементов с чётными индексами и выведите её.
// А потом выведите числа, которые суммировались.

import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mass = new int[n];
        int sum = 0;

        for (int i = 0;i < n;i++){
            mass[i] = sc.nextInt();
            if (i%2==0){
                sum+=mass[i];
            }
        }
        System.out.println(sum);
        for (int i = 0;i < n;i++) {
            if (i % 2 == 0) {
                System.out.println(mass[i]);
            }
        }
    }
}
