package Stepic.Data_types;// Найдите его последнюю цифру.

import java.util.Scanner;

class Seven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a % 10);
    }
}