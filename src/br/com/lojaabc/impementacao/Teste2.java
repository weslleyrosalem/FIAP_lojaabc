package br.com.lojaabc.impementacao;

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha; //2
		
		escolha = Magica.i("Digite 1 para Pessoa Fisica, ou 2 para Pessoa Juridica"); //4
		Cliente cliente = new Cliente();
		
		if (escolha == 1) {
			cliente = new PessoaFisica(
					Magica.s("Digite o nome da pessoa"),
					Magica.s("Digite o email"),
					Magica.s("Digite o telefone"),
					Magica.s("Digite o CPF"),
					Magica.s("Digite o RG"));
			System.out.println("Os dados digitados da pessoa fisica foram: " + cliente.toString());
		} else
			if (escolha ==2) {
				cliente = new PessoaJuridica(
				Magica.s("Digite o nome da empresa"),
				Magica.s("Digite o email da empresa"),
				Magica.s("Digite o telefona da empresa"),
				Magica.s("Digite o CNPJ"),
				Magica.s("Digite o CNAE")
				);
				System.out.println("Os dados digitados da empresa foram: " + cliente.toString());
			}else {
				System.out.println("Opção invalida :/");
			}
		//System.out.println(cliente.toString());
		System.out.println(cliente.getNome());
		System.out.println(cliente.exibirDocumentacoes());
		
		
	}

}
