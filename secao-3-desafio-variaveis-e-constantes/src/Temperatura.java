import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em fahrenheit \"(exemplo: 86)\":");
		double fahrenheit = scanner.nextDouble();
		
		double celsius = Celsius(fahrenheit);
		System.out.println("A temperatura em celsius: "+ celsius);
		
		scanner.close();
		
	}
	
	static double Celsius(double fahrenheit) {
		
		final double AJUSTE = 32.0;
		final double FATOR = 5.0 / 9.0;
		
		double celsius;
		
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		return celsius;
	}
}