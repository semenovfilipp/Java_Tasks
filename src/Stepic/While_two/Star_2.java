package Stepic.While_two;//Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.
//    *
//   ***
//  *****
// *******
//*********

import java.util.Scanner;

public class Star_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        int i = 1; /// Колличество звезд на линии
        while(i <= n){   // Цикл - пока колличество не дойдет до введенного значения
            int j = n - i;   /// Вводим переменную, которая делает колличество пробелов, выравнивая рисунок
            while(j >= 0){
                System.out.print(" ");
                j--;     ///пробелы ставятся по убванию, что б они заполнялись далее звездами
            }
            System.out.println(star);
            star+= "**";
            i++;
        }
    }
}





















