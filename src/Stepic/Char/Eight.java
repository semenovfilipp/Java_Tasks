package Stepic.Char;
//Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес.
// Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками.
// В следующих трех строках показаны три правильных IP-адреса:
//127.0.0.0
//192.168.0.01
//255.00.255.255
//Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split("\\.");
        boolean flag = true;

        for (String s : str) {
            if (str.length != 4) {
                flag = false;
                break;
            }
            if (s.isEmpty()) {
                flag = false;
                break;
            }
            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
