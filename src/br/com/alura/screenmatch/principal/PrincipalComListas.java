package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Suzume", 2022);
        Filme outroFilme = new Filme("Avatar", 2012);
        var filmeDoNicolas = new Filme("Transformers", 2007);
        filmeDoNicolas.avalia(10);
        Serie minhaSerie = new Serie("MAD", 2012);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoNicolas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());
        }
    }
}
