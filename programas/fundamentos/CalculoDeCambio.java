package fundamentos;
import java.util.Scanner;

public class CalculoDeCambio {
    public static void main(String[] parametro){

        Scanner scan = new Scanner(System.in);
        final double DOLAR = 5.7, EURO = 5.97, PESOARGENTINO = 0.0054;
        Double currency, value;
        Integer userResponse = 0;
        String input;

        while(true){

            System.out.println("\nDigite a moeda a qual voce deseja converter:\n\n[1] Dolar\n[2] Euro\n[3] Peso argentino\n");
            input = scan.nextLine();

            try{
                userResponse = Integer.parseInt(input);
            }
            catch(NumberFormatException n){
                System.out.println("\napenas números inteiro serão aceitos, tente novamente");
                continue;
            }
            catch (Exception e) {
                System.out.println("\num erro misterioso ocorreu aqui");
                continue;
            }

            if(userResponse >= 1 && userResponse <= 3){
                input = null;
                break;
            }
            else{
                System.out.println("\nresposta inválida, tente novamente");
            }
        }

        while(true){
            
            System.out.print("\ndigite o valor em reais a ser convertido: ");
            input = scan.nextLine();

            try{
                value = Double.parseDouble(input);
            }
            catch(NumberFormatException n){
                System.out.println("\napenas valores reais serão aceitos");
                continue;
            }
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu aqui");
                continue;
            }

            if(value > 0){
                input = null;
                break;
            } else{
                System.out.println("\no valor digitado deve ser positivo, tente novamente");
            }
        }

        switch(userResponse){

            case 1:
                currency = value / DOLAR;
                System.out.printf("\no valor de BRL$%.2f corresponde ao valor de USD$%.2f", value, currency);
                break;
            case 2:
                currency = value / EURO;
                System.out.printf("\no valor de BRL$%.2f corresponde ao valor de EUR$%.2f", value, currency);
                break;
            case 3:
                currency = value / PESOARGENTINO;
                System.out.printf("\no valor de BRL$%.2f corresponde ao valor de ARS$%.2f", value, currency);
                break;
            default:
                break;
        }

        scan.close();
    }
}
