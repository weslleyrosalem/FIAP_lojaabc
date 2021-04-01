package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoProduto;

public class Livro extends Produto implements PadraoProduto{
	private Autor autor;
	private int isbn;
	private String editora;
	
	
	public Livro() {
		super();
	}
	public Livro(int i, String descricao, float valorCompra, float valorVenda, Autor autor, int isbn, String editora) {
		super(i, descricao, valorCompra, valorVenda);
		this.autor = autor;
		this.isbn = isbn;
		this.editora = editora;
	}
	
	public void setAll(int i, String descricao, float valorCompra, float valorVenda, Autor autor, int isbn, String editora) {
		this.autor = autor;
		this.isbn = isbn;
		this.editora = editora;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", isbn=" + isbn + ", editora=" + editora + "]";
	}
	
	public void calcularValorVenda() {
		super.setValorVenda(super.getValorCompra() * (float) 1.08);
	}
	

}
