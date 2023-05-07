package Stepic.While_For;//У старшего брата  маленького Лёши день рождения в тот же день, что и у него.
// Лёше сейчас n лет, а его брату - k лет. Сейчас 2020 год.
// необходимо определить, в каком году Брат Лёши будет ровно вдвое старше?
// Если такое невозможно, то выведите в консоль слово "Никогда".


import java.util.Scanner;

public class Older {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); /// младший
        int k = sc.nextInt();  /// старший

        if ((k - n) >= k) {
            System.out.println(2020 + ((k - n) - n));
        } else System.out.println("Никогда");
    }
}
