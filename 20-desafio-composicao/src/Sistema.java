import java.util.ArrayList;

public class Sistema {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "Caneta";
		produto1.preco = 2.5;
		
		Produto produto2 = new Produto();
		produto2.nome = "Lápis";
		produto2.preco = 2.5;
		
		Item item1 = new Item();
		item1.produto = produto1;
		item1.quantidade = 1;
		
		Item item2 = new Item();
		item2.produto = produto2;
		item2.quantidade = 1;
		
		Compra compra = new Compra();
		compra.itens = new ArrayList<>() {{
			add(item1); add(item2);
		}};
		
		Cliente cliente = new Cliente();
		cliente.nome = "Juliermes";
		cliente.compras = new ArrayList<>() {{
			add(compra);
		}};
		
		System.out.println(cliente.Total());
		
		
	}
	
}
