

public class MeuSistema {

    Produto produto = new Produto();

    
    public void cadastrarProdutoSimples(String nome, double precoVenda,
            String unidade, int quantidadeEmEstoque) {
        
        produto.setNome(nome);
        produto.setPrecoVenda(precoVenda);
        produto.setUnidade(unidade);
        produto.setQuantidadeEmEstoque(quantidadeEmEstoque);

    }

    public String relatorioEstoque() {
        return produto.getNome() + "|" + produto.getPrecoVenda() + "|"
					+ produto.getUnidade() + "|" + produto.getQuantidadeEmEstoque() + ";";
    }

    
}
