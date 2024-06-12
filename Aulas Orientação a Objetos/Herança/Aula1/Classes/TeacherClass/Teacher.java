package TeacherClass;

import PersonClass.Person;

public class Teacher extends Person {
    private float salary;

    public Teacher(String name, int age, float salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
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

    public float setSalary(float salary) {
        return this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public void status() {
        System.out.println("------- Status --------");
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getSalary());
        System.out.println("--------------------");
    }
}
