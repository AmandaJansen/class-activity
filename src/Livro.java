
public class Livro extends Produto {
    public String genero;
    public String autor;

    public Livro(String nome, double preco, int id, String genero, String autor) {
        super(nome, preco, id);
        this.genero = genero;
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return "O gênero deste livro é:  " + genero;
    }



    public String getAutor(){
        return "Este livro tem como autor: " + autor;
    }



}
