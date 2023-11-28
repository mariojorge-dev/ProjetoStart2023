package br.com.usuariosapi.projeto.dtos;

import jakarta.validation.constraints.NotNull;

public class CadastroEmpDTO {
    private Integer idempreendedor;
	
	
	@NotNull
	private String nomeemp;
	private String cnpjemp;
	private String contatoemp;
	private String emailemp;
	private String datanemp;
	private String senhaemp;
    private Integer idendereco;
    private String cep;
    private String cidade;
    private String municipio;
    private String estado;
    private String endereco;
    private String idusuario;
 
    public Integer getIdempreemdedor() {
		return idempreendedor;
	}

	public void setIdempreemdedor(Integer idempreendedor) {
		this.idempreendedor = idempreendedor;
	}

	public String getNomeemp() {
		return nomeemp;
	}

	public void setNomeemp(String nomeemp) {
		this.nomeemp = nomeemp;
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

	public String getEmailemp() {
		return emailemp;
	}

	public void setEmailemp(String emailemp) {
		this.emailemp = emailemp;
	}

	public String getDatanemp() {
		return datanemp;
	}

	public void setDatanemp(String datanemp) {
		this.datanemp = datanemp;
	}

	public String getSenhaemp() {
		return senhaemp;
	}

	public void setSenhaemp(String senhaemp) {
		this.senhaemp = senhaemp;
	}

	public Integer getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdempreendedor() {
		return idempreendedor;
	}

	public void setIdempreendedor(Integer idempreendedor) {
		this.idempreendedor = idempreendedor;
	}

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}
	

}