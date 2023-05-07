package Stepic.Map;
//Вводится число n, затем n целых чисел. Определите, сколько различных чисел было введено.

import java.util.HashSet;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet <Integer> num = new HashSet<>();
        int count = 0;

        for (int i = 0;i < n;i++){
            num.add(sc.nextInt());
        }
        System.out.println(num.size());
    }
}
