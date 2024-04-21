import java.util.Scanner;

public class Ativ04 {
    public static char positivoNegativo(double numero){ 
        if (numero > 0 ) {
            return 'P';
        }else{
            return 'N';
        }   
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número e verifique se é positivo(P) ou negativo(N): ");
        double numero = scanner.nextDouble();

        char resultado = positivoNegativo(numero);
        System.out.println("O número é: " + resultado);

        scanner.close();
    }
}
