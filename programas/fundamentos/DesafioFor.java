package fundamentos;
public class DesafioFor {
    public static void main(String[] parametro){
        
        for(String padrao = "#";!padrao.equals("######");padrao += "#"){
            System.out.println(padrao);
        }
    }
}
//sem usar valor numerico no controle do laço FOR