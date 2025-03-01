package orinetacaoAObjetos.date;
//import java.util.Scanner;

public class app {
    //private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Date testeData1 = new Date();
        Date testeData2 = new Date(27, 9, 2005);

        System.out.println(testeData1.getDate());
        System.out.println(testeData2.getDate());

        testeData1.setDia(4);
        System.out.println("\n" + testeData1.getDate());
        testeData1.setMes(3);
        System.out.println(testeData1.getDate());
        testeData1.setAno(2010);
        System.out.println(testeData1.getDate());

        testeData1.setDate(1, 3, 2025);
        System.out.println("\n" + testeData1.getDate());
              
    }
}
