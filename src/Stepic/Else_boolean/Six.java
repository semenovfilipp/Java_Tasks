package Stepic.Else_boolean;//У Пети очень странные часы. Они считают время не так, как остальные - они отсчитывают количество секунд от начала суток.
////Как-то раз Петя уснул, будильник, не сработал, но взглянув на часы, Петя не смог понять, успел ли он на уроки, или опоздал.
// Если Петя проснулся ровно в ту секунду, когда должен был, или раньше, то он успевает на учёбу.
////Входные данные
//На вход даётся 3 целых числа: h, m - время, в которое Пете надо было проснуться, и x - время, которое показывают его часы.

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();  //часы
        int m = sc.nextInt(); // минуты
        int x = sc.nextInt();  ///часы Пети
        int result = ((h*60)*60) + (m*60);
        if (result>=x){
            System.out.println("Успел");
        }else{
            System.out.println("Опоздал");
        }
    }
}
