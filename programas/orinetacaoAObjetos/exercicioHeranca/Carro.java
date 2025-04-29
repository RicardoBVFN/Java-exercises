package orinetacaoAObjetos.exercicioHeranca;

public class Carro {
    private int velocidade;
    private final int VELOCIDADE_MAXIMA;

    public int getVelocidade(){
        return this.velocidade;
    }
    public int getVelocidadeMaxima(){
        return this.VELOCIDADE_MAXIMA;
    }

    public void acelerar(){
        this.velocidade = (this.velocidade + 5 <= VELOCIDADE_MAXIMA) ? this.velocidade + 5 : VELOCIDADE_MAXIMA;
    }
    public void freiar(){
        this.velocidade = (this.velocidade - 5 >= 0) ? this.velocidade - 5 : 0;
    }

    public Carro(int v, int vMax){
        this.velocidade = (v >= 0) ? v : 0;
        this.VELOCIDADE_MAXIMA = (vMax > 0) ? vMax : 120;
    }
    public Carro(int vMax){
        this.VELOCIDADE_MAXIMA = (vMax > 0) ? vMax : 120;
        this.velocidade = 0;
    }
}
