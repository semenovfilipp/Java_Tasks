package Stepic.List;

import java.util.ArrayList;
import java.util.Scanner;
///Напишите программу, которая реализует структуру данных очередь, используя список.
//Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции. Когда песня доигрывает, включается следующая. Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.
//Сначала вводится число n - количество запросов к вашей программе. Каждый из запросов будет иметь один следующих видов:
//push <Название трека> - добавляет трек в плейлист
//pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
//После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.

class Nine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        String str1 = null;
        for (int  i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equalsIgnoreCase("push")) {
                list.add(sc.next());
            } if (str.equalsIgnoreCase("pop")) {
                str1 = list.get(0);
                System.out.println("воспроизводится" + " " + str1);
                list.remove(0);
            }
        }
        System.out.println(String.join(" ", list));
    }
}