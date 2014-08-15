import java.util.ArrayList;
import java.util.List;

public class MeuSistema {

    private List<Produto> produtos = new ArrayList<Produto>();

    public void cadastrarProdutoSimples(String nome, int precoVenda,
            String unidade, int quantidadeEmEstoque) {

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPrecoVenda(precoVenda);
        produto.setUnidade(unidade);
        produto.setQuantidadeEmEstoque(quantidadeEmEstoque);

        produtos.add(produto);
    }

    public String relatorioEstoque() {
        String relatorio = "";
        
        for (Produto produto : produtos) {
            relatorio += produto.getNome() + "|" + produto.getPrecoVenda() + "|"
                    + produto.getUnidade() + "|" + produto.getQuantidadeEmEstoque() + ";";
        }

        return relatorio;
    }

}