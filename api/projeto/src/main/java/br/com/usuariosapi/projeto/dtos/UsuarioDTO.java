package br.com.usuariosapi.projeto.dtos;

public class UsuarioDTO {

	private Integer idusuario;

	private String nome;

	private String cpf;

	private String contato;

	private String datanascimento;

	private String sexo;

	private String senha;
	
	private EnderecoDTO endereco;
	
	public UsuarioDTO(Integer idusuario, String nome, String cpf, String contato, String datanascimento, String sexo,
			String senha, EnderecoDTO endereco) {
		super();
		this.idusuario = idusuario;
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
		this.datanascimento = datanascimento;
		this.sexo = sexo;
		this.senha = senha;
		this.endereco = endereco;
	}

	public UsuarioDTO() {
		super();
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
