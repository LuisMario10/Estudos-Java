public class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular();
        meuCelular.modelo = "Samsung";
        meuCelular.anoFabricado = 2016;
        meuCelular.numero = "94002-8922";
        meuCelular.selfie();
        meuCelular.chamada(false);
    }
}

class Celular {
    public String modelo;
    public int anoFabricado;
    private String senha;
    private boolean ligado;
    private boolean emLigacao;
    protected String numero;
    protected String chip;

    protected void chamada(boolean ligacaoStatus) {
        if(ligacaoStatus == true) {
            this.emLigacao = true;
        } else {
            this.emLigacao = false;
        }
    }

    public void selfie() {
        System.out.println("Diga X...");
    }

    private void acessarBancoDigita() {
        float contaBancaria = 10.2f;
        return contaBancaria;
    }
}
