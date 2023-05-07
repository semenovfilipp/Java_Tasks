package Stepic.Else_boolean;//Напишите программу, которая считывает 2 действительных числа и выводит их частное.
// Если это невозможно, то выводит слово "Error"

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(b!=0){
            System.out.print(a/b);
        }else{
            System.out.print("Error");
        }
    }
}
