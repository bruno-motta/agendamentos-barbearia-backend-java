package com.java.barbearia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private BigDecimal precoServico;

}
