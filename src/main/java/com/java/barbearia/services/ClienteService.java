package com.java.barbearia.services;

import com.java.barbearia.models.ClienteModel;
import com.java.barbearia.repositories.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {


    private final ClienteRepository clienteRepository;

    public ClienteModel criarCliente(ClienteModel cliente){
        if(clienteRepository.findByEmailCliente(cliente.getEmailCliente()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        if(clienteRepository.findByTelefoneCliente(cliente.getTelefoneCliente()).isPresent()){
            throw new RuntimeException("Telefone já cadastrado");
        }
        cliente.setDataCadastro(LocalDateTime.now());
        return  clienteRepository.save(cliente);
    }

    public ClienteModel buscarPorID(UUID id){
        return clienteRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID não encontrado")
        );
    }

    public ClienteModel buscarClientePorEmail(String email){
        return clienteRepository.findByEmailCliente(email).orElseThrow(
                ()-> new RuntimeException("Email não encontrado")
        );
    }

    public ClienteModel buscarPorTelefone(String telefone){
        return clienteRepository.findByTelefoneCliente(telefone).orElseThrow(
                ()-> new RuntimeException("Telefone não encontrado")
        );
    }


    public ClienteModel atualizarCliente(UUID id, String novoEmail, String novoTelefone){
        ClienteModel clienteExistente = buscarPorID(id);
        Optional<ClienteModel> clienteComMesmoEmail = clienteRepository.findByEmailCliente(novoEmail);

        if(clienteComMesmoEmail.isPresent()){
            ClienteModel clienteEmailAchado = clienteComMesmoEmail.get();
            if (!clienteEmailAchado.getIdCliente().equals(id)){
                throw new RuntimeException("Email já cadastrado");
            }
        }
        Optional<ClienteModel> clienteComMesmoTelefone = clienteRepository.findByTelefoneCliente(novoTelefone);
        if(clienteComMesmoTelefone.isPresent()){
            ClienteModel clienteTelefoneAchado = clienteComMesmoTelefone.get();
            if(!clienteTelefoneAchado.getIdCliente().equals(id)){
                throw new RuntimeException("Telefone já cadastrado");
            }

        }

        clienteExistente.setEmailCliente(novoEmail);
        clienteExistente.setTelefoneCliente(novoTelefone);
        return clienteRepository.save(clienteExistente);
    }

    public void deletarCleientePorEmail(String emailCliente){
        ClienteModel cliente = clienteRepository.findByEmailCliente(emailCliente).orElseThrow(
                ()-> new RuntimeException("Cliente não encontrado, ou email incorreto.")
        );
        clienteRepository.deleteByEmailCliente(emailCliente);
    }





}
