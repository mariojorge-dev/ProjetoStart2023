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
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
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

	@Column(name = "nomeemp", length = 200, nullable = true)
	private String nomeemp;

	@Column(name = "emailemp", length = 200, nullable = true)
	private String emailemp;

	@Column(name = "cnpjemp", length = 20, nullable = true)
	private String cnpjemp;

	@Column(name = "contatoemp", length = 15, nullable = true)
	private String contatoemp;

	@Column(name = "senhaemp", columnDefinition = "TEXT", nullable = true)
	private String senhaemp;

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

	public String getNomeemp() {
		return nomeemp;
	}

	public void setNomeemp(String nomeemp) {
		this.nomeemp = nomeemp;
	}

	public String getEmailemp() {
		return emailemp;
	}

	public void setEmailemp(String emailemp) {
		this.emailemp = emailemp;
	}

	public String getCnpjemp() {
		return cnpjemp;
	}

	public void setCnpjemp(String cnpjemp) {
		this.cnpjemp = cnpjemp;
	}

	public String getContatoemp() {
		return contatoemp;
	}

	public void setContatoemp(String contatoemp) {
		this.contatoemp = contatoemp;
	}

	public String getSenhaemp() {
		return senhaemp;
	}

	public void setSenhaemp(String senhaemp) {
		this.senhaemp = senhaemp;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
