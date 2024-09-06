package Fabrica;

public class Funcionario extends Pessoa {
    private int registroFuncionario;

    public Funcionario(String nome, int cpf, int rg, int registroFuncionario) {
        super(nome, cpf, rg);
        this.registroFuncionario = registroFuncionario;
    }

    public int getRegistroFuncionario() {
        return registroFuncionario;
    }

    public void setRegistroFuncionario(int registroFuncionario) {
        this.registroFuncionario = registroFuncionario;
    }

    public void calcularSalario() {

    }

    public void registrarPonto() {

    }
}