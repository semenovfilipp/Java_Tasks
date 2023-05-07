package Stepic.Static;
//Допишите функцию my_first_function, которая выводит на экран три строчки "Hello world!".
// Напишите так же функцию my_second_function, которая выведет на экран одну строку: "Java the best!".
// Содержание функции main менять запрещено.


public class One {
    public static void my_first_function (){
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }
    public static void my_second_function (){
        System.out.println("Java the best!");
        System.out.println("Java the best!");
    }
    public static void main (String [] args){
        my_first_function();
        my_second_function();
    }
}
