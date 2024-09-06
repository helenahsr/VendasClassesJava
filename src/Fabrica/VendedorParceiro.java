package Fabrica;

public class VendedorParceiro extends Vendedor {
    private String parceiro;

    public VendedorParceiro(String nome, int cpf, int rg, int registroFuncionario, int tipoVendedor, int totalVendas, String parceiro) {
        super(nome, cpf, rg, registroFuncionario, tipoVendedor, totalVendas);
        this.parceiro = parceiro;
    }

    public String getParceiro() {
        return parceiro;
    }

    public void setParceiro(String parceiro) {
        this.parceiro = parceiro;
    }

    public void calculaComissao() {
    	
    }
}
