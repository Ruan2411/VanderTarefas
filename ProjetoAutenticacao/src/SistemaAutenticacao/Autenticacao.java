package SistemaAutenticacao;

import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        // Senha armazenada no sistema
        String senhaArmazenada = "senhaSegura123"; // Você pode alterar essa senha para o que desejar

        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a senha
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        // Compara a senha digitada com a senha armazenada
        if (senhaDigitada.equals(senhaArmazenada)) {
            System.out.println("Acesso Autorizado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        // Fecha o scanner
        scanner.close();
    }
}