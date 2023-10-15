import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Venda {

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Livro("Bird Box", 29.70, 1, "Suspense", "Josh Malerman"));
        produtos.add(new Livro("Chalk Man", 39.99, 2, "Mistério", "C.J.Tudor"));
        produtos.add(new Eletronico("Geladeira", 3299, 3, "", "Brastemp"));
        produtos.add(new Eletronico("Smart TV", 1851, 4, "", "Samsung"));

        //utilizando API de Stream
        //produtos.stream()
        //.sorted(Comparator.comparing(Produto::getId).reversed())
        //.limit(2)
        // .filter(produto -> produto.getNome().toLowerCase().contains("o"))
        //.filter(produto -> produto.getPreco() > 10)
        //.forEach(System.out::println);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - " + "Preço: " +  produto.getPreco() + "\n" + produto.getDescricao() +"\n");
            //System.out.println(produto.getDescricao());


        }
    }
}



