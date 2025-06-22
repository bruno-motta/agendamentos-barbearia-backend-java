package com.java.barbearia.repositories;

import com.java.barbearia.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {

    Optional<ClienteModel> findByEmailCliente(String emailCliente);

    Optional<ClienteModel> findByTelefoneCliente(String telefoneCliente);


    List<ClienteModel> findByNomeCliente(String nomeCliente);


}
