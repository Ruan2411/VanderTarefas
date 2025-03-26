import java.util.Scanner;

public class calcularvalorproduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double valorTotal = precoProduto * quantidade;

        System.out.printf("O valor total é: R$ %.2f%n", valorTotal);
        
        scanner.close();
    }
}