import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CategoriaTest {

    @Test
    void deveRetornarPorcentagemDeLivrosNoAcervoTotal() {
        Categoria categoria = new CategoriaLivro(90);

        assertEquals(90.0f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosTerrorNoAcervoTotal() {
        Categoria categoria = new Terror(new CategoriaLivro(90));

        assertEquals(13.5f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosRomanceNoAcervoTotal() {
        Categoria categoria = new Romance(new CategoriaLivro(90));

        assertEquals(31.5f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosFantasiaNoAcervoTotal() {
        Categoria categoria = new Fantasia(new CategoriaLivro(90));

        assertEquals(18.0f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosTerrorComRomanceNoAcervoTotal() {
        Categoria categoria = new Terror(new Romance(new CategoriaLivro(90)));

        assertEquals(4.725f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosTerrorComFantasiaNoAcervoTotal() {
        Categoria categoria = new Terror(new Fantasia(new CategoriaLivro(90)));

        assertEquals(2.7f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosRomanceComFantasiaNoAcervoTotal() {
        Categoria categoria = new Romance(new Fantasia(new CategoriaLivro(90)));

        assertEquals(6.3f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarPorcentagemDeLivrosTerrorComRomanceComFantasiaNoAcervoTotal(){
        Categoria categoria = new Terror(new Romance(new Fantasia(new CategoriaLivro(90))));

        assertEquals(0.945f, categoria.porcentagemNoAcervo());
    }

    @Test
    void deveRetornarEstruturaDeLivros() {
        Categoria categoria = new CategoriaLivro();

        assertEquals("Livro", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosTerror() {
        Categoria categoria = new Terror(new CategoriaLivro());

        assertEquals("Livro/Terror", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosRomance() {
        Categoria categoria = new Romance(new CategoriaLivro());

        assertEquals("Livro/Romance", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosFantasia() {
        Categoria categoria = new Fantasia(new CategoriaLivro());

        assertEquals("Livro/Fantasia", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosTerrorComRomance() {
        Categoria categoria = new Terror(new Romance(new CategoriaLivro()));

        assertEquals("Livro/Romance/Terror", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosTerrorComFantasia() {
        Categoria categoria = new Terror(new Fantasia(new CategoriaLivro()));

        assertEquals("Livro/Fantasia/Terror", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosRomanceComFantasia() {
        Categoria categoria = new Romance(new Fantasia(new CategoriaLivro()));

        assertEquals("Livro/Fantasia/Romance", categoria.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDeLivrosTerrorComRomanceComFantasia(){
        Categoria categoria = new Terror(new Romance(new Fantasia(new CategoriaLivro())));

        assertEquals("Livro/Fantasia/Romance/Terror", categoria.getEstrutura());
    }

}
