package Stepic.Array;
//Вводится список (сначала количество элементов, потом сами элементы).
// Найдите сумму всех элементов и выведите её.
// А потом выведите введённые числа в обратном порядке.

import java.util.Scanner;

public class SumMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mass = new int[n];
        int sum = 0;

        for (int i = 0;i < n;i++){
            mass [i] = sc.nextInt();
            sum+= mass[i];
        }
        System.out.println(sum);
        for (int i = mass.length - 1; i >= 0;i--){
            System.out.println(mass[i]);
        }
    }
}
