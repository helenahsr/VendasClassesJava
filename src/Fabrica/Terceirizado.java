package Fabrica;

public class Terceirizado extends Funcionario {
   private String empresa;

   public Terceirizado(String nome, int cpf, int rg, int registroFuncionario, String empresa) {
       super(nome, cpf, rg, registroFuncionario);
       this.empresa = empresa;
   }

   // Getters e Setters
   public String getEmpresa() {
       return empresa;
   }

   public void setEmpresa(String empresa) {
       this.empresa = empresa;
   }
}
