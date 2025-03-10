package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

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

        List<Titulo> lista = new LinkedList<>();
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

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jhonny Deep");
        buscaPorArtista.add("Dwayne Johnson");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de Titulos ordenadas");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
