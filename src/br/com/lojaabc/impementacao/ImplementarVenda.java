package br.com.lojaabc.impementacao;

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.Autor;
import br.com.lojaabc.modelo.CD;
import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.Livro;
import br.com.lojaabc.modelo.Produto;
import br.com.lojaabc.modelo.Venda;

public class ImplementarVenda {
	
	public static void main(String[] args) {
		
		int escolha;
		
		CD cd = new CD(1,"CD Racionais", 10, 20, "Racionais", true);
		System.out.println("######### Cadastro de CD: ######\n" + cd.toString() + "\n");
		
		Livro livro = new Livro(2, "Rapido e Devagar", 10, 20, new Autor("apolo", "apolo@"), 00102030, "Editora Vetores");
		System.out.println("######### Cadastro de Livro: ######\n" + livro.toString() + "\n");
		
		escolha = Magica.i("Digite 1 para comprar CD, ou 2 para comprar livro");
		
		if (escolha == 1) { 
			Venda venda = new Venda(
					Magica.i("Qual o numero da NF"),
					Magica.s("Qual a data da venda"),
					cd,
					new Cliente(
							Magica.s("Qual o nome do cliente"),
							Magica.s("Qual o email do cliente"),
							Magica.s("Qual o telefone do cliente")
							)
					);
			cd.calcularValorVenda();
			System.out.println("O valor atualizado da venda é: " + venda.getProduto().getValorVenda());
			
		}else if (escolha ==2 ) {
			Venda venda = new Venda(
					Magica.i("Qual o numero da NF"),
					Magica.s("Qual a data da venda"),
					livro,
					new Cliente(
							Magica.s("Qual o nome do cliente"),
							Magica.s("Qual o email do cliente"),
							Magica.s("Qual o telefone do cliente")
							)
					);
			livro.calcularValorVenda();
			System.out.println("O valor atualizado da venda é: " + venda.getProduto().getValorVenda());
			
		}else { 
			System.out.println("Opcao invalida");
		}
		
		
	}
	
}
