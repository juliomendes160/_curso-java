import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            System.out.println("O número " + numero + " está entre 0 e 10 e é par.");
        }
        else if (numero >= 0 && numero <= 10) {
        	System.out.println("O número " + numero + " está entre 0 e 10, mas não é par.");
        }
        else {
            System.out.println("O número " + numero + " não está entre 0 e 10");
        }

        scanner.close();
    }
}