package br.com.lojaabc.modelo;

public class Produto {
	private int i; //i = ID
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	
	
	
	public Produto() {
		super();
	}

	public Produto(int i, String descricao, float valorCompra, float valorVenda) {
		super();
		this.i = i;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	
	public void setAll(int i, String descricao, float valorCompra, float valorVenda) {
		this.i = i;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public String toString() {
		return "Produto [i=" + i + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + "]";
	}
	
	
	

}
