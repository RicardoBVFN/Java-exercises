package funcoesLambda.principaisInterfaces;
import java.util.function.Predicate;

//Predicado é representa uma função que recebe um valor do tipo T e retorna um valor booleano

public class Predicado {
    public static void main(String[] args) {
        //declaração de um predicado que recebe um Integer e retorna se ele é par ou não
        //por convenção, esse tipo de função recebe o nome de "isV", onde V representa a verificação a ser realizada
        Predicate<Integer> isPar = x -> (x % 2) == 0 ? true : false;

        //o método de ativaçãoda lambda netse caso é test e o valor a ser verificado deve ser passado como seu parâmetro
        if(isPar.test(12)){
            System.out.println("este número é par");
        }

        //predicados também podem ser concatenados para formar expreções lógicas

        //definição de outro predicado para concatenação
        Predicate<Integer> isTresDigitos = x -> (x / 100) >= 1 ? true : false;

        //neste caso podem ser utilizados os métodos próprios da interface para formar essa concatenação
        //neste caso, estes métodos devem receber como parâmetro um predicado contendo outra função lambda
        if(isPar.and(isTresDigitos).test(122)){
            System.out.println("\neste número é par e possui três dígitos");
        }
    }
}
