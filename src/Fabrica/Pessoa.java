package Fabrica;

public class Pessoa {
    private String nome;
	private int cpf; 
    private int rg;

    public Pessoa() {
    }

    public Pessoa(String nome, int cpf, int rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
}
