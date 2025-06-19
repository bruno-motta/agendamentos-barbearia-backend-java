package com.java.barbearia.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "servico_tb")
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_servico;

    @Column(nullable = false)
    private String nome_servico;

    @Column(nullable = false)
    private Integer duracao_servico;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal preco_servico;

    public UUID getId_servico() {
        return id_servico;
    }

    public void setId_servico(UUID id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public Integer getDuracao_servico() {
        return duracao_servico;
    }

    public void setDuracao_servico(Integer duracao_servico) {
        this.duracao_servico = duracao_servico;
    }

    public BigDecimal getPreco_servico() {
        return preco_servico;
    }

    public void setPreco_servico(BigDecimal preco_servico) {
        this.preco_servico = preco_servico;
    }
}
