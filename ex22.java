import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        int dias, horas, minutos, segundos, resultadoEmSegundos;
        Scanner leitura = new Scanner(System.in);

        System.out.println();
        System.out.print("Informe a quantidade de dias: ");
        dias = leitura.nextInt();
        System.out.println();

        System.out.print("Informe a quantidade de horas: ");
        horas = leitura.nextInt();
        System.out.println();

        System.out.print("Informe a quantidade de minutos: ");
        minutos = leitura.nextInt();
        System.out.println();

        System.out.print("Informe a quantidade de segundos: ");
        segundos = leitura.nextInt();
        System.out.println();

        resultadoEmSegundos = (dias * 86400) + (horas * 3600) + (minutos * 60) + segundos;

        System.out.println();
        System.out.println(dias+" dias, "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos resultam em "+resultadoEmSegundos+" segundos.");
        leitura.close();
    }
}
