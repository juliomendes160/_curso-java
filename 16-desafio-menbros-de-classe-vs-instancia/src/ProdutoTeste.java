
public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Cadeira", 10);
		Produto produto2 = new Produto("Mesa", 20);
		Produto.desconto = 0.25;
		
		System.out.println("1ª Produto - Nome: "+ produto1.nome +", Preço: "+ produto1.preco +", Desconto: "+ produto1.Desconto());
		System.out.println("2ª Produto - Nome: "+ produto2.nome +", Preço: "+ produto2.preco +", Desconto: "+ produto2.Desconto());
	}

}
