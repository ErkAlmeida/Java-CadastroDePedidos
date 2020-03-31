package entidades;

public class Produto 
{
	private String nome;
	private Double preco;

	//private OrdemItem orderItem;

	public Produto() {

	}

	public Produto(String nome, Double preco) {

		this.nome = nome;
		this.preco = preco;
		//this.orderItem = orderItem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	/*public OrdemItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrdemItem orderItem) {
		this.orderItem = orderItem;
	}*/

}
