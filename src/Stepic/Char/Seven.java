package Stepic.Char;
///Маша и Олег играли в игру.
// Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву и заканчиваются на любимую букву её друга Олега.
// Олег же наоборот - слова, которые начинаются на его любимую букву и заканчиваются на любимую букву Маши.
// Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).
// Определите, сколько слов выписали дети

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordMarry = sc.nextLine();
        String wordOleg = sc.nextLine();
        String [] str = sc.nextLine().toLowerCase().split(" ");

        int countMasha = 0;
        int countOleg = 0;

        for (String s : str) {
            if (s.startsWith(wordMarry) && s.endsWith(wordOleg)) {
                countMasha++;
            } else if (s.startsWith(wordOleg) && s.endsWith(wordMarry)) {
                countOleg++;
            }
        }
        System.out.println(countMasha);
        System.out.println(countOleg);
    }
}
