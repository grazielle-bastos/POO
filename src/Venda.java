import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// A classe representa o mundo real com objetos.

public class Venda {
	
	private Long id;
	
	private String descricaoVenda;
	
	private String nomeCliente;
	
	private String enderecoEntrega;
	
	// Objeto agrupa as informações e representa o mundo real com atributos. Grava no banco, gerar um relatório, enviar para algum WebService, fazer integração, gerar nota fiscal, manipular, ou gerar alguma informação.
	
	private BigDecimal valorTotal;
	
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void addProduto (Produto produto) {
		this.listaProdutos.add(produto); //Faz referência a lista de produtos. É utilizado para validações/regras.
	}
	
	private double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue(); //cálculo do total sendo executado na classe Venda, e atribuído à variável ValorTotal, para retornar o seu valor na classe main
		}
//		this.valorTotal = BigDecimal.valueOf(total);
		
		return total;
	}
	
	//get - recupera os dados para dentro da variável
	public Long getId() {
		return id;
	}

	//set - seta/joga os dados para dentro deste objeto
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	//Retorna todos os atributos e valores do objeto Venda
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}
	
}
