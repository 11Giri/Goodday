package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NonReapating {
    public  static void addElement(Integer []integerArr,int data,int pos){
        System.out.println("Intial array.."+ Arrays.toString(integerArr));
        List<Integer>integerList=new ArrayList<>(Arrays.asList(integerArr));
        integerList.add(pos ,data);
        integerArr= integerList.toArray(integerArr);
        System.out.println("elemet::"+data+"Added ta a position ::"+pos+"Final array:::"+Arrays.toString(integerArr));
    }
    public static void main(String[] args) {
        Integer[]arr={1,2,3,4,5,6,10,2,2,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position that you wanted to insert the data:::");
        int pos=sc.nextInt();
        System.out.println("Enter the data you want to store:::");
        int data=sc.nextInt();
        addElement(arr,data,pos);

    }
}