package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio = new Episodio();

        Filme meuFilme = new Filme("Suzume", 2022);
        meuFilme.setDuracaoEmMinutos(120);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("MAD", 2012);
        minhaSerie.exibirFichaTecnica();
        minhaSerie.setTemporadas(11);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(15);
        System.out.println("Duração para maratonar MAD: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2012);
        outroFilme.setDuracaoEmMinutos(200);

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        filtro.filtra(meuFilme);

        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);

        var filmeDoNicolas = new Filme("Transformers", 2007);
        filmeDoNicolas.setDuracaoEmMinutos(128);
        filmeDoNicolas.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoNicolas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());


    }
}
