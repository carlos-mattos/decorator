public class Terror extends CategoriaDecorator {

    public Terror(Categoria categoria){
        super(categoria);
    }

    public float getPorcentagemNoAcervo() {
        return 15.0f;
    }

    public String getNomeEstrutura() {
        return "Terror";
    }
}
