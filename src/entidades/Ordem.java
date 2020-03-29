package entidades;

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
	
	public Ordem() {}

	public Ordem(Date momento, OrdemStatus status, Cliente cliente) 
	{
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
	
	public void addItem(OrdemItem ordemItem) 
	{
		ordemItens.add(ordemItem);	
	}
	
	public void removeItem(OrdemItem ordemItem) 
	{
		ordemItens.remove(ordemItem);
	}

	
	
	
}
