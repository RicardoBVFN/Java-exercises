package funcoesLambda.principaisInterfaces;
import java.util.function.UnaryOperator;

//Operadores unários recebem um operador do tipo T e retorna um valor também do tipo T

public class operadorUnario {
    public static void main(String[] args) {
        int valor = 0;

        //declaração de um operador unário que soma dois a um número inteiro
        UnaryOperator<Integer> maisDois = x -> x + 2;
        
        //para implementar um operador unário usa-e o método apply
        System.out.println(maisDois.apply(valor));

        //também é possível realizar encadeamentos de funções por meio do andthen

        //declaração de outros operadores unários
        UnaryOperator<Integer> vezesDois = x -> x * 2;
        UnaryOperator<Integer> aoQuadrado = x -> x * x;

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(valor));
        //prestar atenção na ordem das funções pois os resultados podem ser diferentes
        //no caso acima a sequencia de execução é: somar 2, multiplicar por dois e elevar ao quadrado

        System.out.println(maisDois.andThen(aoQuadrado).andThen(vezesDois).apply(valor));
        //agora após somar dois ele eleva ao quadrado e depois multiplica por dois, alterando o resultado final
    }
}
