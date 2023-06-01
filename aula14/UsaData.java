package aula14;

public class UsaData {
    public static void main(String[] args) {
        Data NovaData = new Data();
        NovaData.setDia(12);
        NovaData.setMes(8);
        NovaData.setAno(2003);
        System.out.println(NovaData.mostrarData());
    }
}
