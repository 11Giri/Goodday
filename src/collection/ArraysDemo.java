package collection;

import java.util.ArrayList;

public class ArraysDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rajavi");
        list.add("pandit");
        list.add("naryan");
        list.add(1,"ganga");
        System.out.println(list.contains("Rajavi"));
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.get(2));
        for(String s:list){
            System.out.println(s);
        }

    }
}
