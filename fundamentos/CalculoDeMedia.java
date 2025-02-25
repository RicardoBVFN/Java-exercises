import java.util.Scanner;

public class CalculoDeMedia {
    
    public static void main(String[] parametro){

        Scanner scan = new Scanner(System.in);
        Double n1, n2, n3, media;

        while(true){

            System.out.println("digite a sua primeira nota:");
            String input = scan.nextLine();

            try{
                n1 = Double.parseDouble(input);
            }
            catch(NumberFormatException n){
                System.out.println("\napenas valores reais serão aceitos");
                continue;
            }   
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu aqui");
                continue;
            }

            if(n1 >= 0 && n1 <= 10){
                break; 
            } 
            else{
                System.out.println("\nnota inválida, tente novamente\n");
            }
        }

        while(true){
            
            System.out.println("\ndigite a sua segunda nota: ");
            String input = scan.nextLine();

            try{
                n2 = Double.parseDouble(input);
            }
            catch(NumberFormatException n){
                System.out.println("\napenas valores reais serão aceitos, tente novamente");
                continue;
            }    
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu, tente novamente");
                continue;
            }

            if(n2 >= 0 && n2 <= 10){
                break;
            }
            else{
                System.out.println("\nnota inválida, tente novamente\n");
            }
        }

        while(true){

            System.out.println("\ndigite a sua segunda nota: ");
            String input = scan.nextLine();

            try{
                n3 = Double.parseDouble(input);
            }
            catch(NumberFormatException n){
                System.out.println("\napenas valores reais serão aceitos, tente novamente");
                continue;
            }
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                continue;
            }

            if(n3 >= 0 && n3 <= 10){
                break;
            }
            else{
                System.out.println("\nnota inválida, tenet novamente\n");
            }
        }

        media = (n1 + n2 + n3) / 3.0;

        if(media < 5){ 
            System.out.println("\nvocê está reprovado, sinto muito");
        }
        if(media >= 5 && media < 7){
            System.out.println("\nvocê está de recuperação, boa sorte");
        }
        if(media >= 7 && media < 9){
            System.out.println("\nvocê está aprovado, parabéns");
        }
        if(media >= 9){
            System.out.println("\nvocê passou com louvor, parabéns");
        }
        
        scan.close();
    }
}
