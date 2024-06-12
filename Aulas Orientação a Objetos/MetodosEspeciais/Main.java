public class Main {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Luis", 18);
        System.out.println(eu.getNome());
        System.out.println(eu.getIdade());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public void setNome(String nome) {
        if(nome == "") {
            System.out.println("Nome nao pode ser vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
}