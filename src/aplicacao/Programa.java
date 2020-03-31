/*
 *
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). 
 * Depois, mostrar um sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
	o instante do sistema: new Date()
	
*/

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.Produto;
import entidades.enums.OrdemStatus;

public class Programa {

	public static void main(String[] args) throws ParseException 
	{
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("Entre com Dados do Cliente#");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
				
		System.out.print("Data nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		//Consumindo quebra de linha
		sc.nextLine();
		
		System.out.println("Entre com o pedido #");
		
		System.out.print("Status (PAGAMENTO_PENDENDETE, PROCESSANDO, ENVIADO, ENTREGUE): ");
		String status = sc.nextLine();
		
		Date momento = new Date();
		
		Ordem ordem = new Ordem(momento, OrdemStatus.valueOf(status), new Cliente(nome, email, dataNascimento));
		
		System.out.println("Digite a quantidade de Itens para o pedido");
		
		System.out.print("Quantidade:");
		int quantidadeItens = sc.nextInt();
				
		for(int w = 0; w < quantidadeItens; w++)
		{
			//Consumindo quebra de linha
			sc.nextLine();
			
			System.out.println("Digite o item #N "+ (w + 1));
			
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço produto: ");
			double precoProduto = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int quantidadeProduto = sc.nextInt();
			
			ordem.addItem(new OrdemItem(quantidadeProduto, precoProduto, new Produto(nomeProduto, precoProduto)));
		}
			
		System.out.println(ordem.toString());
		
		sc.close();
		
	}

}
