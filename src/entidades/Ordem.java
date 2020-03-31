package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.OrdemStatus;

public class Ordem 
{
	private Date momento;
	private OrdemStatus status;
	
	
	private Cliente cliente;
	
	List<OrdemItem> ordemItens = new ArrayList<>();

	public Ordem() {
	}

	public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getOrdemItem() {
		return ordemItens;
	}

	public void addItem(OrdemItem ordemItem) {
		ordemItens.add(ordemItem);
	}

	public void removeItem(OrdemItem ordemItem) {
		ordemItens.remove(ordemItem);
	}
	
	public Double total() 
	{
		double vTotal = 0;
		
		for(OrdemItem listItem: ordemItens) 
		{
			vTotal += listItem.getPreco()* listItem.getQuantidade();
		}
		
		return vTotal;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");

		sb.append("Resumo da Ordem #"+"\n\n");
		
		sb.append("Momento do Pedido:" + sdf.format(getMomento())+"\n");
		
		sb.append("Status: "+ getStatus()+"\n\n");
		
		sb.append("Cliente:"+ cliente.getNome()+"("+ sdf.format(cliente.getNascData()) +") E-mail:"+cliente.getEmail()+"\n\n");
		
		sb.append("Lista de Itens"+"\n\n");
		for(OrdemItem listItem: ordemItens) 
		{
			sb.append("Produto: "+listItem.getProduto().getNome()
					+", Preço: "+listItem.getPreco()
					+", Quantidade:"+listItem.getQuantidade()
					+", Total: "+listItem.subTotal(listItem.getQuantidade(), listItem.getPreco())
					+"\n\n");
		}
				
		sb.append("Total do pedido: "+total());
		
		return sb.toString();
	}
}
