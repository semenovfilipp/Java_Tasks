package Stepic.Data_types;// Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час.
// На какой отметке он остановится через t часов?
////Программа получает на вход значения v и t.
// Если v>0, то Вася движется в положительном направлении по МКАД, если же значение v<0, то в отрицательном.
////Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int s = v * t;
        System.out.print((s + 109) % 109);
    }
}