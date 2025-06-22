package com.java.barbearia.repositories;

import com.java.barbearia.models.ServicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ServicoRepository extends JpaRepository<ServicoModel, UUID> {

    Optional<ServicoModel> findByNomeServico(String nomeServico);
}
