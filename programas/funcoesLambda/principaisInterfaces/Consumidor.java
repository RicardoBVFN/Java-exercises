package funcoesLambda.principaisInterfaces;
import java.util.function.Consumer;

//Consumidores recebem um parâmetro do tipo T e não possuem um retorno

public class Consumidor {
    public static void main(String[] args) {

        //declaração de um consumidor que adiciona dois a um valor inteiro
        //observe que não há retorno, apenas uma manipulação de valor
        Consumer<Integer> maisDois = x -> {System.out.println(x + 2);};
        
        //para chamar a função lambda, usace o método accept
        maisDois.accept(0);

    }
}
