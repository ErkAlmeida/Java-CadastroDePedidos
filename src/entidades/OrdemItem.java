package entidades;

public class OrdemItem 
{
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;

	public OrdemItem() {

	}

	public OrdemItem(Integer quantidade, Double preco ,Produto produto) {

		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public Produto setProduto() {
		return this.produto;
	}
	
	public Double subTotal(Integer quantidade, Double preco) {
		return quantidade * preco;
	}


}
