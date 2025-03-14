package orinetacaoAObjetos.petshop;

public class Pet {

    private String nomePet;
    private String racaPet;
    private double precoPet;
    private String descricaoPet;
    
    public String getNomePet() throws IllegalStateException{
        if(nomePet != null){
            return nomePet;
        } else {
            throw new IllegalStateException("o nome do pet ainda não foi definido");
        }
    }
    public String getRacaPet() throws IllegalStateException{
        if(racaPet != null){
            return racaPet;
        } else {
            throw new IllegalStateException("a raça do pet ainda não foi definida");
        }
    }
    public double getPrecoPet() throws IllegalStateException{
        if(precoPet != 0.0){
            return precoPet;
        } else {
            throw new IllegalStateException("o preço do pet ainda não foi definido");
        }
    }
    public String getDescricaoPet() throws IllegalStateException{
        if(descricaoPet != null){
            return descricaoPet;
        } else {
            throw new IllegalStateException("a dercrição do pet ainda não foi definido");
        }
    }

    public void setNomePet(String newNomePet){
        nomePet = newNomePet;
    }
    public void setRacaPet(String newRacaPet){
        racaPet = newRacaPet;
    }
    public void setPrecoPet(double newPrecoPet){
        precoPet = newPrecoPet;
    }
    public void setDescricaoPet(String newDescricaoPet){
        descricaoPet = newDescricaoPet;
    }

    Pet(String newNome, String newRaca, double newPreco, String newDescricao){
        nomePet = newNome;
        racaPet = newRaca;
        precoPet = newPreco;
        descricaoPet = newDescricao;
    }
    Pet(){
        nomePet = null;
        racaPet = null;
        precoPet = 0.0;
        descricaoPet = null;
    }
}
