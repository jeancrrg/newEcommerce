package com.pxt.newEcommerce.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JEANCRG.TCLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTE")
	@SequenceGenerator(sequenceName = "SEQ_CLIENTE", allocationSize = 1, name = "SEQ_CLIENTE")
    @SequenceGenerator(sequenceName = "SEQ_CLIENTE", allocationSize = 1, name = "SEQ_CLIENTE")
	@Column(name = "CODCLI")
	private Long codigo;
	@Column(name = "DESNOM")
	private String nome;
	@Column(name = "NUMCNPJ")
	private String cnpj;
	@Column(name = "DESEMA")
	private String email;
	@Column(name = "NUMTEL")
	private String telefone;
	@Column(name = "DESCID")
	private String cidade;
	@Column(name = "DATCAD")
	private LocalDateTime dataCadastro;
	@Column(name = "INDATV")
	private boolean ativo;
	
	
	public Cliente() {
	}


	public Cliente(Long codigo, String nome, String cnpj, String email, String telefone, String cidade,
			LocalDateTime dataCadastro, boolean ativo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.dataCadastro = dataCadastro;
		this.ativo = ativo;
	}


	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cnpj=" + cnpj + ", email=" + email + ", telefone="
				+ telefone + ", cidade=" + cidade + ", dataCadastro=" + dataCadastro + ", ativo=" + ativo + "]";
	}
}
