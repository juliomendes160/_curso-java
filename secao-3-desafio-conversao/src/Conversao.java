import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o 1ª salário \"(exemplo: 1200.12 ou 1200,12)\":");
		String salario1 = scanner.nextLine().replace(",", ".");
		
		System.out.println("Informe o 2ª salário \"(exemplo: 2200.22 ou 2200,22)\":");
		String salario2 = scanner.nextLine().replace(",", ".");;
		
		System.out.println("Informe o 3ª salário \"(exemplo: 3200.32 ou 3200,32)\":");
		String salario3 = scanner.nextLine().replace(",", ".");
		
		double mediaSalarial = MediaSalarial(salario1, salario2,  salario3);
		
		System.out.println("A sua média salarial é: " + mediaSalarial);
		
		scanner.close();
	}
	
	static double MediaSalarial(String salario1, String salario2, String salario3) {
		double _salario1 = Double.parseDouble(salario1);
		double _salario2 = Double.parseDouble(salario2);
		double _salario3 = Double.parseDouble(salario3);
		return (_salario1 + _salario2 + _salario3) / 3;
	}
}
