package collection;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String name = "GGiriraaaj";
        char[] arr = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);

            }
        }
        System.out.println(map);
        /*int minValue=0;
        for(int i=0;i<name.length();i++){
            if((map.get(arr[i])>minValue)){
                minValue=map.get(arr[i]);
            }
        }
        for(Map.Entry<Character,Integer>m:map.entrySet()){
            if(m.getValue()==minValue){
                System.out.println("This is the max value....");
                System.out.println(m.getKey());
            }*/

        int minValue = 1;

        for (int i = name.length() - 1; i > 0; i--) {
            if ((map.get(arr[i]) < minValue)) {
                minValue = map.get(arr[i]);
            }
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == minValue) {
                System.out.println("This is the min value....");
                System.out.println(m.getKey());
            }

        }
    }
}
