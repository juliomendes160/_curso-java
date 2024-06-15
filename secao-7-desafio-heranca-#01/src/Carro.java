
public class Carro {
	
	int velocidade;
	
	int Acelerar() {
		return this.velocidade += 5;
	}
	
	int Frear() {
		if(this.velocidade > 0) {
			this.velocidade -= 5;
		}
		
		return velocidade;
	}
}
