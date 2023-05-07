package Stepic.If_Else///Вводится целое число n (0 < n < 1000).
// Определите, является ли оно двузначным? Выведите в ответ "Yes"/"No".

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x>9 & x<100){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
