package PersonClass;

public abstract class Person {
    private String name;
    private int age;
    private char sex;
    
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

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return this.sex;
    }

    public final void bithDay() {
        this.age++;
    }

    public void status() {
        System.out.println("==== Status da Pessoa ====");
        System.out.println("Nome: " + this.getName());
        System.out.println("Idade: " + this.getAge());
        System.out.println("Sexo: " + this.getSex());
        System.out.println("======================");
    }
}
