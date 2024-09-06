package Fabrica;

public class Administrativo extends Funcionario {
    private String setor;

    public Administrativo(String nome, int cpf, int rg, int registroFuncionario, String setor) {
        super(nome, cpf, rg, registroFuncionario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
