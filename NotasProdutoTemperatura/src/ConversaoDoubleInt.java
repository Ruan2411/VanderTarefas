import java.util.Scanner;

public class ConversaoDoubleInt {
    public static void main(String[] args) {
        double numeroDouble = 10.75; 
        System.out.println("Valor original (double): " + numeroDouble);
        
        int numeroInt = (int) numeroDouble; 
        System.out.println("Valor após conversão (int): " + numeroInt);
    }
}