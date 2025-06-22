package com.java.barbearia.models;

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
@Table(name = "cliente_Tb")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente",nullable = false, length = 254)
    private UUID idCliente;

    @Column(name = "nome_cliente",nullable = false, length = 100)
    private String nomeCliente;


    @Column(name = "telefone_cliente", nullable = true, unique = true, length = 15)
    private String telefoneCliente;

    @Column(name = "email_cliente",unique = true, nullable = false, length = 254)
    private String emailCliente;

    @Column(name = "data_cadastro",nullable = false)
    private LocalDateTime dataCadastro = LocalDateTime.now();

}

