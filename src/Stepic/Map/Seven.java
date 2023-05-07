package Stepic.Map;
//Несколько друзей решили сыграть в игру: кто больше слов знает.
// Они сели за стол и стали записывать все слова, которые только пришли им на ум.
// После чего стали сравнивать, у кого больше слов.
// В этот момент стало понятно, что некоторые ребята по ошибке записали какие-то слова несколько раз.
// Разумеется, повторяющиеся слова вычеркнули.
// Потом они поняли, что слов слишком много, поэтому решили считать только те, длина которых не меньше, чем K.
// Помогите ребятам узнать, кто же знает больше слов.
// Гарантируется, что есть единственный победитель

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Seven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap <String, String> namesList = new HashMap<>();
        HashSet <String> wordsList = new HashSet<>();

        for (int i = 0;i < n;i++){
            String name = sc.next();
            wordsList.add(sc.nextLine());
            namesList.put(name, String.valueOf(wordsList));



        }


    }
}
