package practice;

public class ImmutableString {
    public static void main(String[] args) {
        String s1= "Edureka";//java String created in pool and  reference assigned to s1
        String s2=s1;// s2 is also having the same reference to " Java" in the pool
        System.out.println(s1==s2);//proff that s1 and s2 have same  reference
        s1="Learning";
        //s1 value got changed above, so how String is immutable?
        //well , in above case a new string "" got created in pool
        // s1 is now reference to the new String in the pool
        //But , the original String :ing Java" is still unchange and remains in the pool
        //s2 is still reference to the original String "java" in the pool
        //Proof that s1 and s2 have difference reference
        System.out.println(s1==s2);
        System.out.println(s1);
        //prints "java " supporting the fact that original string value unchange hence
    }
}
