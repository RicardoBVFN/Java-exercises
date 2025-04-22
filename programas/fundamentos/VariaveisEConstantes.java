package fundamentos;
import java.util.Scanner;
public class VariaveisEConstantes {

    public static void main(String[] parametro){
        Scanner scanner = new Scanner(System.in);
        String input;
        Double c, f;
        final double COEFICINTE = 32, FATOR = 5/9.0;

        while(true){
            System.out.print("\ndigite a temperatura em ºF a ser convertida: ");
            input = scanner.nextLine();

            try{
                f = Double.parseDouble(input);
            }

            catch(NumberFormatException n){
                System.out.println("\napenas vaores reais serão aceitos");
                continue;
            }

            catch(Exception e) {
                System.out.println("\num erro desconhecio correu aqui");
                continue;
            }

            if(f > 0){
                break;
            } else{
                System.out.println("\nvalor inválido, tente novamente");
            }

        }

        c = (f - COEFICINTE) * FATOR;

        System.out.printf("\na temperatura de %.1fFº corresponde a %.1fºC\n", f, c);

        scanner.close();

    }
}
