import models.UserModel;
import database.ConnectionDataBase;
import dao.UserDAO;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        UserDAO manager = new UserDAO();
        Scanner s = new Scanner(System.in);
        boolean isRunning = true;
        int decision;
        while(isRunning) {
            System.out.println("(1) Cadastrar | (2) Listar todos os usuario | (0) Sair do sistema");
            decision = s.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("insira seu nome: ");
                    String name = s.next();
                    System.out.println("Insira seu email: ");
                    String email = s.next();
                    System.out.println("Crie uma senha: ");
                    String password = s.next();
                    UserModel u = new UserModel(name, email, password);
                    manager.register(u);
                    break;
                case 2:
                    ArrayList<UserModel> datas = manager.getAll();
                    for(int i = 0; i < manager.databaseSize(); i++) {
                        datas.get(i).status();
                    }
                default:
                    System.out.println("Erro: valor invalido!");
                    isRunning = false;
                    break;
                    
            }
            System.out.println("Continuar: 0 sair || 1 continuar?: ");
            decision = s.nextInt();
        }
        s.close();
        System.out.println("Fechando programa...");
    }
}