package practice;

import java.util.Scanner;

public class UpperCae {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence here::");
        String str=sc.nextLine();
        String upperCase=" ";
        //this is for the new line which is generated after conversion
        Scanner strscan=new Scanner(str);
        while(strscan.hasNext()){
            String word=strscan.next();
            upperCase+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        //print orginal line with output'
        System.out.println("Original sentanceIs::"+str);
        System.out.println("Sentence after convert:::"+upperCase.trim());
    }
}
