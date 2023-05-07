package Stepic.Char;
///водится число n, затем n строчек, которые необходимо соединить.
// После вводится ещё одна строка - которая должна быть в качестве разделителя.
// Выведите одну строку - все введённые выше слова через разделитель.

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];

        for (int i = 0;i < n;i++){
            str [i] = sc.next();
        }

        String del = sc.next();
        String a = String.join(del, str);
        System.out.println(a);
    }
}
