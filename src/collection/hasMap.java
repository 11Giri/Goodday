package collection;

import java.util.HashMap;
import java.util.Map;

public class hasMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"depika");
        map.put(2,"elonana");
        map.put(3,"william");
        map.put(null,null);
        map.putIfAbsent(5,"Sabita");
        System.out.println(map);
        for(Map.Entry<Integer,String>m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println(map.get(5));

        System.out.println(map.clone());
        HashMap<Integer,String>map1=new HashMap<>();
       // map1=(HashMap<Integer, String>) map.clone();
        map1.putAll(map);

      //  System.out.println(map1);
    }
}
