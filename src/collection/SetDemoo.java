package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemoo {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        try {
            set.add("Test");
            set.add("cheek");
            set.add("Ganga");
            set.add("test1");
            System.out.println(set);
            Set<String> findSet = set.stream().filter(obj -> obj.startsWith("T")).collect(Collectors.toSet());
            System.out.println(findSet);
        }catch (Exception e){
            System.out.println(e);

        }

    }
}
