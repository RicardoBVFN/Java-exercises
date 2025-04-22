package orinetacaoAObjetos.relacionamentoClasses;
import java.util.UUID;
import java.math.RoundingMode;

public class Produto {
    
    private final String id = UUID.randomUUID().toString();
    private String nome;
    private double preco;

    public String getNome() throws NullPointerException{
        if(nome != null){
            return this.nome;
        } else{
            throw new NullPointerException("o valor de 'nome' ainda não foi definido");
        }
    }
    public double getPreco() throws IllegalStateException{
        if(preco > 0.0){
            return this.preco;
        } else{
            throw new IllegalStateException("o valor de 'preco' ainda não foi definido");
        }
    }
    public String getId(){
        if(this.id != null){
            return this.id;
        } else{
            throw new IllegalStateException("algo de errado ocorreu na definição do id dessa intância");
        }
    }

    public void setNome(String newName) throws IllegalArgumentException{
        if(newName != null){
            if(newName.trim() != ""){
                if(!newName.trim().contains("\n")){
                    if(!newName.equalsIgnoreCase(this.nome)){
                        this.nome = newName;
                    } else{
                        throw new IllegalArgumentException("o parâmetro passado é igual ao valor original de 'nome'");
                    }
                } else{
                    throw new IllegalArgumentException("o parâmetro passado contém uma quabra de linha");
                }
            } else{
                throw new IllegalArgumentException("o parâmetro passado é uma string vazia");
            }
        } else{
            throw new IllegalArgumentException("o parâmetro passado é nulo");
        }
    }
    public void setPreco(double newPreco) throws IllegalArgumentException{
        if(newPreco > 0.0){
            this.preco = newPreco;
        } else{
            throw new IllegalArgumentException("o valor passado como parâmetro é inválido");
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            if(obj instanceof Produto){
               
            }
        }
        if(comparado != null){
            if(comparado == this){
                return true;
            }
            if(comparado.getId() != null && comparado.getId().equals(this.id)){
                if(comparado.getNome() != null && comparado.getNome().equals(this.nome)){
                    if(Math.abs(this.preco - comparado.getPreco()) < 0.0001){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    Produto(String nome, double preco){
        Produto neww = new Produto();

        neww.setNome(nome);
        neww.setPreco(preco);

        this.nome = neww.getNome();
        this.preco = neww.getPreco();
    }
    Produto(){
        this.nome = null;
        this.preco = 0.0;
    }
}
