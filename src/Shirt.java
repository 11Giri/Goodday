public class Shirt {
    public static String color;
    public static char size;
    Shirt(){
        System.out.println("This is the constructor");
    }
    Shirt(String color,char size){
     this.color=color;
      this.size=size;
    }
    public  void putOn(){
        System.out.println("Short is On!!");
    }
    public  void takeOff(){
        System.out.println("Shirt Take Off");
    }
    public static  void setColor(String newColor){
        color=newColor;
    }
    public static  void setSize(char newSize){
        size=newSize;
    }
}
