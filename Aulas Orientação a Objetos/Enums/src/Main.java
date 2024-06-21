import Enums.DecisionEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecisionEnum d = null;
        System.out.println("Insita uma escolha (1) Cadastrar | (2) Ver Conta | (3) Atualizar conta | (4) Deletar conta");
        int decision = s.nextInt();
        d.setDecision(decision);
        switch(d.getDecision()) {
            case 1:
                System.out.println("Voce foi cadastrado!");
                break;
            case 2:
                System.out.printf("Sua Conta:\nid = 1\nnome = Luis Mario\nemail = luis@email.com");
                break;
            case 3:
                System.out.println("Conta foi atualizada");
                break;
            case 4:
                System.out.println("Conta foi deleta!");
                break;
        }
    }
}