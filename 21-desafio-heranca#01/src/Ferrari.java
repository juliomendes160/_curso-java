
public class Ferrari extends Carro{
	
	int Acelerar() {
		return this.velocidade += 5 * 3;
	}
	
	int Frear() {
		if(this.velocidade > 0) {
			this.velocidade -= 5 * 3;
		}
		
		return velocidade;
	}
	
}
