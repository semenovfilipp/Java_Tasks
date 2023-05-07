package Stepic.For.One;
///Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
//Sample Input:
//6
//Sample Output:
//011


import java.util.Scanner;

public class DoubleCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt();
             n > 0; n /= 2) {
            System.out.print(n % 2);
        }
    }
}
