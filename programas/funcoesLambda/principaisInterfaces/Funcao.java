package funcoesLambda.principaisInterfaces;
import java.util.function.Function;

//Funções recebem um parâmetro do tipo T e retornam um resultado do tipo R

public class Funcao {
    public static void main(String[] args) {
        
        //declaração de uma função que recebe umma nota e retorna a cituação de um aluno
        Function<Double, String> calculoMedia = x -> x >= 7.0 ? "aprovado" : "reprovado";

        //para implementar uma função usa-se o método "apply"
        System.out.println(calculoMedia.apply(9.2));

        //também é possível concatenar funções
        //para haver concatenação a saída da primeira função deve ser do mesmo tipo da entrada da segunda

        //declaração da outra função lambda
        Function<String, String> situacao = x -> "o aluno está: " + x;

        //a concatenação é feita por meio do método "andThen", passando a outra função
        System.out.println("\n" + calculoMedia.andThen(situacao).apply(8.0));
    }
}
