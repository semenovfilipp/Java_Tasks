package Stepic.Array;
///Петя перешёл в другую школу.
// На уроке физкультуры ему понадобилось определить своё место в строю.
// Помогите ему это сделать.
//Входные данные
//Программа получает на вход невозрастающую последовательность натуральных чисел
// (сначала вводится количество, затем сами числа),
// означающих рост каждого человека в строю.
// После этого вводится число X – рост Пети.
// Все числа во входных данных натуральные и не превышают 200.
//Выходные данные
//Выведите номер, под которым Петя должен встать в строй.
// Если в строю есть люди с одинаковым ростом, таким же, как у Пети, то он должен встать после них.

import java.util.Scanner;

public class Sherenga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (x > mass[i]) {
                System.out.println(i + 1);
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (x < mass[i] + 1) {
                count++;
            }
        }
        if (count == n) {
            System.out.println(n + 1);
        }
    }
}
