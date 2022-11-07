public abstract class CategoriaDecorator implements Categoria {
    private Categoria categoria;

    public CategoriaDecorator(Categoria categoria){
        this.categoria = categoria;
    }

    public abstract float getPorcentagemNoAcervo();

    public float porcentagemNoAcervo() {
        return this.categoria.porcentagemNoAcervo() * this.getPorcentagemNoAcervo() / 100;
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.categoria.getEstrutura() + "/" + this.getNomeEstrutura();
    }
}
