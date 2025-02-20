import java.util.Scanner;
public class VariaveisEConstantes {

    public static void main(String[] parametro){
        Scanner scanner = new Scanner(System.in);

        double c, f;

        System.out.println("\n digite a temperatura em ºF a ser convertida: ");
        f = scanner.nextDouble();

        c = (f - 32.0) * (5 / 9.0);

        System.out.println("\n a temperatura de " + f + "Fº corresponde a " + c + "ºC");

        scanner.close();

    }
}
