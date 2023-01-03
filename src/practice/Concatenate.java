package practice;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first String:;");
        String firstStr= sc.next();
        System.out.println("Enter the Second String::");
        String secondStr=sc.next();
        System.out.println("Result after concatenation:::");
        System.out.println(firstStr+" "+secondStr);
    }
}
