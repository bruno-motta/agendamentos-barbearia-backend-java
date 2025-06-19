package com.java.barbearia.model;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "barbeiro_tb")
public class BarbeiroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_barbeiro;

    @Column(nullable = false)
    private String nome_barbeiro;

    @Column(nullable = false)
    private String especialida_barbeiro;

    @Column
    private Boolean status = true;

    public UUID getId_barbeiro() {
        return id_barbeiro;
    }

    public void setId_barbeiro(UUID id_barbeiro) {
        this.id_barbeiro = id_barbeiro;
    }

    public String getNome_barbeiro() {
        return nome_barbeiro;
    }

    public void setNome_barbeiro(String nome_barbeiro) {
        this.nome_barbeiro = nome_barbeiro;
    }

    public String getEspecialida_barbeiro() {
        return especialida_barbeiro;
    }

    public void setEspecialida_barbeiro(String especialida_barbeiro) {
        this.especialida_barbeiro = especialida_barbeiro;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
