package aula11.ex2;

public class Filmes 
{
    private int codigo;
    private String nome;
    private String categoria;
    private String[] atoresPrincipais;
    private int anoLancamento;

    public Filmes()
    {
        this.nome = "Sem nome";
        this.categoria = "Sem categoria";
    }

    public Filmes (int codigo, String[] atoresPrincipais, int anoLancamento) 
    {
        this.codigo = codigo;
        this.nome = "Sem nome";
        this.categoria = "Sem categoria";
        this.atoresPrincipais = atoresPrincipais;
        this.anoLancamento = anoLancamento;
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

    public String[] getAtoresPrincipais() 
    {
        return this.atoresPrincipais;
    }

    public String getAtoresPrincipais(int index)
    {
        return this.atoresPrincipais[index]; 
    }

    public void setAtoresPrincipais(String[] atoresPrincipais) 
    {
        this.atoresPrincipais = atoresPrincipais;
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

    public void exibeDadosFilme() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Atores principais: ");
        for (String ator : atoresPrincipais) {
            System.out.println(ator);
        }
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public static void main(String[] args) {
        String[] atores = {"Ator 1", "Ator 2", "Ator 3", "Ator 4", "Ator 5", "Ator 6", "Ator 7", "Ator 8", "Ator 9", "Ator 10"};
        String[] atores2 = {"Ana de Armas", "Angelina Jolie", "Ben Affleck", "Anthony Hopkins", "Kate Winslet", "Pedro Pascal", "Keanu Reeves", "Lupita Nyong'o", "Nicole Kidman", "Will Smith"};
        Filmes filme = new Filmes(123, atores, 2020);
        filme.setNome("Filme X");
        filme.setCategoria("Comédia");
        filme.exibeDadosFilme();
        filme.setAtoresPrincipais(atores2); //testando setAtoresPrincipais com um novo array
        filme.exibeDadosFilme();
        filme.setAtoresPrincipais(2, "Tom Hanks"); //testando setAtoresPrincipais trocando um único ator (Ben Affleck => Tom Hanks)
        filme.exibeDadosFilme();
    }
    
}
