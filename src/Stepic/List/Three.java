package Stepic.List;

import java.util.ArrayList;

public class Three {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Hey!");
        myArrayList.add("This");
        myArrayList.add("is");
        myArrayList.add("my");
        myArrayList.add("first");
        myArrayList.add("list!");

        for (String s : myArrayList) {
            System.out.println(s);
        }
    }
}
