package lambdas;

public class Main {
	public static void main(String[] args) {
		
		Produto produto = new Produto("iPad", 3000, 0.2);
		
		System.out.println("Preço Com Desconto: "+ produto.Preco.apply(produto));
		System.out.println("Imposto Municipal: "+ produto.ImpostoMunicipal.apply(produto.Preco.apply(produto)));
		System.out.println("Frete: "+ produto.Frete.apply(produto.Preco.apply(produto)));
		System.out.println("Formatar: "+ produto.Formatar.apply(produto.Frete.apply(produto.Preco.apply(produto))));
	}
}
