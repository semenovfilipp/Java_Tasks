package Stepic.Else_boolean;

import java.util.Scanner;

///Яша плавал в бассейне размером N×M метров и устал.
// В этот момент он обнаружил, что находится на расстоянии x метров от одного из длинных бортиков (не обязательно от ближайшего)
// и y метров от одного из коротких бортиков.
// Какое минимальное расстояние должен проплыть Яша, чтобы выбраться из бассейна на бортик?
////НЕКОРРЕКТНОЕ УСЛОВИЕ ЗАДАЧИ!!!
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = sc.nextInt();  // длинные
        int y = sc.nextInt(); // короткие
        if (x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
