public class Fantasia extends CategoriaDecorator{

    public Fantasia(Categoria categoria){
        super(categoria);
    }

    public float getPorcentagemNoAcervo() {
        return 20.0f;
    }


    public String getNomeEstrutura() {
        return "Fantasia";
    }
}
