import java.util.Scanner;

public class Ativ06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char resposta;
        
        do {
            System.out.println("Digite a hora (formato de 24 horas): ");
            int hora = scanner.nextInt();
            System.out.println("Digite os minutos: ");
            int minutos = scanner.nextInt();
            
            String resultado = converterPara12Horas(hora, minutos);
            System.out.println("Hora convertida: " + resultado);
            
            System.out.println("Deseja converter outra hora? (S/N)");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
    
    public static String converterPara12Horas(int hora, int minutos) {
        String periodo;
        
        if (hora >= 0 && hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
        }
        
        if (hora == 0) {
            hora = 12;
        } else if (hora > 12) {
            hora -= 12;
        }
        
        return String.format("%d:%02d %s", hora, minutos, periodo);
    }
}
