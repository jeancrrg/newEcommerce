package com.pxt.newEcommerce.domain;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JEANCRG.TPRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
	@SequenceGenerator(sequenceName = "SEQ_PRODUTO", allocationSize = 1, name = "SEQ_PRODUTO")
    @SequenceGenerator(sequenceName = "SEQ_PRODUTO", allocationSize = 1, name = "SEQ_PRODUTO")
	@Column(name = "CODPROD")
	private Long codigo;
	@Column(name = "DESPROD")
	private String descricao;
	@Column(name = "PRECPROD")
	private BigDecimal preco;
	@Column(name = "ESTPROD")
	private Integer estoque;
	@Column(name = "INDATV")
	private boolean ativo;
	//private Set<Categoria> categorias;
	
	
	public Produto() {
	}

	
	public Produto(Long codigo, String descricao, BigDecimal preco, Integer estoque, boolean ativo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
		this.ativo = ativo;
	}


	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", estoque=" + estoque
				+ ", ativo=" + ativo + "]";
	}
}
