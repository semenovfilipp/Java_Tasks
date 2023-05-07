package Stepic.Basic_types;//Робот ВАЛЛ-И решил отправиться в соседний город.
// Половину пути он проехал за t часов со скоростью x км/ч , а остальное расстояние со скоростью y км/ч.
// Рассчитайте, сколько времени ВАЛЛ-И был в пути.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int pathTime = (t*x)/y;
        System.out.println(pathTime + t);
    }
}
