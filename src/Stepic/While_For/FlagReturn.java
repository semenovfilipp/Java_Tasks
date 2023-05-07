package Stepic.While_For;//Вводится количество чисел n, затем n чисел.
// Необходимо выяснить есть ли среди них такое, которое заканчивается на 4?
// Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".

import java.util.Scanner;

public class FlagReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 10 == 4) {
                flag = true;
            }
        }
        System.out.println(flag ? "Yes" : "No");

    }
}