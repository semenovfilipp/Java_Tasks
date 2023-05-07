package Stepic.Data_types;

import java.util.Scanner;

//Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров.
// На какой день улитка доползёт до вершины шеста?
///Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
////Программа должна вывести одно натуральное число.

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во метров, которые улитка преодолевает за ДЕНЬ\n");
        int a = sc.nextInt();    // подьем днем    /// a>b
        System.out.println("Введите кол-во метров, на которые улитка сползает за НОЧЬ\n");
        int b = sc.nextInt();   ///спуск ночью
        System.out.println("Введите длинну столба\n");
        int h = sc.nextInt();   /// длинна столба
        int days = h/(a-b);
        if (a>b){
            System.out.println("Улитка преодолеет столб за " + days + " дней.");
        }else{
            System.out.println("Ошибка!Улитка не может спользать за ночь больше, чем проходить.\nИначе в чем смысл ее отрицательной жизни?");
        }
    }
}
