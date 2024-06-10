import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe se trabalho na terça (exemplo: \"V\" para Verdadeiro ou \"F\" para Falso):");
		String trabalho1 = scanner.nextLine();
		
		System.out.println("Informe se trabalho na quinta (exemplo: \"V\" para Verdadeiro ou \"F\" para Falso):");
		String trabalho2 = scanner.nextLine();
		
		boolean tv32 = trabalho1.equalsIgnoreCase("V") ^ trabalho2.equalsIgnoreCase("V");
		boolean tv50 = trabalho1.equalsIgnoreCase("V") && trabalho2.equalsIgnoreCase("V");
		boolean sorvete = trabalho1.equalsIgnoreCase("V") || trabalho2.equalsIgnoreCase("V");
		
		System.out.println("Comprou TV de 32: "+ tv32);
		System.out.println("Comprou TV de 50: "+ tv50);
		System.out.println("Comprou Sorvete: "+ sorvete);
		System.out.println("Saudavel: "+ !sorvete);
		
		scanner.close();
	}
}
