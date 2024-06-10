import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O valor do delta é: " + delta);
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("\nAs raízes são reais e distintas:\n");
            
            System.out.println("x1 = " + x1);
            System.out.println( a +"("+ x1 +"^2) + "+ b +"("+ x1 +") + ("+ c +") = 0");
            System.out.println(a * Math.pow(x1, 2) + b * x1 + c +"\n");
            
            System.out.println("x2 = " + x2);
            System.out.println( a +"("+ x2 +"^2) + "+ b +"("+ x2 +") + ("+ c +") = 0");
            System.out.println("resultado: "+ a * Math.pow(x2, 2) + b * x2 + c +"\n");
        } 
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
            System.out.println(a * Math.pow(x, 2) + b * x + c);
            System.out.println("resultado: "+ a +"("+ x +"^2) + "+ b +"("+ x +") + ("+ c +") = 0");
        } 
        else {
            System.out.println("Não existem raízes!");
        }

        scanner.close();
    }
}
