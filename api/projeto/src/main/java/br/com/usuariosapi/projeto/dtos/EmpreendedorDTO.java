package br.com.usuariosapi.projeto.dtos;

public class EmpreendedorDTO {

    private Integer idempreendedor;
    private String nomeemp;
    private String cnpjemp;
    private String contatoemp;
    private String tempoAtividadeemp;
    private String emailemp;
    private String cepemp;
    private String estadoemp;
    private String cidadeemp;
    private String municipioemp;
    private String enderecoemp;
    private String senhaemp;
    private String sexoemp;

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

    public String getTempoAtividadeemp() {
        return tempoAtividadeemp;
    }

    public void setTempoAtividadeemp(String tempoAtividadeemp) {
        this.tempoAtividadeemp = tempoAtividadeemp;
    }

    public String getEmailemp() {
        return emailemp;
    }

    public void setEmailemp(String emailemp) {
        this.emailemp = emailemp;
    }

    public String getCepemp() {
        return cepemp;
    }

    public void setCepemp(String cepemp) {
        this.cepemp = cepemp;
    }

    public String getEstadoemp() {
        return estadoemp;
    }

    public void setEstadoemp(String estadoemp) {
        this.estadoemp = estadoemp;
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

    public String getEnderecoemp() {
        return enderecoemp;
    }

    public void setEnderecoemp(String enderecoemp) {
        this.enderecoemp = enderecoemp;
    }

    public String getSenhaemp() {
        return senhaemp;
    }

    public void setSenhaemp(String senhaemp) {
        this.senhaemp = senhaemp;
    }

    public String getSexoemp() {
        return sexoemp;
    }

    public void setSexoemp(String sexoemp) {
        this.sexoemp = sexoemp;
    }

    public EmpreendedorDTO(Integer idempreendedor, String nomeemp, String cnpjemp, String contatoemp, String tempoAtividadeemp,
            String emailemp, String cepemp, String estadoemp, String cidadeemp, String municipioemp, String enderecoemp, String senhaemp,
            String sexoemp) {
        super();
        this.idempreendedor = idempreendedor;
        this.nomeemp = nomeemp;
        this.cnpjemp = cnpjemp;
        this.contatoemp = contatoemp;
        this.tempoAtividadeemp = tempoAtividadeemp;
        this.emailemp = emailemp;
        this.cepemp = cepemp;
        this.estadoemp = estadoemp;
        this.cidadeemp = cidadeemp;
        this.municipioemp = municipioemp;
        this.enderecoemp = enderecoemp;
        this.senhaemp = senhaemp;
        this.sexoemp = sexoemp;
        
    }

    public EmpreendedorDTO() {
        super();
    }


}
