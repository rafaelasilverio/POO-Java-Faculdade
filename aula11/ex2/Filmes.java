package aula11.ex2;

import java.util.Scanner;

public class Filmes {
    private int codigo;
    private String nome;
    private String categoria;
    private String atoresPrincipais[];
    private int anoLancamento;

    Scanner entrada = new Scanner(System.in);

    public Filmes()
    {
        this.nome = "";
        this.categoria = "comedia";
    }

    public int getCodigo()
    {
        return this.codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getCategoria()
    {
        return this.categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public void getAtoresPrincipais()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i+"."+this.atoresPrincipais[i]);
        }
    }

    public void getAtoresPrincipais(int index)
    {
         System.out.println(this.atoresPrincipais[index]); 
    }

    public void setAtoresPrincipais(int index, String novoAtor)
    {
        this.atoresPrincipais[index] = novoAtor;
    }

    public int getAnoLancamento()
    {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int novoAno)
    {
        this.anoLancamento = novoAno;
    }

    public void exibeDadosFilme() 
    {
      System.out.println("Código: " + getCodigo());
      System.out.println("Nome: " + getNome());
      System.out.println("Categoria: " + getCategoria());
      System.out.println("Atores principais: ");
      this.getAtoresPrincipais();
      System.out.println("Ano de lançamento: " + getAnoLancamento());
    }

    public static void main(String[] args) 
    {
        Filmes filmes = new Filmes();
        filmes.setCodigo(1);
        filmes.setNome("A volta dos que nao foram");
        filmes.setCategoria("Drama");
        for(int i = 0; i < 10; i++)
        {
            String nome;
            System.out.println("Informe o nome do ator "+i+": ");
            nome = entrada.nextLine(); //finalizar
            filmes.setAtoresPrincipais(i, nome);
        }
        filmes.setAnoLancamento(2020);
        filmes.exibeDadosFilme();
    }
}
