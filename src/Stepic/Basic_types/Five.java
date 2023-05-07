package Stepic.Basic_types;//ВАЛЛ-И хочет по электронным часам, показывающим часы и минуты,  узнать сколько времени в минутах прошло от начала суток.
//два числа: часы (0 <= h < 24) и минуты (0 <= m < 60)

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int timeNow = (hour*60) + min;
        System.out.println(timeNow);

    }
}
