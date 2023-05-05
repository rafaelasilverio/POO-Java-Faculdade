package aula10_ex02;

import java.util.Scanner;

public class Aula10_ex02 {
  public static void main(String[] args) {

    Pessoa p = new Pessoa();

    Scanner console = new Scanner(System.in);

    System.out.println("Digite o seu nome");

    String nome = console.nextLine();

    p.setnome(nome);

    System.out.println("Digite o seu aniversario");

    String datanascimento = console.nextLine();

    p.setdatanascimento(datanascimento);

    System.out.println("Digite a sua altura");

    Float altura = console.nextFloat();

    p.setaltura(altura);
    p.exibedados();
    console.close();
  }

}
