package funcoesLambda.methodReference;
import java.util.function.Consumer;

//method reference é usado para passar referencias de métodos ja existentes para funções lambda

public class app {
    public static void main(String[] args) {
        Consumer<String> printExemplo = System.out::println;
        //neste caso, consumer é uma interface funcional padrão do java
        //a nomenclatura "::" é utilisada logo antes da função a qual será passada a referencia
        //como "printExemplo" é uma váriavel cujo tipo corresponde a uma interface funcional, ela requer uma função para agir como lambda e sobrescrever a função desta interface
        //no caso, ao invez de definir uma nova função e passar ela como lambda, eu passei a referencia de uma função ja existente
        //isso é muito útil em grandes projetos com múltiplas classes 

        printExemplo.accept("teste");
        //no caso desta interface, a função que será sobrescrita e deve ser chamada no momento de executar o código é "accept"

        printExemplo = app::funcaoTeste;
        //agora eu estou passando a referência de uma função criada por mim
        //isso mostra que não são apenas funções padrão do java que podem ser passadas como referência

        printExemplo.accept("\nteste 2");
        //mesma execução de antes
    }

    //definição da função que será passada como referência no main
    public static void funcaoTeste(String x){
        System.out.println(x);
    } 
}
