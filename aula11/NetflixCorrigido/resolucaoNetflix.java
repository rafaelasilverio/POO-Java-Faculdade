package aula11.NetflixCorrigido;

import java.util.Scanner;

public class resolucaoNetflix {
    public static void main(String[] args) {
        int id;
        String nome;
        String categoria;
        String atores;
        int ano;

        Netflix n = new Netflix();

        Scanner console = new Scanner(System.in);

        System.out.println("-- Entre com os dados do filme -- \n");
        System.out.println("Digite um id para o filme: ");
        id = Integer.parseInt(console.nextLine());
        System.out.println("Digite o nome do filme: ");
        nome = console.nextLine();
        System.out.println("Digite a categoria do filme: ");
        categoria = console.nextLine();
        System.out.println("Digite os atores: ");
        atores = console.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        ano = console.nextInt();
        n.dicionaFilme(id, nome, categoria, atores, ano);
        console.close();
        n.exibeFilme(1);
    }
}
