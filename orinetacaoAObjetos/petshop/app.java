package orinetacaoAObjetos.petshop;
import personalClasses.Verificador;
import java.util.ArrayList;

public class app {
    private static final Verificador verificador = new Verificador();
    public static void main(String[] args) {
        ArrayList<Pet> listaPets = new ArrayList<>();

        while(true){
            int userResponse;
            String[] respostas = {"sim", "não, encerrar cadastro"};

            userResponse = verificador.boxNumero("cadastrar um novo pet?", 2, false, respostas);

            if(userResponse == 1){
                Pet pet = new Pet();
                pet.setNomePet(verificador.stringValida("um nome para o novo pet"));
                pet.setRacaPet(verificador.stringValida("a raca do novo pet"));
                pet.setPrecoPet(verificador.doubleValido("um preço para o novo pet"));
                pet.setDescricaoPet(verificador.stringValida("uma breve descrição para o novo pet"));
                listaPets.add(pet);
            } else {
                break;
            }
        }

        System.out.print("\n");

        for(Pet pet : listaPets){
            System.out.printf("Nome do pet: %s\nRaça do pet: %s\nPreço do pet: %.2f\ndescrição do pet: %s\n\n", pet.getNomePet(), pet.getRacaPet(), pet.getPrecoPet(), pet.getDescricaoPet());
        }
    }
}
