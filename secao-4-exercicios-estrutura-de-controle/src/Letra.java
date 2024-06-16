import java.util.Scanner;

public class Letra {
	 public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.print("Digite uma palavra: ");
	    String palavra = scanner.nextLine();
	
	    System.out.println("A palavra digitada é:");
	    
	    for (int i = 0; i < palavra.length(); i++) {
	        char letra = palavra.charAt(i);
	        System.out.println(letra);
	    }
	
	    scanner.close();
	}
}
