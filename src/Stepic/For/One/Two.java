package Stepic.For.One;//Пользователь вводит с клавиатуры натуральное число n.
// Затем вводит n целых чисел. Необходимо найти и вывести на экран количество чётных.

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0;i < n;i++){
            int x = sc.nextInt();
            if(x%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
