package lambdas;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Produto produto = new Produto("iPad", 3000, 0.2);
		
		System.out.println("Preço Com Desconto: "+ produto.Preco.apply(produto));
		System.out.println("Imposto Municipal: "+ produto.Preco.andThen(produto.ImpostoMunicipal).apply(produto));
		System.out.println("Frete: "+ produto.Preco.andThen(produto.Frete).apply(produto));
		System.out.println("Total: "+ produto.Total.apply(produto));
		System.out.println("Arredondar: "+ produto.Total.andThen(produto.Arredondar).apply(produto));
		System.out.println("Formatar: "+ produto.Total.andThen(produto.Arredondar).andThen(produto.Formatar).apply(produto));
	}
}
