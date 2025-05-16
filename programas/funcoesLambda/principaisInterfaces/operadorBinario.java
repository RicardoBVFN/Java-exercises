package funcoesLambda.principaisInterfaces;
import java.util.function.BinaryOperator;

// operadores binários recebem dois parametros do tipo T e retornam um valor também do tipo T

public class operadorBinario {
    public static void main(String[] args) {
        //declaração de um operador binário que soma dois números inteiros
        BinaryOperator<Integer> soma = (x, y) -> x + y;

        //para implementar o operador binário usa-se o método "apply" passando os valores
        System.out.println(soma.apply(2, 3));

        //operadores binários também podem ser concatenados com outras fuções, mas não diretamente com outro operador binário
        //como em java é possivel retornar apenas um valor por método, seria necessário passar o resultado juntamente com outro valor externo
    }
}
