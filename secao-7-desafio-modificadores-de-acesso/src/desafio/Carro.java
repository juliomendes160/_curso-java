package desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	public int velocidade;
	int variacao;;
	
	protected Carro(int velocidadeMaxima, int variacao){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		this.variacao = variacao;
	}
	
	public int Acelerar() {
		if (velocidade + variacao < VELOCIDADE_MAXIMA) {
			this.velocidade += this.variacao;
		}
		return velocidade;
	}
	
	public int Frear() {
		if(this.velocidade > 0) {
			this.velocidade -= this.variacao;
		}
		
		return velocidade;
	}
}
