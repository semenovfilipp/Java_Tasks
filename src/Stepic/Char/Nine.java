package Stepic.Char;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кто лучше всех?!");
        String s = sc.nextLine();
        if (s.equals("Я") || s.equals("я")){
            System.out.println("Верно");
            System.out.println("ЮЛЯ ЗАРЯЖАЕТ НА УСПЕХ!!!");
        }else if (s.equals("Юля") ||s.equals("юля")) {
            System.out.println("Верно!");
            System.out.println("ТЫ ЗАРЯЖАЕШЬ НА УСПЕХ!!!");
        }else{
            System.out.println("Неверно!!!");
            System.out.println("ЮЛЯ ЗАРЯЖАЕТ НА УСПЕХ!!!");
        }
    }
}
