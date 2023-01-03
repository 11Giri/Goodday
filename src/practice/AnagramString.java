package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    static boolean checkAnagram(String str1,String str2){
        if( str1.length()!=str2.length()){
            return  false;

        }
        char[]strArray1=str1.toCharArray();
        char[]strArray2=str2.toCharArray();
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        String sortedStr1=new String(strArray1);
        String sortedStr2=new String(strArray2);
        if(sortedStr1.equals(sortedStr2)){
            return  true;
        }
        else {
            return  false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string....");
        String str1=sc.next();
        System.out.println("Enter Second String;;;");
        String str2=sc.next();
        if(checkAnagram(str1,str2)){
            System.out.println("String are Anagram ");

        }
        else {
            System.out.println("String are not Anagram!!!");
        }
    }
}
