package Stepic.For.Two;

import java.util.Scanner;

///В компьютер вводятся по очереди данные об имени и возрасте n учащихся класса
// Напишите программу, которая вычисляет средний возраст учащихся класса.
//Вводится натуральное число n - количество человек в классе. Затем вводится n пар строчек. Каждая пара состоит из имени и возраста ученика.
//Выходные данные
//Выведите единственное действительное число - ответ на задачу.
public class Midle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double middle = 0;

        for (int i = 0;i<n;i++){
            String name = sc.nextLine();
            name+= sc.nextLine();
            int age = sc.nextInt();
            middle+=age;
        }
        System.out.println(middle/n);
    }

}
