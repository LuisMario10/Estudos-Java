package Enums;

public enum DecisionEnum {
    CADASTRAR(1),
    VER_PERFIL(2),
    ATUALIZAR_CONTA(3),
    DELETAR_CONTA(4);

    private int decision;
    private DecisionEnum(int decision) {
        setDecision(decision);
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    public int getDecision() {
        return decision;
    }

}
