package ex1;

import java.util.Scanner;

public class CD extends Midia{
    private int nMusicas;

    public CD()
    {
        this(0,0.0,"Nenhum", 0);
    }

    public CD(int cod, double pre, String nom, int nMusicas)
    {
        super(cod, pre, nom);
        setMusicas(nMusicas);
    }

    // public String getTipo()
    // {
    //     return this.getClass().getName();
    // }

    public String getTipo()
    {
        return "CD: ";
    }

    public String getDetalhes()
    {
        return super.getDetalhes()+"\n Numero de musicas: " + nMusicas + "\n";
    }

    public void setMusicas(int nmus)
    {
        nMusicas = (nmus > 0) ? nmus : 0; //WTF??
    }

    public void inserirDados()
    {
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        System.out.println("\n Entre com o numero de musicas: ");
        int nmus = in.nextInt();
        setMusicas(nmus);
    }

}
