package Stepic.Else_boolean;//С клавиатуры вводятся два числа.
// Выведите на экран большее из них.

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
