import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Insira o Numero de acesso com 8 digitos: ");
        Scanner scanner = new Scanner(System.in); 
 
// TODO: Inicialize um bloco try-catch para capturar exceções:
        try{
// TODO: Leia a entrada do usuário como uma string representando o número da conta:
          String numeroConta = scanner.next();
// TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
          if(verificarNumeroConta(numeroConta)) {
               System.out.println("Numero de conta valido."); 
          }
          
// Imprime que o número de conta é válido:

// TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
        } catch(IllegalArgumentException e) {
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.err.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos."); 
        } finally {
            scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static boolean verificarNumeroConta(String numeroConta) { 
// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
        if(numeroConta.length() == 8) {
            return true;
        }
        throw new IllegalArgumentException();
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
    }
}