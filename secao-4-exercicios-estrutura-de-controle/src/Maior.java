import java.util.Scanner;

public class Maior {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int maiorNumero = Integer.MIN_VALUE;

	        System.out.println("Digite 10 números:");

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Número " + i + ": ");
	            int numero = scanner.nextInt();

	            if (numero > maiorNumero) {
	                maiorNumero = numero;
	            }
	        }

	        System.out.println("O maior número digitado é: " + maiorNumero);

	        scanner.close();
	    }
}
