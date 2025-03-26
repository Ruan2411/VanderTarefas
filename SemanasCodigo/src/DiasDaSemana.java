package Semanascocozinho;

public class DiaDaSemana {
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int dia = scanner.nextInt();

        // Verifica o número e exibe o dia correspondente
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}