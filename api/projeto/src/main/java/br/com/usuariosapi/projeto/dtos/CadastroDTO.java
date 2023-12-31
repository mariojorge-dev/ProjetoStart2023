package br.com.usuariosapi.projeto.dtos;

import br.com.usuariosapi.projeto.model.SexoUser;
import jakarta.validation.constraints.NotNull;

public class CadastroDTO {
	private Integer idusuario;

	
	@NotNull
	private String nome;
	private String cpf;
	private String contato;
	private String email;
	private String datanascimento;
	private SexoUser sexo;
	private String senha;
    private Integer idendereco;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;
    private String endereco;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public SexoUser getSexo() {
		return sexo;
	}

	public void setSexo(SexoUser sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
    
		private String password;
	
		// Getter e Setter para a senha
		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
	
		// Outros atributos e métodos do DTO...
	}

