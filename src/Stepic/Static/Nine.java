package Stepic.Static;
///Напишите функцию monneub,  которая принимает как аргумент массив целых чисел и находит длину максимального монотонно не убывающего промежутка и выведите её на экран.
// Содержание функции main менять запрещено.

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);
    }

    private static void monneub(int[] mas) {
        int count = 0;
        int countMax = 0;
        for (int i = 0;i < mas.length;i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    count++;
                    }
                }
            }if (count > countMax){
            countMax+=count;
        }
        System.out.println(countMax);
    }
}


////Не сделал

