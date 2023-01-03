package parcticeSum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumDemo {

    static int arr[]={12,3,4,15};
    static  int sumTotal(){
        int sum=0;
        int i;
        for(i=0;i<arr.length;i++) {
            sum += arr[i];
        }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println("sum of given array is.."+sumTotal());
        int a[]={10,20,30,40,50};
        int sum1= IntStream.of(a).sum();
        System.out.println("The sum is "+sum1);
        int sum2= Arrays.stream(a).sum();
        System.out.println(sum2);
    }
    }
