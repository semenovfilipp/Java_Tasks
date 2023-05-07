package Stepic.Ternar_operator;//На сковородку одновременно можно положить k котлет.
// Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно.
// За какое наименьшее время удастся поджарить с обеих сторон n котлет?
//Вводятся 3 числа: k, m и n. Все числа не превосходят 32000.
//Выходные данные
//Вывести время, за которое все котлеты будут обжарены.

import java.util.Scanner;

public class Cotlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(n<= k ? (m * 2) : n * 2 % k == 0 ? (n * 2 / k * m) :
                (n * 2 / k * m + m));


    }
}
