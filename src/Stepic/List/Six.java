package Stepic.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0;i <= n-1;i++){
            list.add(i,String.valueOf(i));
        }
        list.set(sc.nextInt(), sc.next());
        System.out.println(list);
    }
}
