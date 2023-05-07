package Stepic.Basic_types;//Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число, которое задумали его головы.
// Первая голова называет любое целое число, вторая - увеличивает его на 3, а третья результат уменьшает в 2 раза.
// Составьте программу, которая позволит ВАЛЛ-И безошибочно вычислять результат.

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double in = sc.nextInt();
        double out = (in+3)/2;
        System.out.println(out);
    }
}