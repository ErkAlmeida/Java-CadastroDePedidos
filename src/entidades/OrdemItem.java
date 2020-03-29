package entidades;

public class OrdemItem 
{
	private Integer quantidade;
	private Double preco;
		
	
	public OrdemItem() 
	{

	}
	
	public OrdemItem(Integer quantidade, Double preco) {
	
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
	

	public Double subTotal(Integer quantidade, Double preco)
	{
		return quantidade * preco;
	}
	
}
