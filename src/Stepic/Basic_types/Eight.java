package Stepic.Basic_types;//ВАЛЛ-И встретил n детей и хочет разделить между ними k яблок так, чтобы каждому досталось поровну.
// Не делящийся остаток он собирается отнести ЕВЕ. Сколько яблок достанется каждому ребенку?
// Сколько яблок получит ЕВА?
//Результат выведите в одной строке через пробел в указанном порядке.

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); /// кол-во детей
        int k = sc.nextInt(); /// кол-во яблок
        int eachChild = k/n ;
        int eve = k%n ;
        System.out.println(eachChild + " " + eve);

    }
}
