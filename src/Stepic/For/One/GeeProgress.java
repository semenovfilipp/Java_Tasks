package Stepic.For.One;///По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an,
// не используя формулу суммы геометрической прогрессии.
// Время работы программы должно быть пропорционально n.
//Входные данные
//Вводятся 2 числа - a и n.
//Выходные данные
//Необходимо вывести  значение суммы.


import java.util.Scanner;

public class GeeProgress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int gEnd = 1;


        for (int i = 1;i<=n;i++) {
            gEnd += Math.pow(a,i);
        }
        System.out.println(gEnd);
    }
}
