package Stepic.Array;
///Дан список (сначала количество элементов, потом сами элементы).
// Потом водятся два числа: a и b.
// Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно.
// Гарантируется, что а и b не выходят за границы размеров массива.

import java.util.Scanner;

public class ChangeSeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mass = new int[n];

        for (int i = 0;i<n;i++){
            mass[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = mass[a];
        mass [a] = mass[b];
        mass [b] = k;

        if ((a&b) <= mass.length){
            for (int i = 0;i<n;i++){
                System.out.println(mass[i]);
            }
        }
    }
}
