package practice;

import java.util.Scanner;

public class PalinDrome {
    static void checkPalindrome(String input){
        boolean re=true;
        int length=input.length();
        for(int i=0; i<length/2;i++){
            if(input.charAt(i)!=input.charAt(length-i-1)){
                re=false;
                break;
            }
        }
        System.out.println(input+" is palindrome="+re);

    }

    public static void main(String[] args) {
//        String  str= "mam";
//
//        PalinDrome p= new PalinDrome();
//checkPalindrome(str);S
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Statement;;");
        String str=sc.nextLine();
        checkPalindrome(str);

    }
}
