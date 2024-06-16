import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Geladeira", 1200.00, 0.3, 0.0);
		Produto produto2 = new Produto("TV50", 2200.00, 0.4, 100);
		
		List<Produto> produtos = Arrays.asList(produto1, produto2);
		Predicate<Produto> desconto = produto -> produto.desconto >= 0.3;
		Predicate<Produto> frete = produto -> produto.frete == 0.0;
		Predicate<Produto> preco = produto -> produto.preco >= 500;
		Function<Produto, String> exibir = produto -> produto.nome;
		produtos.stream()
			.filter(desconto)
			.filter(frete)
			.filter(preco)
			.map(exibir)
			.forEach(System.out::println);
	}
}
