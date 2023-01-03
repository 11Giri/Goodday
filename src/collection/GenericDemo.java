package collection;

public class GenericDemo<T> {
    private T t;
    public void add(T t){
        this.t=t;

    }
    public  T get(){
        return  t;
    }
    public  void getArea(){

    }

    public static void main(String[] args) {
        GenericDemo <Integer> rectangle=new GenericDemo<>();
        GenericDemo<Double>circle=new GenericDemo<>();
        rectangle.add(10);
        circle.add(25.5);
        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}
