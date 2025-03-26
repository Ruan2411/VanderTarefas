import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Determinando o maior número
        int maior = numero1; // Assume que o primeiro número é o maior

        if (numero2 > maior) {
            maior = numero2; // Atualiza se o segundo número for maior
        }
        if (numero3 > maior) {
            maior = numero3; // Atualiza se o terceiro número for maior
        }

        // Exibe o maior número
        System.out.println("O maior número é: " + maior);

        // Fecha o scanner
        scanner.close();
    }
}