package fundamentos;
import java.util.Scanner;
public class DiaSemana {   
    public static void main(String[] parametro) {
        Scanner scan = new Scanner(System.in);
        String[] diasSemana = {"segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo"};
        int userResponse = -1;

        while(true){

            System.out.print("\ndigite um dia da semana: ");
            String input = scan.nextLine().trim();

            for(int i = 0; i <= 6; i++){
                if(input.equalsIgnoreCase(diasSemana[i])){
                    userResponse = i + 1;
                    break;
                }
            }

            if(userResponse == -1){
                System.out.println("\ndigite um dia válido para prosseguir com o programa");
            }else{
                break;
            }
        }

        System.out.printf("\no numero do dia da semana digitado é %s", userResponse);
        scan.close();
    }
}

//receber uma string contendo um nome de um dia da semana e retornar o numero correspondente a esse dia 
