import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compras;
	
	double Total() {
		
		double soma = 0;
		
		for (Compra c : compras) {
			for (Item i : c.itens) {
				soma += i.produto.preco * i.quantidade;
			}
        }
		return soma;
	}

}
