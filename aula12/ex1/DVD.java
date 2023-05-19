package ex1;

import java.util.Scanner;

public class DVD extends Midia{
    private int nFaixas;

    public DVD()
    {
        this(0,0.0,"Nenhum", 0);
    }

    public DVD(int cod, double pre, String nom, int nFaixas)
    {
        super(cod, pre, nom);
        setFaixas(nFaixas);
    }

    // public String getTipo()
    // {
    //     return this.getClass().getName();
    // }

    public String getTipo()
    {
        return "DVD: ";
    }

    public String getDetalhes()
    {
        return super.getDetalhes()+"\n Numero de musicas: " + nFaixas + "\n";
    }

    public void setFaixas(int nfaix)
    {
        nFaixas = (nfaix > 0) ? nfaix : 0; //WTF??
    }

    public void inserirDados()
    {
        super.inserirDados();
        Scanner in = new Scanner(System.in);
        System.out.println("\n Entre com o numero de faixas: ");
        int nfaix = in.nextInt();
        setFaixas(nfaix);
    }
}
