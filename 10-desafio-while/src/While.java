import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota;
		double notaTotal = 0;
		int notaValida = 0;
		
		while(true) {
			System.out.println("Informe a nota (-1) para sair!");
			nota = scanner.nextDouble();
			
			if (nota == -1 && notaTotal != 0) {
				System.out.println(notaTotal / notaValida);
				break;
			}
			else if (nota == -1 && notaTotal != 0) {
				System.out.println("Notas inexistentes!");
				break;
			}
			
			if (nota >= 0 && nota <= 10) {
				notaTotal += nota;
				notaValida++;
			}
		
		}
		
		scanner.close();
	}
}
