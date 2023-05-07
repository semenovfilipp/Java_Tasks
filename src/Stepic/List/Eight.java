package Stepic.List;
//Напишите программу, которая реализует структуру данных очередь, используя список.
//Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции.
// Когда песня доигрывает, включается следующая.
// Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.
//Сначала вводится число n - количество запросов к вашей программе.
// Каждый из запросов будет иметь один следующих видов:
//push <Название трека> - добавляет трек в плейлист
//pop - удаляет из плейлиста первый трек.
// При этом на экран выводится запись вида "воспроизводится <название трека>"
//После выполнения всех запросов выведите оставшиеся в очереди треки.
// Гарантируется, что название трека состоит из одного слова.

import java.util.ArrayList;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <String> list =  new ArrayList<>();
        String del = null;

        for (int i = 0;i <=n;i++){
            String str = sc.next();

            if (str.equals("push")) {
                list.add(sc.next());
            }else if (str.equals("pop")) {
            del = list.get(0);
                System.out.println("Воспроизводится " + del);
                list.remove(0);
            }
        }
        System.out.println("Воспроизводится " + del);
        System.out.println (String.join(" " + list));
    }
}
