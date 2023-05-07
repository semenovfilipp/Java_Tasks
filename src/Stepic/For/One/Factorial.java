package Stepic.For.One;///Вводится натуральное число n.
// Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
//
//n! = 1∙2∙3∙…∙ n.


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nF = 1;

        for (int i = 1; i <=n;i++){
            nF*=i;
        }
        System.out.println(nF);
    }
}
