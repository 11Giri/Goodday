package polymorphism;

 class Animal {
    public void move() {
        System.out.println("Animal can move...");
    }
        public void eat(){
            System.out.println("animal Eaet grassss...");
        }
    }

class Dog extends Animal{
    public  void move(){
        System.out.println("Dog can walk and run...");
    }
    public void eat(String e){
        System.out.println("Dog eat meat.....");
        e="eat meet";
    }
}
  class TestDog{
    public static void main(String []args){
        Animal a=new Animal();//Animal reference and object
        Animal a1=new Dog();//Animal reference but Dog object

        a.move();
        a1.move();
        a.eat();

    }
}