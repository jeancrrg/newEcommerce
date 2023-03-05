package com.pxt.newEcommerce.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pxt.newEcommerce.domain.pk.ItemPedidoPk;

@Entity
@Table(name = "JEANCRG.TITEMPEDIDO")
public class ItemPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Column(name = "CODITE")
	private ItemPedidoPk codigo;
	@Column(name = "QNTITE")
	private Integer quantidade;
	@Column(name = "PRECITE")
	private BigDecimal preco;
	
	
	public ItemPedido() {
	}


	public ItemPedido(Pedido pedido, Produto produto, Integer quantidade, BigDecimal preco) {
		super();
		codigo.setPedido(pedido);
		codigo.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}

	
	public Pedido getPedido() {
		return codigo.getPedido();
	}
	public void setPedido(Pedido pedido) {
		codigo.setPedido(pedido);
	}
	
	public Produto getProduto() {
		return codigo.getProduto();
	}
	public void setProduto(Produto produto) {
		codigo.setProduto(produto);
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
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
		ItemPedido other = (ItemPedido) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "ItemPedido [codigo=" + codigo + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
}
