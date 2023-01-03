package practice;

public class JavaString {
    public static void main(String[] args) {
        //Intrened way or string literals
        //stored in string pool
        //str1 and str2 are reference variable pointing the same literal
        String str1="hello";
        String str2="hello";
        if( str1==str2){
            System.out.println("str1==str2");
        }else{
            System.out.println("str1!=str2");
        }
String str3=new String("hello");
        String str4=new String("hello");
if(str3==str4){
    System.out.println("str3==st4");
}else {
    System.out.println("str3!=str4");
    //conclusion : == will compare reference variable
    // i.e has code and not the real content i.e hello
    // how should we compare string >>
    if( str3.equals(str4)){
        System.out.println("str3 is equal to str4");
    }else{
        System.out.println("str3 is not equal str4");
    }
    //string method
    String str= "John, Jennie, Jim, Jack,Joe";
    System.out.println("str is"+str);
    int len=str.length();
    System.out.println("length of str is:"+len);
    System.out.println(str.charAt(0)+" !"+str.charAt(len-1));
   String s1= str.toUpperCase();
    System.out.println("str after uppercase:"+str);
    System.out.println("s1 is :"+s1);
    if(str.contains("Jim")){
        System.out.println("Jim is the string");
    }
    String s2=str.substring(5);
    System.out.println(" s2 is:"+s2);
    String s3= str.substring(6,10);
    System.out.println(s3);
    String s4=str.replace('J','K');
    System.out.println("s4 is: "+s4);
    char[]chArr= str.toCharArray();
    for(char ch:chArr){
        System.out.print(ch+" ");
    }
    System.out.println();
    String [] strArr=str.split(" ,");
    for(String s: strArr){
        System.out.println(s.trim());
    }
    //data during registration
    String email="jon@example.com";
    String phone="1234567890";
    String pass="password123";
    //Validate the data from User
    if(!email.isEmpty()){
        System.out.println("Email is availavle");
        if(!email.contains("@")&& !email.contains(".")){
            System.out.println("But ,email is not a valid Email");
        }else{
            System.out.println("Email is a valid one!!");
        }
    }else{
        System.out.println("Please Provide an email");
    }
  if(!phone.isEmpty()){
      System.out.println("Phone number is available");
      if(phone.length()!=10){
          System.out.println("Phone number is not a valid Number");
      }else{
          System.out.println("phone number is valid one");
      }

  }else{
      System.out.println("Please provide a phone number");
  }
  //String are Immutable
    String string=new String("Hellow");
  string.concat("world");//+operator
    System.out.println("String is :"+string);
//string Buffer is Mutable
    StringBuffer buffer= new StringBuffer("Hellow ");
    buffer.append(" world");
    System.out.println("buffer is : "+ buffer);
    //Run time polymorphism
    CharSequence cs=null;
    cs=new String("hello");
    cs=new StringBuffer("awesome");
    cs=new StringBuilder("Bye");
    System.out.println(cs);
}
    }
}
