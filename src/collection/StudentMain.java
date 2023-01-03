package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student(1,"Rohan","219Patchen");
        Student student2=new Student(2,"Mohan","Hays");
        Student student3=new Student(3,"Hoje","Taxes");
        Student student4=new Student(4,"Nathen","wasentanDc");
        ArrayList<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(list);
        for(Student st:list){
            System.out.println(st);
            System.out.println(list.contains(student1));
            System.out.println(list.isEmpty());
        }
    }
}
