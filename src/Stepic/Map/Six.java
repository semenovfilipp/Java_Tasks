package Stepic.Map;
//Дан текст: в первой строке записано число строк, далее идут сами строки.
// Определите, сколько различных слов содержится в этом тексте.
//Словом считается последовательность непробельных символов идущих подряд,
// слова разделены одним или большим числом пробелов или символами конца строки.

import java.util.HashSet;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();

        for (String ss : set) {
            set.add(sc.next());
        }
    }
}
//не сделано
/**
import java.util.Scanner;
 import java.util.HashSet;

 class MyProgram{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 HashSet<String> s = new HashSet<>();

 sc.nextLine();
 while(sc.hasNext())
 s.add(sc.next());
 System.out.print(s.size());
 }
 }
 */
