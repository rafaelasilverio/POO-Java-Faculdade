package ex1;

import java.util.Scanner;

public class Midia{
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){
        this(0,0.0,"Nenhum");
    }

    public Midia(int c, double p, String n)
    {
        setCodigo(c);
        setPreco(p);
        setNome(n);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "Midia: ";
    }

    // public String getTipo()
    // {
    //     return this.getClass().getName();
    // }

    public String getDetalhes()
    {
        return "Codigo: " + getCodigo() + "\n" +
               "Preco: " + getPreco() + "\n" +
               "Nome: " + getNome() + "\n";
    }

    public void printDados()
    {
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }

    public void inserirDados()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\n Entre com o código: ");
        int cod = in.nextInt();
        System.out.println("\n Entre com o preco: ");
        double pre = in.nextDouble();
        System.out.println("\n Entre com o nome: ");
        String nome = in.nextLine();
        setCodigo(cod);
        setPreco(pre);
        setNome(nome);
    }
}