package Stepic.Data_types;// Вычислите его площадь и периметр (именно в таком порядке).
// Результат выведите на разных строках.
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b );
        System.out.println(2 * (a + b));
    }
}
