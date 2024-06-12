package Classes;

public class Mammal extends Animal {
    protected String furColor;

    public Mammal(float weight, int age, int bodyLimbs, String furColor) {
        this.setWeight(weight);
        this.setAge(age);
        this.setBodyLimbs(bodyLimbs);
        this.setFurColor(furColor);
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return this.furColor;
    }

    @Override
    public void toWalk() {
        System.out.println("Correndo");
    }

    @Override
    public void makeSound() {
        System.out.println("Emitindo som");
    }

    @Override
    public void eating() {
        System.out.println("Comendo");
    }

    @Override
    public void status() {
        System.out.println("===== Animal ======");
        System.out.println(this.getWeight());
        System.out.println(this.getBodyLimbs());
        System.out.println(this.getAge());
        System.out.println(this.getFurColor());
        System.out.println("=======================");
    }
}

