import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n", temperaturaFahrenheit);
        
        scanner.close();
    }
}