import java.util.Scanner;

public class SistemaAutenticacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senhaArmazenada = "senha123"; 
        
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine(); 
        

        if (senhaArmazenada.equals(senhaDigitada)) {
            System.out.println("Acesso Autorizado.");
        } else {
            System.out.println("Senha incorreta.");
        }
        
        scanner.close(); 
}