import java.util.Scanner;

public class Ativ05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule o valor do seu produto, de acordo com o imposto: ");
        
        System.out.print("Escreva o valor do item: R$");
        double valorProduto = scanner.nextDouble();

        System.out.print("Escreva a taxa do imposto em porcentagem(%): ");
        double impostoProduto = scanner.nextDouble();

        System.out.println("Valor do produto antes do imposto: R$" + valorProduto);
        double produtoComImposto = somaImposto(impostoProduto, valorProduto);

        System.out.println("Valor com imposto: R$" + produtoComImposto);

        scanner.close();
    }
    public static double somaImposto(double taxaImposto, double custo){
        double impostoDecimal = taxaImposto / 100.0;

        double valorProdutoComImposto = custo *(1 + impostoDecimal);

        return valorProdutoComImposto;
    }
}
