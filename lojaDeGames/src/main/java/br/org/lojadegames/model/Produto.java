package br.org.lojadegames.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String produto;
	
	@NotNull
	private String descricao;
	
	@NotNull
	@Positive
	private BigDecimal preco;

	@OneToMany(mappedBy = "rl", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("rl")
	private List<Produto> rl;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProdutp() {
		return produto;
	}

	public void setProdutp(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public List<Produto> getRl() {
		return rl;
	}

	public void setRl(List<Produto> rl) {
		this.rl = rl;
	}
	
	
	
}
