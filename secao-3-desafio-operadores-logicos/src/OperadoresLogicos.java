import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String trabalho1 = "";
        String trabalho2 = "";

        while (!trabalho1.equalsIgnoreCase("V") && !trabalho1.equalsIgnoreCase("F")) {
            System.out.println("Informe se trabalhou na terça (exemplo: \"V\" para Verdadeiro ou \"F\" para Falso):");
            trabalho1 = scanner.nextLine();
            if (!trabalho1.equalsIgnoreCase("V") && !trabalho1.equalsIgnoreCase("F")) {
                System.out.println("Entrada inválida! Por favor, insira \"V\" ou \"F\".");
            }
        }

        while (!trabalho2.equalsIgnoreCase("V") && !trabalho2.equalsIgnoreCase("F")) {
            System.out.println("Informe se trabalhou na quinta (exemplo: \"V\" para Verdadeiro ou \"F\" para Falso):");
            trabalho2 = scanner.nextLine();
            if (!trabalho2.equalsIgnoreCase("V") && !trabalho2.equalsIgnoreCase("F")) {
                System.out.println("Entrada inválida! Por favor, insira \"V\" ou \"F\".");
            }
        }
        
        boolean tv32 = trabalho1.equalsIgnoreCase("V") ^ trabalho2.equalsIgnoreCase("V");
        boolean tv50 = trabalho1.equalsIgnoreCase("V") && trabalho2.equalsIgnoreCase("V");
        boolean sorvete = trabalho1.equalsIgnoreCase("V") || trabalho2.equalsIgnoreCase("V");
        
        System.out.println("Comprou TV de 32: " + tv32);
        System.out.println("Comprou TV de 50: " + tv50);
        System.out.println("Comprou Sorvete: " + sorvete);
        System.out.println("Saudável: " + !sorvete);
        
        scanner.close();
    }
}
