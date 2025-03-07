package orinetacaoAObjetos.jantar;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<ArrayList<Comida>> refeicoes = new ArrayList<>();
        int respostaListagem;

        while(true){
            int respostaCadastro;

            
            String respostas[] = {"sim", "não, sair do menu de cadastro"};
            respostaCadastro = Verificador.boxNumero("cadastrar uma nova pessoa?", 2, false, respostas);

            if(respostaCadastro == 1){
                Pessoa user = new Pessoa();

                user.setNome(Verificador.stringValida("um nome para a nova pessoa"));
                user.setPeso(Verificador.doubleValido("o peso da nova pessoa em Kilogramas"));
                pessoas.add(user);
            } else {
                break;
            }
        }

        for(Pessoa user : pessoas){
            refeicoes.add(new ArrayList<>());

            while(true){
                int respostaIngredientes;
                Comida ingrediente = new Comida();

                ingrediente.setNome(Verificador.stringValida("um nome para o ingrediente da sua refeição"));
                ingrediente.setPeso(Verificador.doubleValido("o peso em Kilogramas utilizado do seu ingrediente"));

                refeicoes.get(pessoas.indexOf(user)).add(ingrediente);

                String[] respsotasBox = {"sim", "não, encerrar este cadastro de ingredientes"};
                respostaIngredientes = Verificador.boxNumero("cadastrar mais algum ingrediente?", 2, false, respsotasBox);

                if(respostaIngredientes == 2){
                    break;
                } else {
                    continue;
                }
            }
        }

        String[] respostasBox = {"sim", "não, encerrar programa"};
        respostaListagem = Verificador.boxNumero("listar os usuários e suas refeições?", 2, false, respostasBox);

        if(respostaListagem == 1){
            System.out.print("\n");

            for(Pessoa user : pessoas){
                System.out.printf("o usuário %s, de id %d, ingeriu os seguintes ingredientes: ", user.getNome(), pessoas.indexOf(user) + 1);

                double pesoInicial = user.getPeso();

                for(Comida ingrediente : refeicoes.get(pessoas.indexOf(user))){
                    System.out.print(ingrediente.getNome() + ", " + ingrediente.getPeso() + "Kg; ");
                    user.setPeso(user.getPeso() + ingrediente.getPeso());
                }

                System.out.printf("assim engordando %.3fKg, atingindo um peso final de %.3fKg\n", user.getPeso() - pesoInicial, user.getPeso());
            }
        }

        System.out.println("\nobrigado por usar a noossa aplicação, volte sempre!");
    }
}
