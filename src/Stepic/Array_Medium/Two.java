package Stepic.Array_Medium;
//Вводится натуральное число n.
// Допишите код, который создаст массив с именем array на n элементов,
// в котором буду храниться квадраты чисел от 0 до n - 1 (элемент равен квадрату индекса).
//Написанный код менять запрещено.
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        // ваш код

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow(i, 2);
            System.out.print(array[i] + " ");
        }
    }
}
