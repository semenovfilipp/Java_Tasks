package Stepic.Data_types;//Пробелы, знаки препинания, заглавные и строчные буквы важны!
// Вводится целое число, по модулю не превосходящее 10000.
/// Выведите сначала фразу "The next number for the number ",
// затем введенное число, затем слово " is ", окруженное пробелами,
// затем формулу для следующего за введенным числа, наконец, знак точки без пробела.
/// Аналогично в следующей строке для предыдущего числа.
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a + 1) + '.');
        System.out.println("The previous number for the number " + a + " is " + (a - 1) + '.');
    }
}

