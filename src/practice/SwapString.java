package practice;

import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String...");
        String str1=sc.nextLine();
        System.out.println("Enter the Second Line String...");
        String str2=sc.nextLine();
        System.out.println("Before swap: "+str1+" "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After : "+str1+" "+str2);

    }
}
