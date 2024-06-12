public class Person {
    private String name;
    private String category;
    private int victory;
    private int draws;
    private int loses;

    public Person(String name, String category) {
        this.setName(name);
        this.setCategoty(category);
        this.victory = 0;
        this.draws = 0;
        this.loses = 0;
    }

    public void show() {
        System.out.println("--- Apresentando ---");
        System.out.println("Nome: " + this.getName());
        System.out.println("Categoria: " + this.getCategoty());
        System.out.println("Vitorias: " + this.getVictory());
        System.out.println("Vitorias: " + this.getDraws());
        System.out.println("Vitorias: " + this.getLoses());
        System.out.println("------------------");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCategoty(String category) {
        this.category = category;
    }

    public String getCategoty() {
        return this.category;
    }

    public void win() {
        this.victory++;
    }

    public int getVictory() {
        return this.victory;
    }

    public void draw() {
        this.draws++;
    }

    public int getDraws() {
        return this.draws;
    }

    public void lose() {
        this.loses++;
    }

    public int getLoses() {
        return this.loses;
    }
}
