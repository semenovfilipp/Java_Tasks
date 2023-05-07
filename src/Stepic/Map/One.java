package Stepic.Map;
//Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
//
//Для слова из словаря, записанного в последней строке, определите его синоним.
//
//Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.
import java.util.HashMap;
import java.util.Scanner;


public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> syns = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String keyWord = sc.nextLine();
            String synWord = sc.nextLine();
            syns.put(synWord, keyWord);
            syns.put(keyWord, synWord);
        }
        String toFind = sc.nextLine();
        System.out.print(syns.get(toFind));
    }
}