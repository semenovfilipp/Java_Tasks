package Stepic.Array;
///Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b.
// Затем вводится число n и n чисел после него. Используя данные из массива найдите кубы этих.
// Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".

import java.util.Scanner;

public class CubesTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[b - a + 1];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(a, 3);
            a++;
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (Math.pow(x, 3) == arr[j]) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println((int)Math.pow(x, 3));
            }else{
                System.out.println("Error");
            }
        }
    }
}