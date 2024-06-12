// Polimorfismo com sobrecarga

import PersonGame.Hero;
public class Game {
    public static void main(String[] args) {
        Hero h = new Hero("Goku", 1450.5f, true, 1000);
        h.attack();
        h.attack(5.6f);
        h.attack(12000, 50);
        h.status();
    }
}