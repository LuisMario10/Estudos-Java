public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal("Gato", "Meow", false);
        gato.falar();
    }
}

class Animal {
    public String especie;
    public boolean eleVoa;
    public String onomatopeia;
    
    public Animal(String especie, String onomatopeia, boolean eleVoa) {
        this.especie = especie;
        this.eleVoa = eleVoa;
        this.onomatopeia = onomatopeia;
    }

    public void falar() {
        System.out.println("O " + this.especie + " fez " + this.onomatopeia);
    }
}
