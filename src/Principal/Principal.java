package Principal;

import java.time.LocalDate;

import Fabrica.Administrativo;
import Fabrica.Cliente;
import Fabrica.Fidelidade;
import Fabrica.Funcionario;
import Fabrica.Pessoa;
import Fabrica.Simples;
import Fabrica.Terceirizado;
import Fabrica.Vendedor;
import Fabrica.VendedorParceiro;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João", 123456789, 987654321);
		// Cliente cliente1 = new Cliente();
        // Vendedor vendedor1 = new Vendedor();
        
        // System.out.println(cliente1);
        // System.out.println(vendedor1.calcularComissao());
	}
}
