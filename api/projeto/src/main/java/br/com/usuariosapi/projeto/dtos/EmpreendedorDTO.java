package br.com.usuariosapi.projeto.dtos;

public class EmpreendedorDTO {

    private Integer idempreendedor;
    private String nome;
    private String cnpj;
    private String contato;
    private String email;
	private String datan;
	private String senha;
	private EnderecoDTO endereco;

    public EmpreendedorDTO(Integer idempreendedor, String nome, String cnpj, String contato, String email, String senha, String datan,  EnderecoDTO endereco) {
        super();
        this.idempreendedor = idempreendedor;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
        this.email = email;
		this.datan = datan;
		this.senha = senha;
		this.endereco = endereco;
    }

    public EmpreendedorDTO() {
        super();
    }

	    public String getDatan() {
		return datan;
	}

	public void setDatan(String datan) {
		this.datan = datan;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}
