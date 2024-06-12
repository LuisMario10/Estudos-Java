package StudentClass;

import PersonClass.Person;
import java.util.Random;

public class Student extends Person {
    private int id;

    public Student(String name, int age) {
        this.setId();
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    private void setId() {
        Random rd = new Random();
        this.id = rd.hashCode();
    } 

    public int getId() {
        return this.id;
    }

    public void status() {
        System.out.println("------- Status --------");
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println("--------------------");
    }
}
