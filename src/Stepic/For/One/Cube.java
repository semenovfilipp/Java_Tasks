package Stepic.For.One;//Пользователь вводит слова до тех пор, пока не введёт "СТОП".
// Необходимо выяснить, было ли среди введённых слов слово "Куб".
// Если да, то выведите "YES", если нет, то  "NO".

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean is_0 = false;

        for (String i = "СТОП"; !i.equals(s); s = sc.nextLine()) {
            if (s.equals("Куб")) {
                is_0 = true;
            }

            if (s.equals("Куб")) {
                is_0 = true;
            }
        }

        if (is_0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}