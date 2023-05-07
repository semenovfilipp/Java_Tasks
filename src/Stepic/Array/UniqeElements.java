package Stepic.Array;
//Дан список.
// Выведите те его элементы, которые встречаются в списке только один раз.
// Элементы нужно выводить в том порядке, в котором они встречаются в списке.

import java.util.Scanner;

public class UniqeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        boolean flag = true;

        ///
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();

        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = mass[i]; j < n; j++) {
                if (mass[i] == mass[j] & i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(mass[i]);
            }
        }
    }
}


