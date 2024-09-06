package Fabrica;

public class Simples extends Cliente {
	 public Simples(String nome, int cpf, int rg, int registroCliente, String dataCadastro) {
	     super(nome, cpf, rg, registroCliente, dataCadastro);
	 }

	 public void formasPagamento() {
	     System.out.println("Formas de pagamento para clientes Simples: Dinheiro, Cartão");
	 }
}