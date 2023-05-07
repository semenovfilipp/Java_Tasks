package Stepic.While_two;///Вводятся натуральное число n.
// Выведите на экран лесенку, состоящую из n ступенек. Каждая i-ая ступенька состоит из i звёздочек.
///Sample Input 1:
//5
//Sample Output 1:
//*
//**
//***
//****
//*****


import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        String star = "*";
        while (i <= n) {
            System.out.println(star);
            i++;
            star += "*";
        }
    }
}
