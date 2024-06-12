package database;

import java.util.ArrayList;
import models.UserModel;

public class ConnectionDataBase {
    private ArrayList<UserModel> DB;

    public ConnectionDataBase() {
        this.DB = new ArrayList<UserModel>();
    }

    public int databaseSizeNow() {
        return this.DB.size();
    }

    public int getIndexUser(String name) {
        for(int i = 0; i < this.DB.size(); i++) {
            if(this.DB.get(i).getName() == name) {
                return i;
            }
        }
        return -1;
    }

    public int autoIncrementId() {
        return this.DB.size() + 1;
    }

    public ArrayList<UserModel> getAllUsers() {
        return this.DB;
    }

    public UserModel getUser(String name) {
        int indexUser = this.getIndexUser(name);
        if(indexUser != -1) {
            return this.DB.get(indexUser);
        }
        return null;
    }

    public void registerUser(UserModel user) {
        this.DB.add(user);
    }

    public void updateMetaData(String name) {
        int indexUser = this.getIndexUser(name);
        if(indexUser == -1) {
            System.err.println("Erro: usuario nao encontrado!");
        } else {
            this.DB.get(this.getIndexUser(name)).setName(name);
            System.out.println("Mensage: Nome do usuario foi alterado!");
        }
    }
}
