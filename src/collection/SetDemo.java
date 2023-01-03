package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Mohan");
        boolean rohan = set.add("Rohan");
        set.add("Rohan");
        set.add("Rohan");
        set.isEmpty();
        System.out.println(set.contains("hoje"));

        System.out.println(set);
        for(String s:set){
            System.out.println(s);
        }

    }

}
