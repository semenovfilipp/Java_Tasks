package Stepic.If_Else//Вводятся два целых числа:  a, b - коэффициенты линейного уравнения a * x + b = 0.
// Определите количество его корней.
// Вам достаточно вывести одно целое число - количество корней квадратного уравнения.
// Если корней бесконечно много, ты выведите строку "inf".
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("inf");
        } else if (a!=0) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
