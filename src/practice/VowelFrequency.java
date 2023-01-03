package practice;

import java.util.Locale;
import java.util.Scanner;

public class VowelFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your statement::");
        String str = sc.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        str = str.toLowerCase();
        for (int j = 0; j < str.length(); ++j) {
            char ch = str.charAt(j);
            if (ch == 'a') {
                ++a;
            } else if (ch == 'e') {
                ++e;

            } else if (ch == 'i') {
                ++i;
            } else if (ch == 'o') {
                ++o;
            } else if (ch == 'u') {
                ++u;
            }
        }
            System.out.println(".........Vowels Frequency........");
            System.out.println("a-->"+a);
            System.out.println("e-->"+e);
            System.out.println("i-->"+i);
            System.out.println("o-->"+o);
            System.out.println("u-->"+u);
        }

    }
