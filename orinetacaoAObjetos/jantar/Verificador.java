package orinetacaoAObjetos.jantar;
import java.util.Scanner;

public class Verificador {
    private static final Scanner scan = new Scanner(System.in);

    static String stringValida(String complemento){
        String userResponse;

        while(true){
            System.out.print("\ndigite " + complemento + ": ");
            userResponse = scan.nextLine().trim();

            if(userResponse != "\n" && userResponse != ""){
                return userResponse;
            } else {
                System.out.print("\nresposta inválida, tente novamente");
            }
        }
    }
    static String stringValida(){
        String userResponse;

        while(true){
            System.out.print("\ndigite uma string válida: ");
            userResponse = scan.nextLine().trim();

            if(userResponse != "\n" && userResponse != ""){
                return userResponse;
            } else {
                System.out.print("\nresposta inválida, tente novamente");
            }
        }
    }

    static int intValido(String complemento){
        String userResponse;
        int funcReturn;

        while(true){
            System.out.print("digite " + complemento + ": ");
            userResponse = scan.nextLine();

            try{
                funcReturn = Integer.parseInt(userResponse);
            }
            catch(Exception e){
                System.out.print("\nresposta invalida, tente novamente");
                continue;
            }

            return funcReturn;
        }

    }
    static int intValido(boolean menssage){
        String userResponse;
        int funcReturn;

        if(menssage){
            while(true){
                System.out.print("digite um numero inteiro válido: ");
                userResponse = scan.nextLine();

                try{
                    funcReturn = Integer.parseInt(userResponse);
                }
                catch(Exception e){
                    System.out.print("\nresposta invalida, tente novamente");
                    continue;
                }

                return funcReturn;
            }
        } else {
            while(true){
                userResponse = scan.nextLine();

                try{
                    funcReturn = Integer.parseInt(userResponse);
                }
                catch(Exception e){
                    System.out.print("\nresposta inválida, tente novamente\n");
                    continue;
                }

                return funcReturn;
            }
        }

    }

    static double doubleValido(String complemento){
        String userResponse;
        double funcReturn;

        while(true){
            System.out.print("digite " + complemento + ": ");
            userResponse = scan.nextLine();

            try{
                funcReturn = Double.parseDouble(userResponse);
            }
            catch(Exception e){
                System.out.print("\nresposta invalida, tente novamente");
                continue;
            }

            return funcReturn;
        }

    }
    static double doubleValido(boolean menssage){
        String userResponse;
        double funcReturn;

        if(menssage){
            while(true){
                System.out.print("digite um numero inteiro válido: ");
                userResponse = scan.nextLine();

                try{
                    funcReturn = Double.parseDouble(userResponse);
                }
                catch(Exception e){
                    System.out.print("\nresposta invalida, tente novamente");
                    continue;
                }

                return funcReturn;
            }
        } else {
            while(true){
                userResponse = scan.nextLine();

                try{
                    funcReturn = Double.parseDouble(userResponse);
                }
                catch(Exception e){
                    System.out.print("\nresposta inválida, tente novamente\n");
                    continue;
                }

                return funcReturn;
            }
        }

    }

    static int boxNumero(String complemento, int numeroRespostas, boolean indexesStartZero, String[] textoRespostas){
        int userResponse;

        while(true){
            System.out.print("\ndeseja " + complemento + "\n\n");

            if(indexesStartZero){
                for(int i = 0;i < numeroRespostas;i++){
                    System.out.printf("[%d] %s\n", i, textoRespostas[i]);

                    if(i == numeroRespostas - 1){
                        System.out.print("\n");
                    }
                }

                userResponse = Verificador.intValido(false);

                if(userResponse >= 0 && userResponse <= numeroRespostas -1){
                    return userResponse;
                } else {
                    System.out.printf("\nsua resposta deve estar no seguinte intervalo: %d <= resposta <= %d, tente novamente", 0, numeroRespostas - 1);
                    continue;
                }
            } else {
                for(int i = 1;i <= numeroRespostas;i++){
                    System.out.printf("[%d] %s\n", i, textoRespostas[i - 1]);

                    if(i == numeroRespostas){
                        System.out.print("\n");
                    }
                }

                userResponse = Verificador.intValido(false);

                if(userResponse >= 1 && userResponse <= numeroRespostas){
                    return userResponse;
                } else {
                    System.out.printf("\nsua resposta deve estar no seguinte intervalo: %d <= resposta <= %d, tente novamente", 1, numeroRespostas);
                    continue;
                }
            }

        }
    }
}
