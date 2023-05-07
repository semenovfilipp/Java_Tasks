package Stepic.Basic_types;//ВАЛЛ-И собирается съездить на уборку в соседний город и хочет рассчитать время на дорогу.
// По карте он определил расстояние s в километрах и настроил свою скорость равной v км/ч.
// Составьте программу, которая поможет ВАЛЛ-И определять время, проводимое в пути.


import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextInt();
        double v = sc.nextInt();
        double result = (s/v);
        System.out.println(result);
    }
}
