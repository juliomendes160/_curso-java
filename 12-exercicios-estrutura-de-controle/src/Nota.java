import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double mediaFinal = (nota1 + nota2) / 2;

        if (mediaFinal >= 7.0) {
            System.out.println("Aprovado");
        } 
        else if (mediaFinal > 4.0) {
            System.out.println("Recuperação");
        } 
        else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
