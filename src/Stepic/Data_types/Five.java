package Stepic.Data_types;// При решении этой задачи нельзя использовать условную инструкцию if и циклы.
//Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + 2 - (n % 2));
    }
}
