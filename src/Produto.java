abstract class Produto {

        private String nome;
        private double preco;

        private int id;

    public Produto(String nome, double preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public abstract String getDescricao();

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }


}

