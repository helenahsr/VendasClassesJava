package Fabrica;

public class Vendedor extends Funcionario {
	private int tipoVendedor;
    private int totalVendas;

    public Vendedor(String nome, int cpf, int rg, int registroFuncionario, int tipoVendedor, int totalVendas) {
        super(nome, cpf, rg, registroFuncionario);
        this.tipoVendedor = tipoVendedor;
        this.totalVendas = totalVendas;
    }

    public int getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(int tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double calcularComissao() {
        return 0.0;
    }
}
