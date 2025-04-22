package orinetacaoAObjetos.produto;

public class Produto{
    private double preco, desconto;
    private int id;
    private String nome;

    public Produto(double arg1, double arg2, int arg3){
        preco = arg1;
        desconto = arg2;
        id = arg3;
    }
    public Produto(){
        preco = 0;
        desconto = 0;
        id = 0;
        nome = "default";
    }

    public double getPreco(){
        return preco;
    }
    public double getDesconto(){
        return desconto;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }

    public void setPreco(double newPreco){
        preco = newPreco;
    }
    public void setDesconto(double newDesconto){
        desconto = newDesconto;
    }
    public void setId(int newId){
        id = newId;
    }
    public void setNome(String newNome){
        nome = newNome;
    }
}