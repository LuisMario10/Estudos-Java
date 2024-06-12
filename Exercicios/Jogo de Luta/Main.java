public class Main {
    public static void main(String[] args) {
        Person personagem = new Person("Goku", "Lutador de Artes Marciais");
        Person vilao = new Person("Kami", "Lutador de Artes Marciais");
        Combat luta = new Combat(personagem, vilao);
        luta.fight(personagem, vilao, 3);
        luta.fight(personagem, vilao, 1);
        luta.fight(personagem, vilao, 2);
        luta.fight(personagem, vilao, 1);
    }
}
