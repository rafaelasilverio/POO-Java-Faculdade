package aula14;

public class Data
{
    int dia;
    int mes;
    int ano;
    String[] meses = {"Meses", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public int getDia() 
    {
        return this.dia;
    }

    public int getMes() 
    {
        return this.mes;
    }

    public int getAno() 
    {
        return this.ano;
    }

    public void setDia(int dia) 
    {
        if(dia <= 31){
            this.dia = dia;
        }
    }

    public void setMes(int mes) 
    {
        if(mes <= 12){
            this.mes = mes;
        }
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    public String mostrarData()
    {
        return dia+" de "+meses[mes]+" de "+ano;
    }
}