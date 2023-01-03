package collection;

import java.util.*;

//The collection in java is a framework that provide an architecture to store  and manipulate the group of objects.
public class hashMapDemo {
    public static void main(String[] args) {

       HashMap m=new HashMap();
       m.put("kiran",700);
       m.put("Bable",600);
       m.put("Venket",200);
       m.put("humanda",500);
        System.out.println(m);
        System.out.println(m.put("chalen",1000));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        Iterator itr=s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry) itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if( m1.getKey().equals("humanda")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);

    }
}
