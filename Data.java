public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        if (validarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Definindo para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    private boolean validarData(int dia, int mes, int ano){
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1){
            return false;
        }
        
        int maxDias;
        switch (mes){
            case 2: //fevereiro
                maxDias = verificaAnoBissexto() ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11: //abril, junho, setembro, novembro
                maxDias = 30;
                break;
            default: //demais meses nao mencionados antes
                maxDias = 31;
        }
        return dia <= maxDias;
    }
    
    public boolean verificaAnoBissexto(){
        return (ano % 400 == 0) || (ano % 100 != 0 && ano % 4 == 0);
    }
    //getters
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    //setters
    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido para o mês/ano atual!");
        }
    }
    
    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido para o dia/ano atual!");
        }
    }
    
    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido para o dia/mês atual!");
        }
    }
    //toString
    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}