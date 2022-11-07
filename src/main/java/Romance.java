public class Romance extends CategoriaDecorator{

    public Romance(Categoria categoria) {
        super(categoria);
    }

    public float getPorcentagemNoAcervo() {
        return 35.0f;
    }


    public String getNomeEstrutura() {
        return "Romance";
    }
}
