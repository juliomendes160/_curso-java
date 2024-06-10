
public class Pessoa {
	
	String nome;
	double pesoQuilos;
	
	Pessoa(String nome, double pesoQuilos){
		this.nome = nome;
		this.pesoQuilos = pesoQuilos;
	}
	
	void Comer(Comida comida) {
		this.pesoQuilos += comida.Quilos(); 
	}
}
