package StudentClass;

import PersonClass.Person;
import java.util.Random;

public class Student extends Person {
    private int registration;
    private String course;
    private float priceCourse;
    public Student(String name, int age, char sex, String course, float priceCourse) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setRegistration();
        this.setCourse(course);
        this.setPriceCourse(priceCourse);
    }

    public void setPriceCourse(float price) {
        this.priceCourse = price;
    }

    public float getPriceCourse() {
        return this.priceCourse;
    }

    public void setRegistration() {
        this.registration = new Random().hashCode();
    }

    public int getRegistration() {
        return this.registration;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    public void payCourse() {
        System.out.printf("O aluno %s pagou a mensalidade no valor de R$ %f", 
        this.getName(), 
        this.getPriceCourse());
    }

    @Override
    public void status() {
        System.out.println("==== Status da Pessoa ====");
        System.out.println("Nome: " + this.getName());
        System.out.println("Idade: " + this.getAge());
        System.out.println("Sexo: " + this.getSex());
        System.out.println("Matricula: " + this.getRegistration());
        System.out.println("Curso: " + this.getCourse());
        System.out.println("======================");
    }
}
