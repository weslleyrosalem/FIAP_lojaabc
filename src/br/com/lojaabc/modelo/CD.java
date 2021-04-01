package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoProduto;

public class CD extends Produto implements PadraoProduto{
	private String artista;
	private boolean lancamento;
	
	public CD() {
		super();
	}

	public CD(int i, String descricao, float valorCompra, float valorVenda, String artista, boolean lancamento) {
		super(i, descricao, valorCompra, valorVenda);
		this.artista = artista;
		this.lancamento = lancamento;
	}
	
	public void setAll(int i, String descricao, float valorCompra, float valorVenda, String artista, boolean lancamento) {
		this.artista = artista;
		this.lancamento = lancamento;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}

	@Override
	public String toString() {
		return "CD [artista=" + artista + ", lancamento=" + lancamento + "]";
	}
	
	public void calcularValorVenda() {
		super.setValorVenda(super.getValorCompra() * (float) 1.1 );
	}
	
	public void calcularDesconto() {
		if (lancamento = true) {
			super.setValorVenda(super.getValorCompra() * (float) 0.95 );
		}
	}
	

}
