package Fabrica;

public class Fidelidade extends Cliente {
 private int pontos;

 public Fidelidade(String nome, int cpf, int rg, int registroCliente, String dataCadastro, int pontos) {
     super(nome, cpf, rg, registroCliente, dataCadastro);
     this.pontos = pontos;
 }

 public int getPontos() {
     return pontos;
 }

 public void setPontos(int pontos) {
     this.pontos = pontos;
 }

 public void formasPagamento() {
     System.out.println("Formas de pagamento para clientes Fidelidade: Dinheiro, Cartão, Pontos");
 }
}

