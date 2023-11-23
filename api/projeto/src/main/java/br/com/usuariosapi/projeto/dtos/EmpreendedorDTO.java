package br.com.usuariosapi.projeto.dtos;

public class EmpreendedorDTO {

    private Integer idempreendedor;
    private String nomeemp;
    private String cnpjemp;
    private String contatoemp;
    private String emailemp;
    private String senhaemp;
	private EnderecoDTO endereco;

    public EmpreendedorDTO(Integer idempreendedor, String nomeemp, String cnpjemp, String contatoemp, String emailemp, String senhaemp, EnderecoDTO endereco) {
        super();
        this.idempreendedor = idempreendedor;
        this.nomeemp = nomeemp;
        this.cnpjemp = cnpjemp;
        this.contatoemp = contatoemp;
        this.emailemp = emailemp;
        this.senhaemp = senhaemp;
		this.endereco = endereco;
    }

    public EmpreendedorDTO() {
        super();
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

	public String getSenhaemp() {
		return senhaemp;
	}

	public void setSenhaemp(String senhaemp) {
		this.senhaemp = senhaemp;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}
