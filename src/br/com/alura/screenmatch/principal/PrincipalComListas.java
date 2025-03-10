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
        meuFilme.avalia(8);
        outroFilme.avalia(10);
        Serie minhaSerie = new Serie("MAD", 2012);

        Filme f1 = filmeDoNicolas;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoNicolas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
}
