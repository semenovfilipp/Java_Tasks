package Stepic.Else_boolean;//С клавиатуры построчно вводятся три строки.
// Если среди них есть ровно две равные строки то вывести "Yes", в противном случае - "No".

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if (s1.equals(s2) & !s2.equals(s3) || s2.equals(s3) & !s3.equals(s1) || s3.equals(s1) & !s1.equals(s2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
