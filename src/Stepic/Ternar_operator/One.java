package Stepic.Ternar_operator;//Вася приехал в Америку и он оооооочень любит кофе.
// В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год.
// Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе?

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age > 20 ? "Yes" : "No");
    }
}