package com.nanuvem.produto.impl;

import java.text.DecimalFormat;

import com.nanuvem.produto.Produto;
import com.nanuvem.produto.Sistema;

public class MeuSistema implements Sistema {

	private Produto produto;

	public void cadastrarProdutoSimples(String nome, double precoVenda,
			String unidade, double quantidadeEmEstoque) {

		produto = new Produto();
		produto.setNome(nome);
		produto.setPrecoVenda(precoVenda);
		produto.setUnidade(unidade);
		produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
	}

	public String relatorioEstoque() {
		
		DecimalFormat df = new DecimalFormat("###.000");  
		String qtdEstoqueFormatada = df.format(produto.getQuantidadeEmEstoque());   
		
		return produto.getNome() + "|" + produto.getPrecoVenda() + "|" + 
				produto.getUnidade() + "|" + qtdEstoqueFormatada;
	}
}