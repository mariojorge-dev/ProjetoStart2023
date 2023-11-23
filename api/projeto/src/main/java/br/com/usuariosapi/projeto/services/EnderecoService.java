package br.com.usuariosapi.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.usuariosapi.projeto.dtos.EnderecoDTO;
import br.com.usuariosapi.projeto.model.Endereco;
import br.com.usuariosapi.projeto.repositories.IEndereco;


@Service
public class EnderecoService {
	
	@Autowired
	IEndereco iEndereco;
	
	public Endereco salvar(Endereco endereco) {
		
	return iEndereco.save(endereco);
	}
	public Endereco buildendereco(EnderecoDTO endDTO){
		Endereco endereco = new Endereco();
		endereco.setCep(endDTO.getCep());
		endereco.setCidade(endDTO.getCidade());
		endereco.setEndereco(endDTO.getEndereco());
		endereco.setEstado(endDTO.getEstado());
//		endereco.setIdempreendedor(endDTO.getIdempreendedor());
		endereco.setIdendereco(endDTO.getIdendereco());
		return endereco;
	}
}

