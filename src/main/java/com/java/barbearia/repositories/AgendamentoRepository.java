package com.java.barbearia.repositories;

import com.java.barbearia.models.AgendamentoModel;
import com.java.barbearia.models.BarbeiroModel;
import com.java.barbearia.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AgendamentoRepository extends JpaRepository<AgendamentoModel, UUID> {

    List<AgendamentoModel> findByClienteFk(ClienteModel clienteFk);

    List<AgendamentoModel> findByBarbeiroFk(BarbeiroModel barbeiroFK);

    List<AgendamentoModel> findByDataHoraAgendamento(LocalDateTime dataHoraAgendamento);
}
