import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe 1ª número (exemplo \"1,2\")");
		double numero1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Informe 2ª número (exemplo \"2,2\")");
		double numero2 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Informe a operação desejada:");
		System.out.println("(+) adição");
		System.out.println("(-) subtração");
		System.out.println("(*) multiplicação");
		System.out.println("(/) divisão");
		System.out.println("(%) módulo");
		String  operacao = scanner.nextLine();
		
		switch (operacao){
			case "+": 
				System.out.println(numero1 + numero2); 
				break;
			case "-":  
				System.out.println(numero1 - numero2); 
				break;
			case "*":  
				System.out.println(numero1 * numero2); 
				break;
			case "/":  
				System.out.println(numero1 / numero2); 
				break;
			case "%":  
				System.out.println(numero1 % numero2); 
				break;
			default: System.out.println("opeção inexistente!");
		}
		
		scanner.close();
	}
}
