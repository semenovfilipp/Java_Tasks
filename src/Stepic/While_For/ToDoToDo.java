package Stepic.While_For;//Маша занималась обработкой больших и не очень больших данных.
// На её компьютер время от времени приходили числа и она хотела понять,
// каких больше: кратных 3, или отрицательных.
// Помогите Маше с её вопросом.
//Вводятся целые числа до тех пор, пока не будет введён 0.
//Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел, то выведите "negative", если их одинаковое количество, то выведите "Equal".


import java.util.Scanner;

public class ToDoToDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countPositive = 0;
        int countNegative = 0;

        for (int i = n;i!=0;i = sc.nextInt()){
            if (i>0 & i/3==0){
                countPositive++;
            }else if(i<0 ){
                countNegative++;
            }
        }if (countPositive>countNegative){
            System.out.println("333");
        }else if (countPositive==countNegative){
            System.out.println("Equal");
        }else{
            System.out.println("negative");
        }
    }
}
