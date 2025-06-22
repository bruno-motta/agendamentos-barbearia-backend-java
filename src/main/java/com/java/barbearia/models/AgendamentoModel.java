package com.java.barbearia.models;


import com.java.barbearia.models.enuns.Status.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

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

    @Column(name = "comentario_agenamento",nullable = true, length = 254)
    private String comentarioAgendamento;

    public UUID getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(UUID idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public ClienteModel getClienteFk() {
        return clienteFk;
    }

    public void setClienteFk(ClienteModel clienteFk) {
        this.clienteFk = clienteFk;
    }

    public BarbeiroModel getBarbeiroFk() {
        return barbeiroFk;
    }

    public void setBarbeiroFk(BarbeiroModel barbeiroFk) {
        this.barbeiroFk = barbeiroFk;
    }

    public ServicoModel getServicoFk() {
        return servicoFk;
    }

    public void setServicoFk(ServicoModel servicoFk) {
        this.servicoFk = servicoFk;
    }

    public LocalDateTime getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(LocalDateTime dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }

    public Status getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(Status statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    public String getComentarioAgendamento() {
        return comentarioAgendamento;
    }

    public void setComentarioAgendamento(String comentarioAgendamento) {
        this.comentarioAgendamento = comentarioAgendamento;
    }
}
