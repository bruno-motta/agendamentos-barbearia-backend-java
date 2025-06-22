package com.java.barbearia.models;


import com.java.barbearia.models.enuns.Status.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "agendamento_tb")
public class AgendamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_agendamento", nullable = false, length = 36)
    private UUID idAgendamento;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteModel clienteFk;

    @ManyToOne
    @JoinColumn(name = "id_barbeiro", nullable = false)
    private BarbeiroModel barbeiroFk;

    @ManyToOne
    @JoinColumn(name = "id_servico", nullable = false)
    private ServicoModel servicoFk;

    @Column(name = "data_agendamento", nullable = false)
    private LocalDateTime dataHoraAgendamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_agendamento", nullable = false)
    private Status statusAgendamento;

    @Column(name = "comentario_agenamento", nullable = true, length = 254)
    private String comentarioAgendamento;

}
