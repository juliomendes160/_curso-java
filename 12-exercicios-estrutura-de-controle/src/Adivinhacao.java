import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	
	 public static void main(String[] args) {
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);
	        
	        int numero = random.nextInt(101);
	        int tentativasRestantes = 10;
	        boolean acertou = false;

	        System.out.println("Tente adivinhar um número entre 0 e 100.");

	        while (tentativasRestantes > 0 && !acertou) {
	            System.out.print("Você tem " + tentativasRestantes + " tentativas restantes. Digite seu palpite: ");
	            int palpite = scanner.nextInt();

	            if (palpite == numero) {
	                acertou = true;
	                System.out.println("Parabéns! Você acertou o número.");
	            } else {
	                tentativasRestantes--;
	                if (palpite > numero) {
	                    System.out.println("O número é menor do que " + palpite + ".");
	                } else {
	                    System.out.println("O número é maior do que " + palpite + ".");
	                }
	            }
	        }

	        if (!acertou) {
	            System.out.println("Suas tentativas acabaram. O número era " + numero + ".");
	        }

	        scanner.close();
	    }
}
