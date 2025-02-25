import java.util.Scanner;

public class MediaTuma {
    public static void main(String[] parametro) {
        Scanner scan = new Scanner(System.in);
        Double total = 0.0;
        int contador = 1;

        while(true){
            int userResponse = 0;

            while(true){
                System.out.printf("\ndigite a nota do aluno %d: ", contador);
                String input = scan.nextLine().trim();
                double subTotal;

                try{
                    subTotal = Double.parseDouble(input);
                }
                catch(NumberFormatException n){
                    System.out.println("\nresposta inválida, tente novamente");
                    continue;
                }
                catch(Exception e){
                    System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                    continue;
                }

                if(subTotal >= 0 && subTotal <= 10){
                    total += subTotal;
                    break;
                }else{
                    System.out.println("\nas notas devem ser positivas, tente novamente");
                    continue;
                }
            }

            while(true){
                System.out.printf("\na nota do aluno %d foi registrada, deseja continuar registrando notas?\n\n[1] sim\n[2] não\n\n", contador);
                String input = scan.nextLine();

                try{
                    userResponse = Integer.parseInt(input);
                }
                catch(NumberFormatException n){
                    System.out.println("\nresposta inválida, tente novamente");
                    continue;
                }
                catch (Exception e) {
                    System.out.println("\num erro desconhecido ocorreu aqui, tente novamente");
                }

                if(userResponse == 1 || userResponse == 2){
                    break;
                }else{
                    System.out.println("\nsua resposta deve ser 1 ou 2, tente novamente");
                    continue;
                }
            }

            if(userResponse == 1){
                contador++;
                continue;
            }else{
                break;
            }
        }

        double media = total / contador;
        System.out.printf("\na media de notas da turma é %.2f", media);
        scan.close();
    }
}
