import java.util.Scanner;

public class Ativ03 {
    public static double soma3N(double[] numeros){
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numerosUsuario = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Escreva o " + (i + 1) + "° número: ");
            numerosUsuario[i] = scanner.nextDouble();
        }
        double resultado = soma3N(numerosUsuario);

        System.out.println("A soma dos três números é: " + resultado);

        scanner.close();
    }  
}
