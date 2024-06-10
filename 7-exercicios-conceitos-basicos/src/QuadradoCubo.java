import java.util.Scanner;

public class QuadradoCubo {
	 public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite um valor: ");
	    double valor = scanner.nextDouble();
	
	    double quadrado = Math.pow(valor, 2);
	
	    double cubo = Math.pow(valor, 3);
	
	    System.out.println("O quadrado do valor é: " + quadrado);
	    System.out.println("O cubo do valor é: " + cubo);
	
	    scanner.close();
	}
}
