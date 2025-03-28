public class Produto {
    
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
