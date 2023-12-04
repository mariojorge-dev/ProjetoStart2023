package br.com.usuariosapi.projeto.dtos;

public class EnderecoDTO {

    private Integer idendereco;
	
    private String cep;

	private String bairro;

    private String cidade;

    private String estado;

    private String endereco;

    private Integer idempreendedor;

    private Integer idusuario;

	public EnderecoDTO(Integer idendereco, String cep, String bairro, String cidade, String estado, String endereco, Integer idempreendedor,
			Integer idusuario) {
		super();
		this.idendereco = idendereco;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		this.idempreendedor = idempreendedor;
		this.idusuario = idusuario;
	}

	public EnderecoDTO() {
		super();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
    
    
	
}
