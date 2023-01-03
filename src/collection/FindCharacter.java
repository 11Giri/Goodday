package collection;

import java.util.HashMap;
import java.util.Map;

public class FindCharacter {
    public static void main(String[] args) {


        HashMap<Character, Integer> map = new HashMap<>();
        String name = "Girirajii";
        char[] arr = name.toCharArray();
for(int i=0;i<name.length();i++){
    if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i])+1);
    }else{
        map.put(arr[i],1);
    }
   // System.out.println(map);
}
        System.out.println(map);
int maxValue=0;
for(int i=0;i<name.length();i++) {
    if(map.get(arr[i])>maxValue) {
        maxValue = map.get(arr[i]);

    }
    }
    for(Map.Entry<Character,Integer>m:map.entrySet()){
        if(m.getValue()==maxValue){
            System.out.println("This is the max Value...");
            System.out.println(m.getKey());
        }

    }

        }
    }
