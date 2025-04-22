package orinetacaoAObjetos.jantar;

public class Pessoa {
    private String nome;
    private double peso;

    public String getNome() throws IllegalArgumentException{
        if(nome != null){
            return nome;
        } else {
            throw new IllegalArgumentException("o campo 'nome' ainda não possui um valor, defina um valor para nome e tente novamente");
        }
    }
    public double getPeso() throws IllegalArgumentException{
        if(peso != 0.0){
            return peso;
        } else {
            throw new IllegalArgumentException("o campo 'peso' ainda não possui um valor, defina um valor para 'peso' e tente novamente");
        }
    }

    public void setNome(String newNome) throws IllegalArgumentException{
        if(newNome != ""){
            nome = newNome;
        } else {
            throw new IllegalArgumentException("o nome de um objeto Pessoa não pode ser vazio");
        }
    }
    public void setPeso(double newPeso) throws IllegalArgumentException{
        if(newPeso <= 0){
            throw new IllegalArgumentException("o peso de um objeto Pessoa não pode ser menor que ou igual a zero");
        } else {
            peso = newPeso;
        }
    }

    public void comer(Comida[] refeicao) throws IllegalArgumentException{
        for(int i = 0;i < refeicao.length;i++){
            if(refeicao[i].getPeso() <= 0){
                String errorMessage = String.format("o valor do item de índice %d do array passado como parâmtro é negativo", i);
                throw new IllegalArgumentException(errorMessage);
            }
        }

        for(int i = 0;i < refeicao.length;i++){
            peso += refeicao[i].getPeso();
        }
    }
    
    Pessoa(String starterNome, double starterPeso){
        nome = starterNome;
        peso = starterPeso;
    }
    Pessoa(){
        nome = null;
        peso = 0.0;
    }
}
