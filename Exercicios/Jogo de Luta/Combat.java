import java.util.Random;

public class Combat {
    private int id;
    private Person challenged;
    private Person challenger;
    private boolean isApproved;

    public Combat(Person challenged, Person challenger) {
        this.setId();
        this.setChallenged(challenged);
        this.setChallenger(challenger);
    }

    private void setId() {
        this.id = new Random().hashCode();
    }  

    public void setChallenged(Person challenged) {
        this.challenged = challenged;
    }

    public Person getChallenged() {
        return this.challenged;
    }

    public void setChallenger(Person challenger) {
        this.challenger = challenger;
    }

    public Person setChallenger() {
        return this.challenger;
    }

    public boolean isApproved(Person fighter1, Person fighter2) {
        return (fighter1.getCategoty() == fighter2.getCategoty());
    }

    public void fight(Person fighter1, Person fighter2, int result) {
        if(this.isApproved(fighter1, fighter2)) {
            fighter1.show();
            fighter2.show();
            switch (result) {
                case 1:
                    System.out.println("O Ganhador é: " + fighter1.getName());
                    fighter1.win();
                    fighter2.lose();
                    break;
                case 2:
                    System.out.println("O Ganhador é: " + fighter2.getName());
                    fighter1.lose();
                    fighter2.win();
                    break;
                case 3:
                    System.out.println("Empate!");
                    fighter1.draw();
                    fighter2.draw();
                    break;
                default:
                    System.out.println("Luta cancelada por resultado invlido!");
                    break;
            }
        } else {
            System.out.println("Luta invalida");
        }
    }
}
