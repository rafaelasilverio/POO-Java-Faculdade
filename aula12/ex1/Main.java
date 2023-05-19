package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Midia[] lista = new Midia[10];
        int opcao;

        for(int i=0; i < 2; i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("\n Digite 1 para CD e 2 para DVD: ");
            opcao = in.nextInt();

            if (1 == opcao) {
                lista[i] = new CD();
            }else{
                lista[i] = new DVD();
                lista[i].inserirDados();;
            }
        }
            for(int i=0; i < 2; i++)
            {
                lista[i].printDados();
            }
    }
}
