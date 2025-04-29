package orinetacaoAObjetos.exercicioHeranca;

public class app{
    public static void main(String[] args) {
        Carro civic = new Civic(140);
        Carro ferrari = new Ferrari(320);

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("velocidade do Civic: " + civic.getVelocidade());
        System.out.println("velociade da Ferrari: " + ferrari.getVelocidade());
    }
}
