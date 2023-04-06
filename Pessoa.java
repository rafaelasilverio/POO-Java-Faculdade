import javax.swing.JOptionPane;

class Pessoa {
    private String nome; private int idade;
    private String telefone;

    public Pessoa(String n, int i, String f)
    {
        nome = n;
        idade = i;
        telefone = f;
    }

    public void novo_fone(String f)
    {
        telefone = f;
    }

    public void novo_fone()
    {
        telefone = JOptionPane.showInputDialog("Novo fone");
    }

    public String nro_fone()
    {
        return telefone;
    }
}
