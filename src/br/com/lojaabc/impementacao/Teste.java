package br.com.lojaabc.impementacao;

import java.util.Scanner; //1

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int escolha; //2
		
		escolha = Magica.i("Digite 1 para Pessoa Fisica, ou 2 para Pessoa Juridica"); //4
		
		if (escolha == 1) {
			PessoaFisica pf = new PessoaFisica(
					Magica.s("Digite o nome da pessoa"),
					Magica.s("Digite o email"),
					Magica.s("Digite o telefone"),
					Magica.s("Digite o CPF"),
					Magica.s("Digite o RG"));
			System.out.println("Os dados digitados da pessoa fisica foram: " + pf.toString());
		} else
			if (escolha ==2) {
				PessoaJuridica pj = new PessoaJuridica(
				Magica.s("Digite o nome da empresa"),
				Magica.s("Digite o email da empresa"),
				Magica.s("Digite o telefona da empresa"),
				Magica.s("Digite o CNPJ"),
				Magica.s("Digite o CNAE")
				);
				System.out.println("Os dados digitados da empresa foram: " + pj.toString());
			}else
				System.out.println("Opção invalida :/");
		
		
		//PessoaFisica pf = new PessoaFisica("Weslley", "wesley@apolocom", "(11) 12345-6789", "38805493899", "37957354-4");
		
		//PessoaJuridica pj = new PessoaJuridica("Digite o nome da empresa","Digite o email da empresa", "Digite o telefona da empresa", "Digite o CNPJ", "Digite o CNAE" );
		
		//pf.setAll("Weslley", "wesley@apolocom", "(11) 12345-6789", "38805493899", "37957354-4");
		
		

	}

}
