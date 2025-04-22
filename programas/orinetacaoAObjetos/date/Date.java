package orinetacaoAObjetos.date;

public class Date {
    private String date;

    public int getDia(){
        int dia = Integer.parseInt(date.substring(0, 2));
        return dia;
    }
    public int getMes(){
        int mes = Integer.parseInt(date.substring(3, 5));
        return mes;
    }
    public int getAno(){
        int ano = Integer.parseInt(date.substring(6, 10));
        return ano;
    }
    public String getDate(){
        return date;
    }

    public void setDia(int dia) throws IndexOutOfBoundsException{
        if(dia > 0){
            int mesDate = Integer.parseInt(date.substring(3, 5));
            String replace;
            int divMes = mesDate % 2;

            if(mesDate <= 7){
                switch(divMes){
                    case 1:
                        if(dia <= 31){
                            replace = (dia < 10) ? "0" + Integer.toString(dia) : Integer.toString(dia);
                            date = date.replace(date.substring(0, 2), replace);
                        } else {
                            throw new IndexOutOfBoundsException("para os dias ímpares até julho, os dias devem ir de 01 à 31");
                        }
                        break;

                    case 0:
                        if(mesDate == 2){
                            if(dia <= 28){
                                replace = (dia < 10) ? "0" + Integer.toString(dia) : Integer.toString(dia);
                                date = date.replace(date.substring(0, 2), replace);
                            } else {
                                throw new IndexOutOfBoundsException("para o mes de fevereiro, os dias devem ir de 01 à 28");
                            }
                        } else {
                            if(dia <= 30){
                                replace = (dia < 10) ? "0" + Integer.toString(dia) : Integer.toString(dia);
                                date = date.replace(date.substring(0, 2), replace);
                            } else {
                                throw new IndexOutOfBoundsException("para os meses pares antes de julho, os dias devem ir de 01 à 30");
                            }
                        }
                        break;
                
                    default:
                        System.out.println("\nalgo estranho aconteceu\n");
                        break;
                }
            } else {
                switch(divMes){
                    case 1:
                        if(dia <= 30){
                            replace = (dia < 10) ? "0" + Integer.toString(dia) : Integer.toString(dia);
                            date = date.replace(date.substring(0, 2), replace);
                        } else {
                            throw new IndexOutOfBoundsException("para os meses ímpares depois de julho, os dias devem ir de 01 à 30");
                        }
                        break;

                    case 0:
                        if(dia <= 31){
                            replace = (dia < 10) ? "0" + Integer.toString(dia) : Integer.toString(dia);
                            date = date.replace(date.substring(0, 2), replace);
                        } else {
                            throw new IndexOutOfBoundsException("para os meses pares depois de julho, os dias devem ir de 01 à 31");
                        }
                        break;
                
                    default:
                        System.out.println("\nalgo estranho aconteceu\n");
                        break;
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Os dias devem estar no seguinte intervalo: 0 < dia <= 31");
        }
    }
    public void setMes(int mes) throws IndexOutOfBoundsException{
        if(mes > 0 && mes <= 12){
            String mesString;
            mesString = (mes < 10) ? "0" + Integer.toString(mes) : Integer.toString(mes);
            date = date.replace(date.substring(3, 5), mesString);
        } else {
            throw new IndexOutOfBoundsException("Os meses devem estar no seguinte intervalo: 0 < mes <= 12");
        }
    }
    public void setAno(int ano) throws IndexOutOfBoundsException{
        if(ano >= 1000 && ano <= 2025){
            date = date.replace(date.substring(6, 10), Integer.toString(ano));
        } else {
            throw new IndexOutOfBoundsException("Os anos devem estar no seguinte intervalo: 1000 < ano <= 2025");
        }
    }
    public void setDate(int dia, int mes, int ano) throws IndexOutOfBoundsException{
        Date dataObj = new Date(); 
        try {
            dataObj.setDia(dia);
            dataObj.setMes(mes);
            dataObj.setAno(ano);
        }
        catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }

        date = dataObj.getDate();
    }

    public Date(){
        date = "01/02/1000";
    }
    public Date(int dia, int mes, int ano){
        date = "01/02/1000";

        Date dateObj = new Date();

        dateObj.setDate(dia, mes, ano);
        date = dateObj.getDate();
    }
}
