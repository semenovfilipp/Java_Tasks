package Stepic.Else_boolean;///С клавиатуры построчно вводятся три строки.
// Необходимо определить, все ли он равны.
// Если да, то вывести "Yes", в противном случае - "No".

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();
        if (x.equals(y) & x.equals(z)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
