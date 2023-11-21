package br.com.usuariosapi.projeto.dtos;

import jakarta.validation.constraints.NotNull;

public class CadastroEmpDTO {
    
    private Integer empreendedor;

	
	
	@NotNull
	private String nomeemp;

	private String cnpjemp;

	private String contatoemp;
	
	private String emailemp;

	private String datanascimentoemp;

	private String sexoemp;

	private String senhaemp;
	
    private Integer idenderecoemp;
	
    private String cepemp;

    private String cidadeemp;
    
    private String municipioemp;

    private String estadoemp;
    
    private String enderecoemp;
    
    private Integer idempresa;

    public Integer getEmpreendedor() {
        return empreendedor;
    }

    public void setEmpreendedor(Integer empreendedor) {
        this.empreendedor = empreendedor;
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

    public String getDatanascimentoemp() {
        return datanascimentoemp;
    }

    public void setDatanascimentoemp(String datanascimentoemp) {
        this.datanascimentoemp = datanascimentoemp;
    }

    public String getSexoemp() {
        return sexoemp;
    }

    public void setSexoemp(String sexoemp) {
        this.sexoemp = sexoemp;
    }

    public String getSenhaemp() {
        return senhaemp;
    }

    public void setSenhaemp(String senhaemp) {
        this.senhaemp = senhaemp;
    }

    public Integer getIdenderecoemp() {
        return idenderecoemp;
    }

    public void setIdenderecoemp(Integer idenderecoemp) {
        this.idenderecoemp = idenderecoemp;
    }

    public String getCepemp() {
        return cepemp;
    }

    public void setCepemp(String cepemp) {
        this.cepemp = cepemp;
    }

    public String getCidadeemp() {
        return cidadeemp;
    }

    public void setCidadeemp(String cidadeemp) {
        this.cidadeemp = cidadeemp;
    }

    public String getMunicipioemp() {
        return municipioemp;
    }

    public void setMunicipioemp(String municipioemp) {
        this.municipioemp = municipioemp;
    }

    public String getEstadoemp() {
        return estadoemp;
    }

    public void setEstadoemp(String estadoemp) {
        this.estadoemp = estadoemp;
    }

    public String getEnderecoemp() {
        return enderecoemp;
    }

    public void setEnderecoemp(String enderecoemp) {
        this.enderecoemp = enderecoemp;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }
}
