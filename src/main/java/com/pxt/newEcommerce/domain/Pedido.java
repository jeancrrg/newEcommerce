package com.pxt.newEcommerce.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.pxt.newEcommerce.domain.enums.StatusPedido;

@Entity
@Table(name = "JEANCRG.TPEDIDO")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PEDIDO")
	@SequenceGenerator(sequenceName = "SEQ_PEDIDO", allocationSize = 1, name = "SEQ_PEDIDO")
	@Column(name = "CODPED")
	private Long codigo;
	@Column(name = "DATPED")
	private LocalDateTime data;
	@Column(name = "CODSTA")
	private Integer status;
	
	@ManyToOne()
	@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI")
	private Cliente cliente;
	@Column(name = "CODFIL")
	private Integer codigoFilial;
	@Column(name = "CODPAG")
	private Integer codigoPagamaneto;
	@Column(name = "TOTPED")
	private BigDecimal total;
	
	@OneToMany(mappedBy = "codigo.pedido")
	Set<ItemPedido> itens = new HashSet<>();
	
	public Pedido() {
	}


	public Pedido(Long codigo, LocalDateTime data, StatusPedido status, Cliente cliente, Integer codigoFilial,
			Integer codigoPagamaneto, BigDecimal total) {
		super();
		this.codigo = codigo;
		this.data = data;
		setStatus(status);
		this.cliente = cliente;
		this.codigoFilial = codigoFilial;
		this.codigoPagamaneto = codigoPagamaneto;
		this.total = total;
	}


	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return StatusPedido.retornarStatus(status);
	}
	public void setStatus(StatusPedido statusPedido) {
		if(statusPedido != null) {
			this.status = statusPedido.getCodigo();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getCodigoFilial() {
		return codigoFilial;
	}
	public void setCodigoFilial(Integer codigoFilial) {
		this.codigoFilial = codigoFilial;
	}

	public Integer getCodigoPagamaneto() {
		return codigoPagamaneto;
	}
	public void setCodigoPagamaneto(Integer codigoPagamaneto) {
		this.codigoPagamaneto = codigoPagamaneto;
	}

	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
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
		Pedido other = (Pedido) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", data=" + data + ", status=" + status + ", cliente=" + cliente
				+ ", codigoFilial=" + codigoFilial + ", codigoPagamaneto=" + codigoPagamaneto + ", total=" + total
				+ "]";
	}
}
