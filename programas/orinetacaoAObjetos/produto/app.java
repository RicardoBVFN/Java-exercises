package orinetacaoAObjetos.produto;
import java.util.Scanner;

public class app {
    private static Produto produtoX = new Produto();
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\ndigite o nome do produto: ");
        produtoX.setNome(scan.nextLine().trim().toUpperCase());

        System.out.print("\ndigite um id para esse produto: ");
        produtoX.setId(scan.nextInt());

        System.out.print("\ndigite um preço para esse produto: ");
        produtoX.setPreco(scan.nextDouble());

        System.out.print("\ndigite um desconto para esse produto em porcentagem: ");
        produtoX.setDesconto(scan.nextDouble());

        System.out.printf("\no produto %s, de id %d, originalmente custa R$%.2f, mas com o desconto de %.2f porcento ele agora custa R$%.2f", produtoX.getNome(), produtoX.getId(), produtoX.getPreco(), produtoX.getDesconto(), produtoX.getPreco() * (1 - (produtoX.getDesconto() / 100)));
    }
}
