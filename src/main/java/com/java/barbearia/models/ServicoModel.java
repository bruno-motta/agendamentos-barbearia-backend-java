package com.java.barbearia.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "servico_tb")
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_servico", nullable = false, length = 36)
    private UUID idServico;

    @Column(name = "nome_servico",nullable = false, length = 50)
    private String nomeServico;

    @Column(name = "duracao_servico",nullable = false)
    private Integer duracaoServico;

    @Column(name = "preco_servico", nullable = false, precision = 19, scale = 2)
    private BigDecimal preco_servico;

    public UUID getIdServico() {
        return idServico;
    }

    public void setIdServico(UUID idServico) {
        this.idServico = idServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Integer getDuracaoServico() {
        return duracaoServico;
    }

    public void setDuracaoServico(Integer duracaoServico) {
        this.duracaoServico = duracaoServico;
    }

    public BigDecimal getPreco_servico() {
        return preco_servico;
    }

    public void setPreco_servico(BigDecimal preco_servico) {
        this.preco_servico = preco_servico;
    }
}
