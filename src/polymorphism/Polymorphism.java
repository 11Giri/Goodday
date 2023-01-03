package polymorphism;
class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet...");
    }
}
class Robin extends  Bird{
public void sing(String song){
    System.out.println("tweeeeeeeeeeeeeeeeeeeee..");
}
}
class Pelican extends Bird{
public  void sing(){
    System.out.println("Kawwakkee....khahah....");
}
}
public class Polymorphism {
    public static void main(String[] args) {
Robin p=new Robin();
p.sing();
    }
}
