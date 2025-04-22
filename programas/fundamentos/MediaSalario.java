package fundamentos;
import java.util.Scanner;

public class MediaSalario {

    public static void main(String[] parametro){

        Scanner scan = new Scanner(System.in);
        Double media;

        while(true){

            Double salario1;
            System.out.print("\ndigite o seu primeiro salário: ");
            String input = scan.nextLine();
            Integer userResponse;

            int indice = input.indexOf(",");

            if(indice == -1){
                indice = input.indexOf(".");

                if(indice == -1){
                    System.out.println("\nvocê deve separar as casas decimais do valor utilisando ',' ou '.'");
                    continue;
                }
            }
            if(indice == 0){
                System.out.println("\nvocê deve possuir ao menos um digito inteiro no seu valor");
            }

            String subInput = input.substring(0, indice);

            try{
                salario1 = Double.parseDouble(subInput);
            }
            catch(NumberFormatException n){
                System.out.println("\nsua parte inteira deve conter apenas números, tente novamente");
                continue;
            }
            catch(Exception e) {
                System.out.println("\num erro desconhecido ocorreu  aqui, tenet novamente");
                continue;
            }
            
            try{
                subInput = input.substring(indice + 1, indice +3);
                salario1 += Double.parseDouble(subInput) / 100;
            }
            catch(StringIndexOutOfBoundsException s){
                System.out.println("\nvocê deve digitar as duas casas decimais do seu salário, tente novamente");
                continue;
            }
            catch(NumberFormatException n){
                System.out.println("\nsuas casas decimais devem conter apenas numeros, tente novamente");
                continue;
            }
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                continue;
            }

            while(true){
                System.out.printf("\nseu primeiro salário será considerado como R$%.2f; voce confirma?\n\n[1] sim\n[2] não\n\n", salario1);
                input = scan.nextLine();

                try{
                    userResponse = Integer.parseInt(input);
                }
                catch(NumberFormatException n){
                    System.out.println("\nresposta inválida, tente novamente");
                    continue;
                }
                catch (Exception e) {
                    System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                    continue;
                }

                if(userResponse == 1 || userResponse ==2){
                    break;
                }
                else{
                    System.out.println("\nsua resposta deve ser 1 ou 2, tente novamente");
                    continue;
                }
            }

            if(userResponse == 1){
                media = salario1;
                break;
            }
            else{
                continue;
            }
        }

        while(true){

            Double salario2;
            System.out.print("\ndigite o seu segundo salário: ");
            String input = scan.nextLine();
            Integer userResponse;

            int indice = input.indexOf(",");

            if(indice == -1){
                indice = input.indexOf(".");

                if(indice == -1){
                    System.out.println("\nvocê deve separar as casas decimais do valor utilisando ',' ou '.'");
                    continue;
                }
            }
            
            if(indice == 0){
                System.out.println("\nvocê deve possuir ao menos um digito inteiro no seu valor");
            }

            String subInput = input.substring(0, indice);

            try{
                salario2 = Double.parseDouble(subInput);
            }
            catch(NumberFormatException n){
                System.out.println("\nsua parte inteira deve conter apenas números, tente novamente");
                continue;
            }
            catch(Exception e) {
                System.out.println("\num erro desconhecido ocorreu  aqui, tenet novamente");
                continue;
            }
            
            try{
                subInput = input.substring(indice + 1, indice +3);
                salario2 += Double.parseDouble(subInput) / 100;
            }
            catch(StringIndexOutOfBoundsException s){
                System.out.println("\nvocê deve digitar as duas casas decimais do seu salário, tente novamente");
                continue;
            }
            catch(NumberFormatException n){
                System.out.println("\nsuas casas decimais devem conter apenas numeros, tente novamente");
                continue;
            }
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                continue;
            }

            while(true){
                System.out.printf("\nseu segundo salário será considerado como R$%.2f; voce confirma?\n\n[1] sim\n[2] não\n\n", salario2);
                input = scan.nextLine();

                try{
                    userResponse = Integer.parseInt(input);
                }
                catch(NumberFormatException n){
                    System.out.println("\nresposta inválida, tente novamente");
                    continue;
                }
                catch (Exception e) {
                    System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                    continue;
                }

                if(userResponse == 1 || userResponse ==2){
                    break;
                }
                else{
                    System.out.println("\nsua resposta deve ser 1 ou 2, tente novamente");
                    continue;
                }
            }

            if(userResponse == 1){
                media += salario2;
                break;
            }
            else{
                continue;
            }
        }

        while(true){

            Double salario3;
            System.out.print("\ndigite o seu terceiro salário: ");
            String input = scan.nextLine();
            Integer userResponse;

            int indice = input.indexOf(",");

            if(indice == -1){
                indice = input.indexOf(".");

                if(indice == -1){
                    System.out.println("\nvocê deve separar as casas decimais do valor utilisando ',' ou '.'");
                    continue;
                }
            }
            
            if(indice == 0){
                System.out.println("\nvocê deve possuir ao menos um digito inteiro no seu valor");
            }

            String subInput = input.substring(0, indice);

            try{
                salario3 = Double.parseDouble(subInput);
            }
            catch(NumberFormatException n){
                System.out.println("\nsua parte inteira deve conter apenas números, tente novamente");
                continue;
            }
            catch(Exception e) {
                System.out.println("\num erro desconhecido ocorreu  aqui, tenet novamente");
                continue;
            }
            
            try{
                subInput = input.substring(indice + 1, indice +3);
                salario3 += Double.parseDouble(subInput) / 100;
            }
            catch(StringIndexOutOfBoundsException s){
                System.out.println("\nvocê deve digitar as duas casas decimais do seu salário, tente novamente");
                continue;
            }
            catch(NumberFormatException n){
                System.out.println("\nsuas casas decimais devem conter apenas numeros, tente novamente");
                continue;
            }
            catch (Exception e) {
                System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                continue;
            }

            while(true){
                System.out.printf("\nseu terceiro salário será considerado como R$%.2f; voce confirma?\n\n[1] sim\n[2] não\n\n", salario3);
                input = scan.nextLine();

                try{
                    userResponse = Integer.parseInt(input);
                }
                catch(NumberFormatException n){
                    System.out.println("\nresposta inválida, tente novamente");
                    continue;
                }
                catch (Exception e) {
                    System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                    continue;
                }

                if(userResponse == 1 || userResponse ==2){
                    break;
                }
                else{
                    System.out.println("\nsua resposta deve ser 1 ou 2, tente novamente");
                    continue;
                }
            }

            if(userResponse == 1){
                media += salario3;
                break;
            }
            else{
                continue;
            }
        }

        media /= 3;
        System.out.printf("\n\na média dos seus salários é de %.2f", media);

        scan.close();
    }
}
