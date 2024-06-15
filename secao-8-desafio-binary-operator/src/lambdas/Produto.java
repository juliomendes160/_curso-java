package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Produto extends Object {

	final String nome;
	final double preco;
	final double desconto;
	final double impostoMunicipal = 8.5;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public Function<Produto, Double> Preco = produto -> produto.preco - produto.preco * produto.desconto;
	
	public UnaryOperator<Double> ImpostoMunicipal = preco -> preco >= 2500 ? preco * 8.5 / 100 : 0.0;
	
	public UnaryOperator<Double> Frete = preco -> preco >= 3000 ? 100.0 : 50.0;
	
	Function<Produto, Double> Total = produto ->
		Preco.apply(produto) +
		Preco.andThen(ImpostoMunicipal).apply(produto) +
		Preco.andThen(Frete).apply(produto);
	
	public UnaryOperator<Double> Arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
	
	public Function<Double, String> Formatar = preco -> ("R$ " + preco).replace(".", ",");
	
}
