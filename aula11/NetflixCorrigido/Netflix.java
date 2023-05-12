package aula11.NetflixCorrigido;
import java.util.ArrayList;
public class Netflix {

    ArrayList<Filme> filmes = new ArrayList<Filme>();

    public void adicionaFilme(int id, String nome, String categoria, String atores, int ano){
        filmes.add(new Filme(id,  nome,  categoria,  atores, ano));
    }

    public void exibeFilme(int id)
    {
        Filme filmePeloId = buscaPeloId(filmes, id)
    }
}
