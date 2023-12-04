package br.com.usuariosapi.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usuariosapi.projeto.dtos.CadastroEmpDTO;
import br.com.usuariosapi.projeto.model.Endereco;
import br.com.usuariosapi.projeto.model.Empreendedor;  // Alteração para Empreendedor
import br.com.usuariosapi.projeto.repositories.IEmpreendedor;  // Alteração para IEmpreendedor

@Service
public class EmpreendedorService {  // Alteração para EmpreendedorService

    @Autowired
    IEmpreendedor iEmpreendedor;  // Alteração para IEmpreendedor

    public Empreendedor salvar(Empreendedor empreendedor) {
        return iEmpreendedor.save(empreendedor);
    }

    public List<Empreendedor> ListaEmpreendedor() {
        return (List<Empreendedor>) iEmpreendedor.findAll();
    }

    public Empreendedor editarEmpreendedor(Empreendedor empreendedor) {
        Empreendedor empreendedorNovo = iEmpreendedor.save(empreendedor);
        return empreendedorNovo;
    }

    public Optional<Empreendedor> excluirEmpreendedor(Integer idempreendedor) {
        Optional<Empreendedor> empreendedor = iEmpreendedor.findById(idempreendedor);
        iEmpreendedor.deleteById(idempreendedor);
        return empreendedor;
    }

    /**
     * Metodo usado para Converter um CadastroDTO para Empreendedor.
     *
     * @param cadastroDTO Dto com os dados endereço e empreendedor.
     */
    @Autowired
    private EmailService emailService;

    public Empreendedor buildEmpreendedor(CadastroEmpDTO cadastroEmpDTO) {
        Empreendedor empreendedor = new Empreendedor();
        Endereco endereco = new Endereco();

        empreendedor.setEndereco(endereco);
        endereco.setEmpreendedor(empreendedor);

        BeanUtils.copyProperties(cadastroEmpDTO, empreendedor);
        BeanUtils.copyProperties(cadastroEmpDTO, endereco);

        emailService.enviarEmailTexto(empreendedor.getEmail(), "Educa Pro Tech", "Seja muito bem-vindo(a) a nossa plataforma, onde a paixão pela tecnologia encontra o aprendizado dinâmico e empolgante! É com grande entusiasmo que damos as boas-vindas a sua empresa.");
        return empreendedor;
    }

    public Empreendedor buscarPorId(Integer id) {
        return iEmpreendedor.findById(id).orElseThrow(() -> new RuntimeException("Empreendedor Não Encontrado"));
    }
}
