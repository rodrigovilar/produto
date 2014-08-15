import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MeuSistemaTest {
    
    @Test
	public void cadastroProdutoSimples() {
		MeuSistema sistema = new MeuSistema();
		sistema.cadastrarProdutoSimples("Trigo", 15, "kg", 500);
		
		String relatorioEstoqueEsperado = "Trigo|15|kg|500;";
		
		assertEquals(relatorioEstoqueEsperado, sistema.relatorioEstoque());
	}
	
	@Test
	public void cadastroProdutosSimples() {
		MeuSistema sistema = new MeuSistema();
		sistema.cadastrarProdutoSimples("Trigo", 15, "kg", 500);
		sistema.cadastrarProdutoSimples("Laranja", 3, "kg", 100);
		
		String relatorioEstoqueEsperado = "Trigo|15|kg|500;"
				+ "Laranja|3|kg|100;";
		
		assertEquals(relatorioEstoqueEsperado, sistema.relatorioEstoque());
	}
}
