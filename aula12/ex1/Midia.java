package ex1;

public class Midia{
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){
        
    }

    public Midia(int c, double p, String n)
    {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getTipo()
    {
        return this.getClass().getName();
    }

    public String getDetalhes()
    {
        return this.getDetalhes();
    }

    public void printDados()
    {
        this.getTipo();
        this.getDetalhes();
    }

    public void inserirDados()
    {
        
    }
}