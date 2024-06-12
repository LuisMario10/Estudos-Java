import myclasses.Fiat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fiat f = new Fiat("UNO", "Branco", 3, true);
        f.status();
        f.openSunroof();
        f.openTurbo();
        f.pintArtInCar("Dragão");
        f.putGasoline();
    }
}