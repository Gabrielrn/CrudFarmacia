package com.generation.crudfarmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O nome do produto é obrigatório!")
	@Size(min = 5, max = 100, message = "No minímo 5 e no máximo 100 caracteres")
	private String nome;
	
	@NotNull(message = "A descrição do produto é obrigatório!")
	@Size(min = 5, max = 100, message = "No minímo 5 e no máximo 100 caracteres")
	private String descricao;
	
	@NotNull(message = "Tem em estoque: ")
	private Boolean estoque;
	
	@NotNull(message = "Quantidade do produto: ")
	private Long quantidade;
	
	@NotNull(message = "Preço do produto: ")
	private Double preco;
	
	@UpdateTimestamp
	@JsonFormat(pattern = "dd/MM/yyyy:HH:mm:ss")
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
