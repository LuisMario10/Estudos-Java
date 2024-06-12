package models;

import database.ConnectionDataBase;

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String password;

    public UserModel(String name, String email, String password) {
        this.setId();
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = new ConnectionDataBase().autoIncrementId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void status() {
        System.out.println("=-=-=-=- Dados do Usuario =-=-=-=-=");
        System.out.println("Indice: " + this.getId());
        System.out.println("Nome: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("\n\n");
    }
}
