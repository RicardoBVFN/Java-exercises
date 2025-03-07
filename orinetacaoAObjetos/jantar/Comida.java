package orinetacaoAObjetos.jantar;

public class Comida {
    private String nome;
    private double peso;

    public String getNome() throws NullPointerException{
        if(nome != null){
            return nome;
        } else {
            throw new NullPointerException("o campo 'nome' ainda não possui um valor, defina um valor para nome e tente novamente");
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
            throw new IllegalArgumentException("o nome de um objeto Comida não pode ser vazio");
        }
    }
    public void setPeso(double newPeso) throws IllegalArgumentException{
        if(newPeso <= 0){
            throw new IllegalArgumentException("o peso de um objeto Comida não pode ser menor que ou igual a zero");
        } else {
            peso = newPeso;
        }
    }

    Comida(String starterNome, double starterPeso){
        nome = starterNome;
        peso = starterPeso;
    }
    Comida(){
        nome = null;
        peso = 0.0;
    }
}
