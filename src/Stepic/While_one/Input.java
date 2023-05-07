package Stepic.While_one;///Пользователь с клавиатуры вводит действительные числа до 0.
// Необходимо вычислить их среднее арифметическое.
// Гарантируется, что он введёт хотя бы одно ненулевое число.

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        double count = 0;
        while (x!=0){
            count++;
            y +=x;
            x = sc.nextInt();
        }
        System.out.println(y/count);
    }
}
