import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas notas seram informadas!");
		int quantidade = scanner.nextInt();
		
		double [] notas = new double [quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println(i+1 +"ª Nota");
			notas[i] = scanner.nextDouble();
		}
		
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}
		
		double media = soma / quantidade;
		
		System.out.println("Média: "+ media);
		
		scanner.close();
	}
}
