package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }

    public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for ( Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervaloAno.add(l);
                }
            }
        }
        return livrosIntervaloAno;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "jose vieira", 2020);
        catalogoLivros.adicionarLivro("Livro1", "jose vieira", 2020);
        catalogoLivros.adicionarLivro("Livro2", "maria", 2022);
        catalogoLivros.adicionarLivro("Livro3", "camila puta", 2021);

        System.out.println(catalogoLivros.pesquisarAutor("maria"));
        System.out.println(catalogoLivros.pesquisaIntervaloAnos(2021, 2022));
        System.out.println(catalogoLivros.pesquisarTitulo("Livro1"));
    }
}
