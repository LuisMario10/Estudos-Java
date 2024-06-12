package PersonGame;

public class Hero extends Person {
    public Hero(String name, float life, boolean isAlive, int strong) {
        super(name, life, isAlive, strong);
    }
    
    public void attack() {
        System.out.println("Basic attack!");
        System.out.println("Damage: " + this.getStrong());
    }

    public void attack(float multiply) {
        System.out.println("Super Attack");
        System.out.println("Damage: " + (this.getStrong() * multiply));
    }

    public void attack(float vilanAttack, float multiply) {
        float heroAttack = this.getStrong() * multiply;
        if(vilanAttack > heroAttack) {
            this.setIsAlive(false);
            System.out.println("O Heroi Morreu!");
        } else if(vilanAttack == heroAttack) {
            System.out.println("O Heroi empatou com o vilao");
        } else {
            this.setIsAlive(true);
            System.out.println("O Herou Ganhou e derrotou o vilao");
        }
    }
}
