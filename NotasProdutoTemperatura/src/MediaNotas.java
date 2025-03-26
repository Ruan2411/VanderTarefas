import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro trimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do segundo trimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é: %.2f%n", media);
        
        scanner.close();
    }
}