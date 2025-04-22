package orinetacaoAObjetos.relacionamentoClasses;
import java.util.UUID;

public class Item {

    private final String id = UUID.randomUUID().toString();
    private final Produto product = new Produto();
    private int amount;

    public String getId() throws IllegalStateException{
        if(this.id != null){
            return this.id;
        } else{
            throw new IllegalStateException("algo de errado ocorreu na definição do id");
        }
    }
    public Produto getProduct() throws IllegalStateException{
        if(product != null){
            return product;
        } else{
            throw new IllegalStateException("algo de errado ocorreu na definição padrão do produto");
        }
    }
    public int getAmount() throws IllegalStateException{
        if(amount != 0){
            return amount;
        } else{
            throw new IllegalStateException("o valor de 'amount' ainda não foi definido");
        }
    }

    public void setProduct(Produto product) throws IllegalArgumentException, NullPointerException, IllegalStateException, RuntimeException{
        if(product != null){
            try{
                this.product.setNome(product.getNome());
                this.product.setPreco(product.getPreco());
            }
            catch(IllegalArgumentException i){
                throw new IllegalStateException(i.getMessage());
            }
            catch(NullPointerException n){
                throw new NullPointerException(n.getMessage());
            }
            catch(IllegalStateException s){
                throw new IllegalStateException(s.getMessage());
            }
            catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }

        } else{
            throw new IllegalArgumentException("o parâmetro passado é nulo");
        }
    }
    public void setAmount(int amount) throws IllegalStateException{
        if(amount > 0){
            this.amount = amount;
        } else{
            throw new IllegalStateException("o parâmetro passado é inválido");
        }
    }

    @Override
    public boolean equals(Object comparado){
        if(comparado != null){
            if(comparado == this){
                return true;
            } else if(comparado.getId() != null && comparado.getId().equals(this.id)){
                if(comparado.getAmount() == this.amount){
                    if(this.product.equals(comparado.getProduct())){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public Item(Produto product, int amount){

        Item neww =  new Item();

        neww.setProduct(product);
        neww.setAmount(amount);

        this.product.setNome(neww.product.getNome());
        this.product.setPreco(neww.product.getPreco());
        this.amount = amount;
    }
    private Item(){
        this.amount = 0;
    }
}
