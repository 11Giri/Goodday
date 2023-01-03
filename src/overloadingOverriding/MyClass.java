package overloadingOverriding;

public class MyClass {
    int height;
    MyClass(){
        System.out.println("Bricks");
        height=0;

    }
    MyClass(int i){
        System.out.println("Building new House that is "+i+"feet tall");
        height=i;
    }
    int  info(){
        System.out.println("House is .."+height+"feet tall");
        return  5;
    }

    void info(String s){
        System.out.println(s+":House is "+height+" feet tall");
    }
}
class MainClass{
    public static void main(String[] args) {
        MyClass t=new MyClass();
        t.info();
        t.info("Overloaded method...");
        new MyClass(200);
    }
}