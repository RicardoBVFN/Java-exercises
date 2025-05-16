package funcoesLambda.principaisInterfaces;
import java.util.function.BiFunction;

//Uma dupla função recebe dois parâmetros de tipo T e U, respectivamente, e retorna um resultado do tipo R

public class duplaFunção {
    public static void main(String[] args) {
        
        //declaração de uma depla função que calcula a média de um aluno e retorna a sua situação
        BiFunction<Double, Double, String> calculoMedia = (x, y) -> (x + y) / 2 >= 7.0 ? "aprovado" : "reprovado";

        //para implementar uma dupla função usa-se o método "apply" passando os valores
        System.out.println(calculoMedia.apply(6.4, 8.6));

        //assim como no operador binário, uma dupla função também pode ser encadeada com outras funções
        //mas não diretamente com ouras funções duplas pelos mesmos motivos
    }
}
