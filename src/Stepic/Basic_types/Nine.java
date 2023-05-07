package Stepic.Basic_types;//ВАЛЛ-И, катаясь на лифте, заметил, что между двумя соседними этажами он проезжает за t  секунд.
// Составьте программу, помогающую ВАЛЛ-И рассчитать, за сколько секунд он поднимется на этаж с номером n.


import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int end = (t*n)-t;
        System.out.println(end);
    }
}
