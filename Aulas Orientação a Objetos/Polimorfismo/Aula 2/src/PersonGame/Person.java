package PersonGame;

public abstract class Person {
    protected String name;
    protected float life;
    protected boolean isAlive;
    protected int strong;

    public Person(String name, float life, boolean isAlive, int strong) {
        this.setName(name);
        this.setLife(life);
        this.setIsAlive(isAlive);
        this.setStrong(strong);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public void status() {
        System.out.println("====== Status person " + this.getName() +  " ======");
        System.out.println("life: " + this.getLife());
        System.out.println("is Alive: " + this.isAlive());
        System.out.println("Strong: " + this.getStrong());
        System.out.println("=========================================");
    }
}