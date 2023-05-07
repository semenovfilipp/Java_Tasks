package Stepic.Basic_types;//Робот ВАЛЛ-И любит играть в такую игру: он называет натуральное число,
// а ЕВА берет последнюю цифру этого числа и увеличивает на n.
// Какое число получила ЕВА?


import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int eve = (x%10) + n;
        System.out.println(eve);
    }
}
