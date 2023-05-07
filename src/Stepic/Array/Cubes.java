package Stepic.Array;
///Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
// Затем вводятся 2 числа из этого диапазона.
// Используя данные из массива найдите их кубы.

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mass = new int[1001];
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0;i< mass.length;i++){
            mass[i] = (int) Math.pow(i,3);
        }
        System.out.println(mass[a] + "\n" + mass[b]);
    }
}
