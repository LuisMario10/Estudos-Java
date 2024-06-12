package myclasses;

import myinterfaces.Modify;
import myinterfaces.Modify2;

public class Fiat extends Car implements Modify, Modify2 {
    private String name;

    public Fiat(String name, String color, int doors, boolean isRunning) {
        setName(name);
        setColor(color);
        setDoors(doors);
        setRunning(isRunning);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void status() {
        System.out.println("========== Status Car ===========");
        System.out.println("Nome: " + getName());
        System.out.println("Cor: " + getColor());
        System.out.println("Doors: " + getDoors());
        System.out.println("Esta Andando: " + isRunning());
        System.out.println("=======================================");
    }

    @Override
    public void openTurbo() {
        System.out.println("Tubo Ativado!!!!!");
    }

    @Override
    public void openSunroof() {
        System.out.println("Abrindo Teto Solar...");
    }


    @Override
    public void pintArtInCar(String draw) {
        System.out.println("Pintando no carro um: " + draw);
    }

    @Override
    public void putGasoline() {
        System.out.println("Pondo gasosa!");
    }
}
