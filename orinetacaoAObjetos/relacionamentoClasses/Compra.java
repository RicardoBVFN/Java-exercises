import java.util.ArrayList;
import java.util.UUID;

public class Compra {
    
    private final String id_compra = UUID.randomUUID().toString();
    private String id_cliente;
    private final ArrayList<Item> carrinho = new ArrayList<>();

    public String getId_compra() throws IllegalStateException{
        if(this.id_compra != null){
            return this.id_compra;
        } else{
            throw new IllegalStateException("esta instância de Compra não possui id pois algo de errado ocorreu na sua definição");
        }
    }
    public String getId_cliente() throws IllegalStateException{
        if(this.id_cliente != null){
            return this.id_cliente;
        } else{
            throw new IllegalStateException("esta instância de Compra ainda não possui um id de comprador associado ou algo ocorreu errado na definição de id na criação do cliente passado como parâmetro na criação desta intância");
        }
    }
    public Item[] getCarrinho() throws IllegalStateException{
        if(this.carrinho != null){
            if(!this.carrinho.isEmpty()){
                Item[] carrinhoReturn = this.carrinho.toArray(new Item[this.carrinho.size()]);
                return carrinhoReturn;
            } else{
                throw new IllegalStateException("esta instância de Compra não possui nenhum item associado a ela");                
            }
        } else{
            throw new IllegalStateException("algo ocorreu errado na definição do carrinho desta instância de Compra");
        }
    }

    private void setId_cliente(Cliente client) throws IllegalArgumentException{
        try{
            this.id_cliente = client.getId();
        }
        catch(IllegalStateException i){
            throw new IllegalArgumentException("o cliente passado como parâmetro não possui um id válido");
        }
    }
    public void addItemCarrinho(Item newItem) throws RuntimeException, IllegalArgumentException{
        if(newItem != null){
            try{
                newItem.getAmount();
            }
            catch(IllegalStateException i){
                throw new IllegalArgumentException("o Item passado como parâmetro não possui um amount válido");
            }
            catch(Exception e){
                throw new RuntimeException("um erro inesperado ocorreu");
            }

            try{
                newItem.getId();
            }
            catch(IllegalStateException i){
                throw new IllegalArgumentException("o Item passado como parâmetro não possui um id válido");
            }
            catch(Exception e){
                throw new RuntimeException("um erro inesperado ocorreu");
            }

            try{
                newItem.getProduct();
            }
            catch(IllegalStateException i){
                throw new IllegalArgumentException("o Item passado como parâmetro não possui um produto associado válido");
            }
            catch(Exception e){
                throw new RuntimeException("um erro inesperado ocorreu");
            }

            this.carrinho.add(newItem);
        } else{
            throw new IllegalArgumentException("o parâmetro passado nesta função é nulo");
        }
    }
    public void removeItem(Item alvo){
        if(alvo != null){
            for(Item item : this.carrinho){
                if(item.equals(alvo)){
                    this.carrinho.remove(item);
                }
            }
        }
    }

    public boolean equals(){
        
    }

    public Compra(Cliente client, Item item){

        setId_cliente(client);
        this.addItemCarrinho(item);
    }
    public Compra(Cliente client, Item[] itens){
        setId_cliente(client);
        for(Item item : itens){
            this.addItemCarrinho(item);
        }
    }
}
