package funcoesLambda;

public class app {
    public static void main(String[] args) {
        // Lambdas são funções anonimas que são definidas e utilizadas apenas uma vez
        
        //                        ,- sintaxe para definição do corpo de uma função lambda
        Calculo calculo = (a, b) -> {return a + b;};
        //                                  ^- corpo da função lambda
        
        // esta função é valida apenas para a variável calculo e apenas para este arquivo

        System.out.println(calculo.operacao(3, 4));
    }
}
