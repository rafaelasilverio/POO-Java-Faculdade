package ex1;
public class DVD extends Midia{
    private int nFaixas;

    public DVD(){}

    public DVD(int c, double p, String s, int f)
    {
        Midia novoDVD = new Midia(c, p, s);
        this.nFaixas = f;
    }

    public String getTipo()
    {
        return this.getClass().getName();
    }

    public String getDetalhes()
    {
        String detalhes = "Codigo: "+super.getCodigo()+"\n Preco: "+super.getPreco()+"\n Nome: "+super.getNome()+"\n Tipo: "+this.getTipo();
        return detalhes;
    }

    public void setFaixas(int f)
    {
        this.nFaixas = f;
    }

    public void inserirDados()
    {
        
    }
}
