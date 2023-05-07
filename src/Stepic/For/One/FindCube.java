package Stepic.For.One;
///Пользователь вводит слова до тех пор, пока не введёт "СТОП".
// Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом". Слова-паразиты не считаются нормальными словами.
//Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите, каким по счёту нормальным словом оно было введено.
// В противном случае выведите на экран слово "NO".

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = false;
        for (String n = sc.nextLine(); !n.equals("СТОП"); n = sc.nextLine()){
            if (!n.equals("ээээ") && !n.equals("потом")){
                if (n.equals("Куб")){
                    flag = true;
                    break;
                }else{
                    count ++;
                }
            }
        }
        if (flag){
            System.out.print(count + 1);
        }else{
            System.out.print("NO");
        }
    }
}