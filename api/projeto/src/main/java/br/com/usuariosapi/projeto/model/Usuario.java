package br.com.usuariosapi.projeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "usuarios")
public class Usuario extends LoginModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * private static final CascadeType[] CascadeTypeALL = null;
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private Integer idusuario;

	@Column(name = "nome", length = 200, nullable = false, unique = true)
	private String nome;

	@Column(name = "email", length = 200, nullable = false, unique = true)
	private String email;

	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	private String cpf;

	@Column(name = "contato", length = 15, nullable = false)
	private String contato;

	@Column(name = "datanascimento", length = 10, nullable = false)
	private String datanascimento;

	@Column(name = "sexo", length = 9, nullable = true)
	private String sexo;

	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;

	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
	private Endereco endereco;

	public Usuario() {

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void setDatanascimento(String datan) {
		this.datanascimento = datan;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}