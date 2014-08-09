package com.nanuvem.produto;

public interface Sistema {

	void cadastrarProdutoSimples(String nome, double precoVenda,
			String unidade, double quantidadeEmEstoque);

	String relatorioEstoque();

}
