import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Informe a nota!");
		double nota = scanner.nextDouble();
		
		if(nota >= 9) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera");
		}
		else {
			System.out.println("Não está no Quadro de Honra!");
		}
	}
}
