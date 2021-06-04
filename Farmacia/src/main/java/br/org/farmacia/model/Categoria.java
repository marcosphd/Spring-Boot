package br.org.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 2, max = 255)
	private String categoria;
	
	@NotNull
	@Size(min = 2, max = 255)
	private String tarja;
	
	@NotNull
	@Size(min = 2, max = 255)
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categiria")
	private List<Produto> produto;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
