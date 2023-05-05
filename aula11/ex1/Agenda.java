package aula11.ex1;

public class Agenda//essa classe precisa ser finalizada
{
    //atributos
    private Pessoa novas_pessoas[];
    int contador;

    //métodos
    public Agenda()
    {
        this.novas_pessoas = new Pessoa[10];
        this.contador = 0;
    }
//adicionar visibilidades
    void armazenaPessoa(String nome, int idade, float altura)
    {
        if(contador < 10)//controlar para que o armazenamento possa ser feito em partes que tenham tido a pessoa removida
        {
            novas_pessoas[contador] = new Pessoa(nome, idade, altura);
            contador++;
            System.out.println("Pessoa cadastrada com sucesso!");
        }
    }

    void removePessoa(String nome)
    {
        for(int i = 0; i < novas_pessoas.length; i++)
        {
            if(novas_pessoas[i].getNome().equals(nome))
            {
                novas_pessoas[i] = null;
            }
        }
    }

    int buscaPessoa(String nome)
    {
        return 1;
    }

    void imprimeAgenda()
    {

    }

    void imprimePessoa(int index)
    {

    }


}
