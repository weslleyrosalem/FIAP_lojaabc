package br.com.lojaabc.modelo;

public class Venda {
	private int notaFiscal;
	private String data;
	private Produto produto;
	private Cliente cliente;
	
	public Venda() {
		super();
	}

	public Venda(int notaFiscal, String data, Produto produto, Cliente cliente) {
		super();
		this.notaFiscal = notaFiscal;
		this.data = data;
		this.produto = produto;
		this.cliente = cliente;
	}
	
	public void setAll(int notaFiscal, String data, Produto produto, Cliente cliente) {
		this.notaFiscal = notaFiscal;
		this.data = data;
		this.produto = produto;
		this.cliente = cliente;
	}
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venda [notaFiscal=" + notaFiscal + ", data=" + data + ", produto=" + produto + ", cliente=" + cliente
				+ "]";
	}	

}
