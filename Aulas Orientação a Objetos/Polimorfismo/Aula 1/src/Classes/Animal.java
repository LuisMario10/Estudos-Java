package Classes;

public abstract class Animal {
    protected float weight;
    public int age; 
    public int bodyLimbs;

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setBodyLimbs(int bodyLimbs) {
        this.bodyLimbs = bodyLimbs;
    }

    public int getBodyLimbs() {
        return this.bodyLimbs;
    }

    public abstract void toWalk();
    public abstract void makeSound();
    public abstract void eating();
    public abstract void status();
    public final void bithDay() {
        this.age++;
    };
}
