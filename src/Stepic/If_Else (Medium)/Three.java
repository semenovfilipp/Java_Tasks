package Stepic.If_Else//Вводится целое число n (0 < n < 1000).
// Определите, сколько в нём цифр. Выведите ответ на экран.

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x<10){
            System.out.println(1);
        }else if (x<100){
                System.out.println(2);
            }else{
            System.out.println(3);
        }
    }
}


//  System.out.println(x < 10 ? 1 : x < 100 ? 2 : 3);  /// Тернарный оператор
//// циклом, пока число больше нуля, делить его на 10 (каждый раз уменьшать количество цифр на одну) и увеличивать счётчик.
////int n = <какое-то число> ;
//int sum = 0;
//while (n > 0) {
//    sum += n % 10;
//    n /= 10;
//}