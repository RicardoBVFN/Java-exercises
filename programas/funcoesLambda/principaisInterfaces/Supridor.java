package funcoesLambda.principaisInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supridores recebem nenhum parâmetro e retorna um valor do tipo T

public class Supridor {
    public static void main(String[] args) {
        //declaração de um supridor que retorna uma lista de Strings
        //esse tipo de interface é mais comumente utilisado para realizar consultas de dados
        Supplier<List<String>> umaLista = () -> Arrays.asList("teste 1", "teste 2", "teste 3");

        //para implementar um supridor usa-se o método "get"
        List<String> lista = umaLista.get();
        
        //print de todos os elementos dessa lista
        lista.forEach(x -> System.out.println(x));
    }
}
