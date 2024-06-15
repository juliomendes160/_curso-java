
public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade;
	int variacao;;
	
	Carro(int velocidadeMaxima, int variacao){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		this.variacao = variacao;
	}
	
	int Acelerar() {
		if (velocidade + variacao < VELOCIDADE_MAXIMA) {
			this.velocidade += this.variacao;
		}
		return velocidade;
	}
	
	int Frear() {
		if(this.velocidade > 0) {
			this.velocidade -= this.variacao;
		}
		
		return velocidade;
	}
}
