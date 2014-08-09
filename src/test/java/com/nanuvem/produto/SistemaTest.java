package com.nanuvem.produto;

import org.junit.Assert;
import org.junit.Test;


public class SistemaTest {
	
	
	
	@Test
	public void cadastroProdutoSimples() {
		Sistema sistema = new Sistema();
		sistema.cadastrarProdutoSimples("Trigo", 15.33, "kg", 500);
		
		String relatorioEstoqueEsperado = "Trigo|15.33|kg|500.000;";
		
		Assert.assertEquals(relatorioEstoqueEsperado, sistema.relatorioEstoque());
	}
	
	@Test
	public void cadastroProdutosSimples() {
		Sistema sistema = new Sistema();
		sistema.cadastrarProdutoSimples("Trigo", 15.33, "kg", 500);
		sistema.cadastrarProdutoSimples("Laranja", 3.05, "kg", 100);
		
		String relatorioEstoqueEsperado = "Trigo|15.33|kg|500.000;"
				+ "Laranja|3.05|kg|100.000;";
		
		Assert.assertEquals(relatorioEstoqueEsperado, sistema.relatorioEstoque());
	}

}
