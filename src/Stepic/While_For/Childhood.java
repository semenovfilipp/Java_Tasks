package Stepic.While_For;//Для постановки Сказки красная шапочка в детском саду
// "Солнышко" было решено выбрать самого маленького по росту ребёнка на роль красной шапочки и самого большого на роль волка.
//На вход программе даётся число n, затем 2*n  строк.
// Каждая пара строк - Имя ребёнка и его рост.
// Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка, который будет играть волка.
// Если детей одного наименьшего или наибольшего роста несколько, то выберите первого из встретившихся.
// Гарантируется, что все имена различны и есть минимум 1 ребёнок.

import java.util.Scanner;

public class Childhood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String maxName = sc.next();
        int maxAge = sc.nextInt();
        ///
        String minName = maxName;
        int minAge = maxAge;

        for (int i = 2;i<=n;i++){
            String name = sc.next();
            int age = sc.nextInt();

            if (age>maxAge){
                maxAge = age;
                maxName = name;
            }else if (age<=maxAge){
                minAge = age;
                minName = name;
            }
        }
        System.out.println(minName + "\n" + maxName);
    }
}
