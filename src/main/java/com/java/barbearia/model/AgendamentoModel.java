package com.java.barbearia.model;

import com.java.barbearia.model.enuns.Status.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "agendamento_tb")
public class AgendamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_agendamento;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteModel cliente_fk;

    @ManyToOne
    @JoinColumn(name = "id_barbeiro", nullable = false)
    private BarbeiroModel barbeiro_fk;

    @ManyToOne
    @JoinColumn(name = "id_servico", nullable = false)
    private ServicoModel servico_fk;

    @Column(nullable = false)
    private LocalDateTime data_hora_agendamento;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status_agendamento;

    @Column(nullable = true)
    private String Comentario_agendamento;

    public UUID getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(UUID id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public ClienteModel getCliente_fk() {
        return cliente_fk;
    }

    public void setCliente_fk(ClienteModel cliente_fk) {
        this.cliente_fk = cliente_fk;
    }

    public BarbeiroModel getBarbeiro_fk() {
        return barbeiro_fk;
    }

    public void setBarbeiro_fk(BarbeiroModel barbeiro_fk) {
        this.barbeiro_fk = barbeiro_fk;
    }

    public ServicoModel getServico_fk() {
        return servico_fk;
    }

    public void setServico_fk(ServicoModel servico_fk) {
        this.servico_fk = servico_fk;
    }

    public LocalDateTime getData_hora_agendamento() {
        return data_hora_agendamento;
    }

    public void setData_hora_agendamento(LocalDateTime data_hora_agendamento) {
        this.data_hora_agendamento = data_hora_agendamento;
    }

    public Status getStatus_agendamento() {
        return status_agendamento;
    }

    public void setStatus_agendamento(Status status_agendamento) {
        this.status_agendamento = status_agendamento;
    }

    public String getComentario_agendamento() {
        return Comentario_agendamento;
    }

    public void setComentario_agendamento(String comentario_agendamento) {
        Comentario_agendamento = comentario_agendamento;
    }
}
