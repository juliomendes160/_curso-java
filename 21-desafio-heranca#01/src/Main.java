
public class Main {
	
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		civic.Acelerar();
		civic.Acelerar();
		civic.Frear();
		
		Ferrari ferrari = new Ferrari();
		ferrari.Acelerar();
		ferrari.Acelerar();
		ferrari.Frear();
		
		System.out.println(civic.velocidade);
		System.out.println(ferrari.velocidade);
	}

}
