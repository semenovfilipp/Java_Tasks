package Stepic.Data_types;// Определите, сколько рублей и копеек нужно заплатить за n пирожков.
///Программа получает на вход три числа: a, b, n.
////Программа должна вывести два числа: стоимость покупки в рублях и копейках.

import java.util.Scanner;

class Six{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //стоимость пирожка в рублях
        int b = sc.nextInt(); //стоимость пирожка в копейках
        int n = sc.nextInt(); //количество купленных пирожков
        System.out.print((a*n)+(b*n)/100+" "+(b*n)%100);
    }
}