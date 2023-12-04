package br.com.usuariosapi.projeto.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "empreendedor")
public class Empreendedor implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * private static final CascadeType[] CascadeTypeALL = null;
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempreendedor")
	private Integer idempreendedor;

	@Column(name = "nome", length = 200, nullable = false)
	private String nome;

	@Column(name = "email", length = 200, nullable = false, unique = true)
	private String email;

	@Column(name = "cnpj", length = 20, nullable = false, unique = true)
	private String cnpj;

	@Column(name = "datan", length = 15, nullable = true)
	private String datan;

	@Column(name = "contato", length = 15, nullable = false)
	private String contato;

	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;

	@OneToOne(mappedBy = "empreendedor", cascade = CascadeType.ALL)
	private Endereco endereco;

	public Empreendedor() {

	}

	public Integer getIdempreendedor() {
		return idempreendedor;
	}

	public void setIdempreendedor(Integer idempreendedor) {
		this.idempreendedor = idempreendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpjemp(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDatan() {
		return datan;
	}
	
	public void setDatan(String datan) {
		this.datan = datan;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
