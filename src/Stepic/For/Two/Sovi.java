package Stepic.For.Two;
///Напишите программу, которая по введенному с клавиатуры числу выводит соответствующее число сов.
//Картинка тетушки Совы состоит из символов. Размер одной картинки 5 на 11 символов.
//:)\_____/(:
// {(@)v(@)}
// {|~- -~|}
// {/^'^'^\}
// ===m-m===
//Между двумя соседними совами имеется пустая строка.
import java.util.Scanner;

public class Sovi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ":)\\_____/(:\n" +
                " {(@)v(@)}\n" +
                " {|~- -~|}\n" +
                " {/^'^'^\\}\n" +
                " ===m-m===";
        for (int i = 0;i<n;i++){
            System.out.println(s);
            System.out.println("");
        }

    }
}
