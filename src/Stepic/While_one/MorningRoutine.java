package Stepic.While_one;///В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
// По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.


import java.util.Scanner;

public class MorningRoutine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int day = 1;
        while (x<y){
            x +=(x/100*10)  ;
            day++;
        }
        System.out.println(day);
    }
}
