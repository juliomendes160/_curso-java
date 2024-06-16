
public class Comida {
	
	String nome;
	double pesoGramas;
	
	Comida(String nome, double pesoGramas){
		this.nome = nome;
		this.pesoGramas = pesoGramas;
	}
	
	double Quilos() {
		return this.pesoGramas / 1000;
	}
}
