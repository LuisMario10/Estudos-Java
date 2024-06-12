package dao;

import database.ConnectionDataBase;
import models.UserModel;
import java.util.ArrayList;

public class UserDAO {
    ConnectionDataBase conn = new ConnectionDataBase();

    public boolean isValidationName(String name) {
        return name != null || name != " ";
    }

    public ArrayList<UserModel> getAll() {
        return conn.getAllUsers();
    }

    public int databaseSize() {
        return conn.databaseSizeNow();
    }

    public UserModel get(String name) {
        int indexUser = conn.getIndexUser(name);
        if(indexUser != -1) {
            return conn.getUser(name);
        }
        return null;
    }

    public void register(UserModel user) {
        if(this.isValidationName(user.getName())) {
            conn.registerUser(user);
        } else {
            System.err.println("Erro: Nome Nao pode ser vazio");   
        }
    }

    public void update(String beforeName, String newName) {
        int index = conn.getIndexUser(beforeName);
        conn.updateMetaData(newName);
    }
}
