public class Personagem implements Controles {
    private String nome;
    private float nivelForca;

    public Personagem(String nome, float nivelForca) {
        this.setNome(nome);
        this.setNivelForca(nivelForca);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNivelForca() {
        return this.nivelForca;
    }

    public void setNivelForca(float nivelForca) {
        this.nivelForca = nivelForca;
    }

    public void pular() {
        System.out.println("Pulando");
    }

    public void mover() {
        System.out.println("Movendo");
    }
}
