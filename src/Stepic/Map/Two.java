package Stepic.Map;
//Вводится натуральное число n, затем n слов на разных строках.
// Определите, какое слово встречается чаще всего.
// Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.
import java.util.HashMap;
import java.util.Scanner;

public class Two {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        HashMap <String , Integer> list = new HashMap<>();
        int n = sc.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            list.put(s, list.getOrDefault(s, 0) + 1);
            max = list.get(s) > max ? list.get(s) : max;
        }
        for (String key : list.keySet())
            System.out.print(list.get(key) == max? key: "");
    }
}