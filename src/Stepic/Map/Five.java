package Stepic.Map;
//Вводится число n, затем n целых чисел.
// Для каждого числа выведите слово YES (в отдельной строке),
// если это число ранее встречалось в последовательности или NO,  если не встречалось.

import java.util.HashSet;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet <Integer> num = new HashSet<>();

        for (int i = 0;i < n;i++){
            if (num.add(sc.nextInt())) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
