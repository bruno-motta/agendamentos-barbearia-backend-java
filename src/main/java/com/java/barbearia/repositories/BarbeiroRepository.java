package com.java.barbearia.repositories;

import com.java.barbearia.models.BarbeiroModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BarbeiroRepository extends JpaRepository<BarbeiroModel, UUID> {

    ;

}
