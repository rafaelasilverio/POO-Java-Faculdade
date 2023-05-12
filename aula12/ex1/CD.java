package ex1;
public class CD extends Midia{
    private int nMusicas;

    public CD(){}

    public CD(int c, double p, String s, int m)
    {
        Midia novoDVD = new Midia(c, p, s);
        this.nMusicas = m;
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

    public void setMusicas(int m)
    {
        this.nMusicas = m;
    }
}
