
public class Produto {
	private String nome;
	private Double preco;
	private String descricao;
	private Categoria categoria;
	private Integer QuantidadeEstoque;
	
	
	public Produto(String nome, Double preco, String descricao, Categoria categoria, Integer quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.categoria = categoria;
		QuantidadeEstoque = quantidadeEstoque;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
