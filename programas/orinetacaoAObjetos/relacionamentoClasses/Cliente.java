package orinetacaoAObjetos.relacionamentoClasses;
import java.util.UUID;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cliente {
    private final String id = UUID.randomUUID().toString();
    private String senha;
    private final ArrayList<Compra> compras = new ArrayList<>();

    public String getId() throws IllegalStateException{
        if(this.id != null){
            return this.id;
        } else{
            throw new IllegalStateException("algo de errado ocorreu na definição do id desta instância");
        }
    }
    public String getSenha() throws IllegalStateException{
        if(this.senha != null){
            return this.senha;
        } else{
            throw new IllegalStateException("a senha desta instância ainda não foi definida");
        }
    }
    public Compra[] getCompras() throws IllegalStateException{
        if(this.compras != null){
            if(!this.compras.isEmpty()){
                Compra[] comprasReturn = this.compras.toArray(new Compra[this.compras.size()]);
                return comprasReturn;
            } else{
                throw new IllegalStateException("esta instância não possui nenhuma compra associada a ela");
            }
        } else{
            throw new IllegalStateException("algo de errado ocorreu na definição do campo 'compras' desta instância");
        }
    }

    public void setSenha(String newSenha){
        if(newSenha != null){
            if(newSenha.trim() != ""){
                if(!newSenha.trim().contains("\n")){
                    if(!newSenha.equalsIgnoreCase(this.senha)){
                        try {
                            MessageDigest md = MessageDigest.getInstance("SHA-256");
                            byte[] hashBytes = md.digest(newSenha.getBytes());
                            StringBuilder senhaHash = new StringBuilder();
                            for (byte b : hashBytes) {
                                senhaHash.append(String.format("%02x", b));
                            }
                            this.senha = senhaHash.toString();
                        }
                        catch(NoSuchAlgorithmException e){
                            throw new RuntimeException("Erro: Algoritmo SHA-256 não está disponível.", e);
                        }
                    } else{
                        throw new IllegalArgumentException("o parâmetro passado é igual ao valor original de 'senha'");
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
    public void addCompra(Compra newCompra) throws IllegalArgumentException, IllegalStateException{
        if(this.compras != null){
            try{
                newCompra.getId_cliente();
                newCompra.getId_compra();
                newCompra.getCarrinho();

                this.compras.add(newCompra);
            }
            catch(IllegalStateException i){
                throw new IllegalArgumentException(i.getMessage());
            }
        } else{
            throw new IllegalStateException("algo de errado ocorreu na definição do campo 'compras' desta instância");
        }
    }
    public void removeCompra(){

    }

    
}
