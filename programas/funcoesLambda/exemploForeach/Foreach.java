package funcoesLambda.exemploForeach;
import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args) {
        
        ArrayList<String> aprovados = new ArrayList<>();
        aprovados.add("ana");
        aprovados.add("bia");
        aprovados.add("gui");

        //de forma convencional
        for(String nome : aprovados){
            System.out.println(nome + "!!!");
        }

        System.out.println("\n");

        //usando uma função lambda | nome será o parametrom passado pela varredura do método foreach
        aprovados.forEach(nome -> {System.out.println(nome + "!!!");});

        System.out.println("\n");

        //usando Mathod Reference    ,- essa nomenclatura passa a referencia do método println para a função foreach e esta a usa tendo como parâmetro o elemento atual da varredura
        aprovados.forEach(System.out::println);

    }
}
