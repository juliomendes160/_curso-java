
public class Jantar {
	public static void main(String[] args) {
		
		Comida comida1 = new Comida("feijão", 200);
		Comida comida2 = new Comida("arroz", 300);
		
		Pessoa pessoa1 = new Pessoa("Jefferson", 100);
		Pessoa pessoa2 = new Pessoa("Debora", 80);
		
		pessoa1.Comer(comida1);
		pessoa1.Comer(comida2);
		
		pessoa2.Comer(comida1);
		pessoa2.Comer(comida2);
		
		System.out.println("1ª Pessoa - Peso: "+ pessoa1.pesoQuilos);
		System.out.println("2ª Pessoa - Peso: "+ pessoa2.pesoQuilos);
	}
}
