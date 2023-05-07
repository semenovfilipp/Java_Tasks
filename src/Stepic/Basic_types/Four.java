package Stepic.Basic_types;//ВАЛЛ-И решил отметить день рождения и пригласил x друзей.
// На каждого гостя ему необходимо приготовить 10 грамм заварки и по n пирожному.
// Килограмм чая на развес стоит t рублей, а одно пирожное - k рублей.
// Во сколько обойдется ВАЛЛ-И чаепитие? Гарантируется, что все числа в решения задачи окажутся целыми.
///Вводятся 4 целых неотрицательных числа:
//


import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();//x - количество приглашенных друзей
        int t = sc.nextInt();//t - стоимость килограмма чая
        int k = sc.nextInt();//k - стоимость одного пирожного
        int n = sc.nextInt();//n - количество пирожных
        if (x!=n) throw new IllegalArgumentException("Ошибка.Кол-во пироженных равно кол-ву гостей");

        int result = ((t/100*x)+(n*k*x));
        System.out.println(result);

    }
}
