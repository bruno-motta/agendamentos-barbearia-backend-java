package com.java.barbearia.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

}
