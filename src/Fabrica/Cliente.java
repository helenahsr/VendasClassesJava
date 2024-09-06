package Fabrica;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private int registroCliente;
    private String dataCadastro;

    public Cliente(String nome, int cpf, int rg, int registroCliente, String dataCadastro) {
        super(nome, cpf, rg);
        this.registroCliente = registroCliente;
        this.dataCadastro = dataCadastro;
    }

    public int getRegistroCliente() {
        return registroCliente;
    }

    public void setRegistroCliente(int registroCliente) {
        this.registroCliente = registroCliente;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int totalDeCompras() {
        List<Double> compras = new ArrayList<>();
        double total = 0;
        for (double compra : compras) {
            total += compra;
        }
        return (int) total;
    }

    public void formasPagamento() {
        System.out.println("Formas de pagamento disponíveis:");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão de crédito");
        System.out.println("3. Pix");
    }
}
