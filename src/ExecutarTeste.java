import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		// Main é o método que executa o código, no desktop o start inicial é dentro do main.
		//Transforma as classes em um objeto na tela.
		
		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação a Objetos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		//Precisa de duas instancias, com a referência diferente na memória, para ter dois objetos
		Produto produto2 = new Produto();
		produto2.setNome("Módulo de Spring Boot API REST");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setNome("Módulo de Angular 8");
		produto3.setId(3L);
		produto3.setValor(BigDecimal.valueOf(100));
		
		Produto produto4 = new Produto();
		produto4.setNome("Módulo de Hibernate");
		produto4.setId(3L);
		produto4.setValor(BigDecimal.valueOf(300));
		
		//Instancia a o objeto Venda para existir na memória.
		Venda venda = new Venda();
		
		//Setar os atributos da venda, para representar os dados da venda pelo objeto:
		venda.setDescricaoVenda("Venda Curso Formação Java");
		
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		
		venda.setId(10L);
		
		venda.setNomeCliente("Alex Fernando");
		
		//2 objetos venda criados, com dois produtos
		//Forma de chamar a lista direto pelo método main na própria classe executável
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); //Desta forma não é possível fazer validações. Chama a lista e add dentro dela.
		
		//Forma de chamar a lista pelo método da Classe do objeto Venda
		venda.addProduto(produto3); //Faz validações antes de adicionar na lista, chamando o método da classe Venda.
		venda.addProduto(produto4);
		
//		for (Produto produto : venda.getListaProdutos()) {
//			System.out.println("Descrição Produto" + produto);
//		}
//
////		System.out.println("Descrição Venda: " + venda.getDescricaoVenda());
////		
////		System.out.println("Endereço Venda: " + venda.getEnderecoEntrega());
//		
//		System.out.println("Descrição e demais dados da venda: " + venda);
		
//		System.out.println("Descrição da Venda: " 
//		+ venda.getDescricaoVenda() + " " + "e o valor total: " + venda.totalVenda());
		
		System.out.println("Valor da variável total: " + venda.getValorTotal());
		
	}

}
