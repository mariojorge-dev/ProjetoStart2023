package br.com.usuariosapi.projeto.model;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")

public class Endereco implements Serializable{
	private static final long serialVersionUID = -5871104523850793420L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idendereco")
    private Integer idendereco;
	
	
    @Column(name = "cep", length = 100, nullable = true)
    private String cep;

    @Column(name = "cidade", length = 100, nullable = true)
    private String cidade;

    @Column(name = "estado", length = 100, nullable = true)
    private String estado;
    
    @Column(name = "municipio", length = 100, nullable = true)
    private String municipio;

    @Column(name = "endereco", length = 100, nullable = true)
    private String endereco;
    
	@OneToOne
    @JoinColumn(name="idusuario")
	@JsonIgnore
    private Usuario usuario;

	@OneToOne
    @JoinColumn(name="idempreendedor")
	@JsonIgnore
    private Empreendedor empreendedor;
    
    public Endereco() {
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

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
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



	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Empreendedor getEmpreendedor() {
		return empreendedor;
	}

	public void setEmpreendedor(Empreendedor empreendedor) {
		this.empreendedor = empreendedor;
	}
	
	
}
