package orinetacaoAObjetos.exercicioHeranca;

public class Ferrari extends Carro{
    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
    }
    public Ferrari(int vMax){
        super(vMax);
    }
    public Ferrari(int v, int vMax){
        super(v, vMax);
    }
}
