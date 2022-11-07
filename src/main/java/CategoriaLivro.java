public class CategoriaLivro implements Categoria {

    public float porcentagemNoAcervo;

    public CategoriaLivro() {}

    public CategoriaLivro(float porcentagemNoAcervo) {
        this.porcentagemNoAcervo = porcentagemNoAcervo;
    }

    public String getEstrutura() {
        return "Livro";
    }

    public float porcentagemNoAcervo() {
        return porcentagemNoAcervo;
    }
}
