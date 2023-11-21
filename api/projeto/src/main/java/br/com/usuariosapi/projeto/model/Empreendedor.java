package br.com.usuariosapi.projeto.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * 
 */
@ToString
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Setter
/**
 * @return
 */
@Getter
@Entity
@Table(name = "empreendedor")
public class Empreendedor {

    private static final long serialVersionUID = 1L;

/*
	private static final CascadeType[] CascadeTypeALL = null;*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempreendedor")
	private Integer idempreendedor;

	@Column(name = "nome", length = 200, nullable = true)
	private String nomeemp;
	
	@Column(name = "email", length = 200, nullable = true)
	private String emailemp;

	@Column(name = "cnpj", length = 11, nullable = true)
	private String cnpjemp;

	@Column(name = "contato", length = 15, nullable = true)
	private String contatoemp;

	@Column(name = "tempo de atividade", length = 10, nullable = true)
	private String tempodeatividadeemp;

	@Column(name = "sexo", length = 9, nullable = true)
	private String sexoemp;

	@Column(name = "senha", columnDefinition = "TEXT", nullable = true)
	private String senhaemp;
	

	@OneToOne(mappedBy = "empreendedor", cascade = CascadeType.ALL)
	private Endereco enderecoemp;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
