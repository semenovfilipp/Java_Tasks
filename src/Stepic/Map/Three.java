package Stepic.Map;
///Вводится число n. Затем 2*n строк.
// Каждая пара строк - имя человека и его профессия.
// Определите, сотрудников какой профессии больше всего.
// Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились.
// Гарантируется, что будет введено не более 100 сотрудников.

import java.util.HashMap;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap <String, String> map = new HashMap<>();
        int countMax = 0;
        String jobMax = "";




        for (int i = 0;i < n;i++){
            String job = sc.next();
            String name = sc.next();
            if (map.containsKey(job)){
                map.put(job, map.get(job) + " " + name);
            }else{
                map.put(job,name);
            }
            if (map.get(job).split(" ").length > countMax){
                countMax = map.get(job).split(" ").length;
                jobMax = job;
            }
        }
        System.out.printf("%d\n%s\n%s", countMax, jobMax, String.join("\n", map.get(jobMax).split(" ")));
    }
}
