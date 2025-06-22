package com.java.barbearia.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "barbeiro_tb")
public class BarbeiroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_barbeiro", nullable = false, length = 36)
    private UUID idBarbeiro;

    @Column(name = "nome_barbeiro",nullable = false, length = 100)
    private String nomeBarbeiro;

    @Column(name = "especialidade_barbeiro",nullable = false, length = 254)
    private String especialidadeBarbeiro;

    @Column(name = "status_barbeiro",nullable = false)
    private Boolean statusBarbeiro = true;
    
    @Column(name = "telefone_barbeiro", unique = true, nullable = false, length = 15)
    private String telefoneBarbeiro;

    @Column(name = "email_barbeiro", unique = true, nullable = false, length = 254)
    private String emailBarbeiro;

    public UUID getIdBarbeiro() {
        return idBarbeiro;
    }

    public void setIdBarbeiro(UUID idBarbeiro) {
        this.idBarbeiro = idBarbeiro;
    }

    public String getNomeBarbeiro() {
        return nomeBarbeiro;
    }

    public void setNomeBarbeiro(String nomeBarbeiro) {
        this.nomeBarbeiro = nomeBarbeiro;
    }

    public String getEspecialidadeBarbeiro() {
        return especialidadeBarbeiro;
    }

    public void setEspecialidadeBarbeiro(String especialidadeBarbeiro) {
        this.especialidadeBarbeiro = especialidadeBarbeiro;
    }

    public Boolean getStatusBarbeiro() {
        return statusBarbeiro;
    }

    public void setStatusBarbeiro(Boolean statusBarbeiro) {
        this.statusBarbeiro = statusBarbeiro;
    }

    public String getTelefoneBarbeiro() {
        return telefoneBarbeiro;
    }

    public void setTelefoneBarbeiro(String telefoneBarbeiro) {
        this.telefoneBarbeiro = telefoneBarbeiro;
    }

    public String getEmailBarbeiro() {
        return emailBarbeiro;
    }

    public void setEmailBarbeiro(String emailBarbeiro) {
        this.emailBarbeiro = emailBarbeiro;
    }
}
